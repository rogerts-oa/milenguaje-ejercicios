package com.example;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Objects;

import com.example.JuniorParser.*;
import com.example.Value.Type;
import org.antlr.v4.runtime.ParserRuleContext;

/** Semantic visitor and small interpreter for the Junior grammar. */
public class JuniorCustomVisitor extends JuniorBaseVisitor<Value> {

    private static final class Device {
        final String kind;
        Device(String kind) { this.kind = kind; }
    }

    public final HashMap<String, Value> tablaSimbolos = new HashMap<>();
    private final HashMap<String, HashMap<String, Device>> rooms = new HashMap<>();
    private HashMap<String, Device> currentRoom;

    private RuntimeException error(ParserRuleContext ctx, String message) {
        return new RuntimeException("Error semántico (línea " + ctx.getStart().getLine() + ", columna "
                + (ctx.getStart().getCharPositionInLine() + 1) + "): " + message);
    }
    private Value require(ParserRuleContext ctx, Value v, Type expected, String purpose) {
        if (v == null) throw error(ctx, purpose + " requiere " + expected + "; se obtuvo vacío");
        if (v.type != expected) throw error(ctx, purpose + " requiere " + expected + "; se obtuvo " + v.type);
        return v;
    }
    private Value getVariable(ParserRuleContext ctx, String name) {
        Value variable = tablaSimbolos.get(name);
        if (variable == null) throw error(ctx, "variable '" + name + "' no declarada");
        return variable;
    }
    private boolean truth(Value v) { return (Boolean) v.value; }
    private String unescape(String s) {
        String body = s.substring(1, s.length() - 1);
        return body.replace("\\n", "\n").replace("\\r", "\r").replace("\\t", "\t").replace("\\#", "#").replace("\\\\", "\\");
    }

    @Override public Value visitProgram(ProgramContext ctx) {
        System.out.println("Programa Junior: " + ctx.TEXTWERT().getText());
        visit(ctx.block());
        return null;
    }
    @Override public Value visitBlock(BlockContext ctx) {
        for (StatementContext s : ctx.statement()) visit(s);
        return null;
    }
    @Override public Value visitStatement(StatementContext ctx) {
        if (ctx.roomDeclaration() != null) {
            return visit(ctx.roomDeclaration());
        } else if (ctx.variableDeclaration() != null) {
            return visit(ctx.variableDeclaration());
        } else if (ctx.assignment() != null) {
            return visit(ctx.assignment());
        } else if (ctx.decision() != null) {
            return visit(ctx.decision());
        } else if (ctx.repetition() != null) {
            return visit(ctx.repetition());
        } else if (ctx.automation() != null) {
            return visit(ctx.automation());
        } else if (ctx.deviceAction() != null) {
            return visit(ctx.deviceAction());
        } else if (ctx.notification() != null) {
            return visit(ctx.notification());
        }
        return null;
    }
    @Override public Value visitRoomDeclaration(RoomDeclarationContext ctx) {
        String name = ctx.KENNUNG().getText();
        if (rooms.containsKey(name)) throw error(ctx, "la habitación '" + name + "' ya fue declarada");
        HashMap<String, Device> room = new HashMap<>();
        rooms.put(name, room);
        HashMap<String, Device> previous = currentRoom;
        currentRoom = room;
        for (DeviceDeclarationContext d : ctx.deviceDeclaration()) visit(d);
        currentRoom = previous;
        return null;
    }
    @Override public Value visitDeviceDeclaration(DeviceDeclarationContext ctx) {
        String name = ctx.KENNUNG().getText();
        if (currentRoom == null) throw error(ctx, "los dispositivos deben declararse dentro de una habitación");
        if (currentRoom.containsKey(name)) throw error(ctx, "dispositivo duplicado '" + name + "' en la habitación");
        Device device = new Device(visit(ctx.deviceKind()).value.toString().toLowerCase());
        currentRoom.put(name, device);
        return null;
    }
    @Override public Value visitDeviceKind(DeviceKindContext ctx) {
        return new Value(Type.MELDUNG, ctx.getText());
    }
    @Override public Value visitDataType(DataTypeContext ctx) {
        if (ctx.PEGEL() != null) return new Value(Type.PEGEL, null);
        if (ctx.MELDUNG() != null) return new Value(Type.MELDUNG, null);
        if (ctx.SCHALTZUSTAND() != null) return new Value(Type.SCHALTZUSTAND, null);
        return new Value(Type.ZEITPUNKT, null);
    }
    @Override public Value visitVariableDeclaration(VariableDeclarationContext ctx) {
        String id = ctx.KENNUNG().getText();
        if (tablaSimbolos.containsKey(id)) throw error(ctx, "la variable '" + id + "' ya fue declarada");
        Type type = visit(ctx.dataType()).type;
        Value initial = new Value(type, null);
        if (ctx.expression() != null) {
            initial = visit(ctx.expression());
            if (initial.type != type) throw error(ctx, "no se puede inicializar " + type + " con " + initial.type);
        }
        Value variable = new Value(id, type, initial.value);
        tablaSimbolos.put(id, variable);
        return variable;
    }
    @Override public Value visitAssignment(AssignmentContext ctx) {
        String id = ctx.KENNUNG().getText();
        Value old = getVariable(ctx, id);
        Value value = visit(ctx.expression());
        if (old.type != value.type) throw error(ctx, "no se puede asignar " + value.type + " a " + old.type + " ('" + id + "')");
        Value variable = new Value(id, old.type, value.value);
        tablaSimbolos.put(id, variable);
        return variable;
    }
    @Override public Value visitDecision(DecisionContext ctx) {
        Value condition = require(ctx, visit(ctx.expression(0)), Type.SCHALTZUSTAND, "la condición de lage");
        if (truth(condition)) {
            visit(ctx.block(0));
        } else {
            Value alternate = require(ctx, visit(ctx.expression(1)), Type.SCHALTZUSTAND, "la condición de zweig");
            if (truth(alternate)) {
                visit(ctx.block(1));
            } else {
                visit(ctx.block(2));
            }
        }
        return null;
    }
    @Override public Value visitRepetition(RepetitionContext ctx) {
        Value c = require(ctx, visit(ctx.expression()), Type.SCHALTZUSTAND, "la condición de regelkreis");
        // Repetition is intentionally bounded against accidental infinite programs.
        int iterations = 0;
        while (truth(c)) {
            if (++iterations > 100000) throw error(ctx, "el regelkreis superó 100000 iteraciones");
            visit(ctx.block());
            c = require(ctx, visit(ctx.expression()), Type.SCHALTZUSTAND, "la condición de regelkreis");
        }
        return null;
    }
    @Override public Value visitAutomation(AutomationContext ctx) { visit(ctx.eventSource()); visit(ctx.block()); return null; }
    @Override public Value visitEventSource(EventSourceContext ctx) {
        if (ctx.deviceReference() != null) {
            Device d = resolve(ctx.deviceReference());
            String event = visit(ctx.eventKind()).value.toString().toLowerCase();
            String k = d.kind;
            boolean valid = false;
            if (event.equals("bewegung") && k.equals("sensor")) valid = true;
            else if ((event.equals("geoeffnet") || event.equals("geschlossen")) && k.equals("tuer")) valid = true;
            else if (event.equals("warnung") && (k.equals("alarm") || k.equals("sensor"))) valid = true;
            else if (event.equals("temperatur") && (k.equals("klima") || k.equals("sensor"))) valid = true;
            if (!valid) throw error(ctx, "evento '" + event + "' no es compatible con dispositivo tipo '" + k + "'");
            if (ctx.comparison() != null) {
                String comparison = visit(ctx.comparison()).value.toString();
                Value rhs = visit(ctx.expression());
                if (!event.equals("temperatur")) throw error(ctx, "el evento " + event + " no admite la comparación " + comparison);
                if (rhs.type != Type.PEGEL) throw error(ctx, "la comparación de evento temperatura requiere pegel");
            }
        } else {
            LocalTime.parse(ctx.UHRZEITWERT().getText());
        }
        return null;
    }
    @Override public Value visitEventKind(EventKindContext ctx) {
        return new Value(Type.MELDUNG, ctx.getText());
    }
    @Override public Value visitComparison(ComparisonContext ctx) {
        return new Value(Type.MELDUNG, ctx.getText());
    }
    @Override public Value visitDeviceReference(DeviceReferenceContext ctx) {
        resolve(ctx); return null;
    }
    private Device resolve(DeviceReferenceContext ctx) {
        String room = ctx.KENNUNG(0).getText(), device = ctx.KENNUNG(1).getText();
        HashMap<String, Device> contents = rooms.get(room);
        if (contents == null) throw error(ctx, "habitación '" + room + "' no declarada");
        Device found = contents.get(device);
        if (found == null) throw error(ctx, "dispositivo '" + device + "' no existe en habitación '" + room + "'");
        return found;
    }
    @Override public Value visitDeviceAction(DeviceActionContext ctx) { visit(ctx.targets()); return null; }
    @Override public Value visitTargets(TargetsContext ctx) {
        for (DeviceReferenceContext ref : ctx.deviceReference()) resolve(ref);
        return null;
    }
    @Override public Value visitNotification(NotificationContext ctx) {
        Value v = visit(ctx.expression());
        System.out.println("Notificación: " + v.value);
        return null;
    }
    @Override public Value visitExpression(ExpressionContext ctx) {
        return visit(ctx.logicalOr());
    }
    @Override public Value visitLogicalOr(LogicalOrContext ctx) {
        Value result = visit(ctx.logicalAnd(0));
        for (int i=1;i<ctx.logicalAnd().size();i++) {
            Value rhs = visit(ctx.logicalAnd(i)); require(ctx, result, Type.SCHALTZUSTAND, "||"); require(ctx, rhs, Type.SCHALTZUSTAND, "||");
            result = new Value(Type.SCHALTZUSTAND, truth(result) || truth(rhs));
        } return result;
    }
    @Override public Value visitLogicalAnd(LogicalAndContext ctx) {
        Value result = visit(ctx.equality(0));
        for (int i=1;i<ctx.equality().size();i++) {
            Value rhs = visit(ctx.equality(i)); require(ctx, result, Type.SCHALTZUSTAND, "&&"); require(ctx, rhs, Type.SCHALTZUSTAND, "&&");
            result = new Value(Type.SCHALTZUSTAND, truth(result) && truth(rhs));
        } return result;
    }
    @Override public Value visitEquality(EqualityContext ctx) {
        Value result = visit(ctx.relational(0));
        for (int i=1;i<ctx.relational().size();i++) {
            Value rhs = visit(ctx.relational(i)); String op = ctx.getChild(2*i-1).getText();
            if (result.type != rhs.type) throw error(ctx, "tipos incompatibles en '"+op+"': " + result.type + " y " + rhs.type);
            boolean equal;
            if (result.type == Type.PEGEL) equal = Double.compare(((Number) result.value).doubleValue(), ((Number) rhs.value).doubleValue()) == 0;
            else equal = Objects.equals(result.value, rhs.value);
            if (op.equals("==")) {
                result = new Value(Type.SCHALTZUSTAND, equal);
            } else {
                result = new Value(Type.SCHALTZUSTAND, !equal);
            }
        } return result;
    }
    @Override public Value visitRelational(RelationalContext ctx) {
        Value result = visit(ctx.additive(0));
        for (int i=1;i<ctx.additive().size();i++) {
            Value rhs = visit(ctx.additive(i)); String op = ctx.getChild(2*i-1).getText();
            if (result.type != rhs.type || (result.type != Type.PEGEL && result.type != Type.ZEITPUNKT))
                throw error(ctx, "'"+op+"' requiere dos valores pegel o dos zeitpunkt; se obtuvo " + result.type + " y " + rhs.type);
            int cmp;
            if (result.type == Type.PEGEL) {
                cmp = Double.compare(((Number) result.value).doubleValue(), ((Number) rhs.value).doubleValue());
            } else {
                cmp = ((LocalTime) result.value).compareTo((LocalTime) rhs.value);
            }
            boolean answer;
            if (op.equals("<")) answer = cmp < 0;
            else if (op.equals("<=")) answer = cmp <= 0;
            else if (op.equals(">")) answer = cmp > 0;
            else answer = cmp >= 0;
            result = new Value(Type.SCHALTZUSTAND, answer);
        } return result;
    }
    @Override public Value visitAdditive(AdditiveContext ctx) {
        Value result = visit(ctx.multiplicative(0));
        for(int i=1;i<ctx.multiplicative().size();i++) {
            Value rhs=visit(ctx.multiplicative(i)); String op=ctx.getChild(2*i-1).getText();
            if (op.equals("+") && (result.type == Type.MELDUNG || rhs.type == Type.MELDUNG)) {
                result = new Value(Type.MELDUNG, String.valueOf(result.value) + String.valueOf(rhs.value));
            }
            else {
                if(result.type!=Type.PEGEL || rhs.type!=Type.PEGEL) throw error(ctx,"'"+op+"' requiere pegel; no se pueden operar "+result.type+" y "+rhs.type);
                double a=((Number)result.value).doubleValue(), b=((Number)rhs.value).doubleValue();
                if (op.equals("+")) result = new Value(Type.PEGEL, a + b);
                else result = new Value(Type.PEGEL, a - b);
            }
        } return result;
    }
    @Override public Value visitMultiplicative(MultiplicativeContext ctx) {
        Value result=visit(ctx.unary(0));
        for(int i=1;i<ctx.unary().size();i++) {
            Value rhs=visit(ctx.unary(i)); String op=ctx.getChild(2*i-1).getText();
            if(result.type!=Type.PEGEL || rhs.type!=Type.PEGEL) throw error(ctx,"'"+op+"' requiere dos valores pegel");
            double b=((Number)rhs.value).doubleValue(); if(op.equals("/") && b==0) throw error(ctx,"división entre cero");
            double a = ((Number) result.value).doubleValue();
            if (op.equals("*")) result = new Value(Type.PEGEL, a * b);
            else result = new Value(Type.PEGEL, a / b);
        } return result;
    }
    @Override public Value visitUnary(UnaryContext ctx) {
        if (ctx.primary() != null) {
            return visit(ctx.primary());
        }

        Value value = visit(ctx.unary());
        if (ctx.NICHT() != null) {
            require(ctx, value, Type.SCHALTZUSTAND, "!");
            return new Value(Type.SCHALTZUSTAND, !truth(value));
        }

        require(ctx, value, Type.PEGEL, "signo numérico");
        if (ctx.SUBTRAKTION() != null) {
            return new Value(Type.PEGEL, -((Number) value.value).doubleValue());
        }
        return value;
    }
    @Override public Value visitPrimary(PrimaryContext ctx) {
        if (ctx.ZAHL() != null) {
            return new Value(Type.PEGEL, Double.parseDouble(ctx.ZAHL().getText()));
        } else if (ctx.TEXTWERT() != null) {
            return new Value(Type.MELDUNG, unescape(ctx.TEXTWERT().getText()));
        } else if (ctx.UHRZEITWERT() != null) {
            return new Value(Type.ZEITPUNKT, LocalTime.parse(ctx.UHRZEITWERT().getText()));
        } else if (ctx.AN() != null) {
            return new Value(Type.SCHALTZUSTAND, true);
        } else if (ctx.AUS() != null) {
            return new Value(Type.SCHALTZUSTAND, false);
        } else if (ctx.reference() != null) {
            return visit(ctx.reference());
        } else if (ctx.expression() != null) {
            return visit(ctx.expression());
        }
        return null;
    }
    @Override public Value visitReference(ReferenceContext ctx) {
        if(ctx.UHR()!=null) return new Value(Type.ZEITPUNKT, LocalTime.now());
        if (ctx.KENNUNG().size() > 1) {
            throw error(ctx, "referencia calificada inválida para variable: '" + ctx.getText() + "'");
        }
        String id = ctx.KENNUNG(0).getText();
        Value value = getVariable(ctx, id);
        if (value.value == null) throw error(ctx, "variable '" + id + "' todavía no tiene un valor asignado");
        return value;
    }
}
