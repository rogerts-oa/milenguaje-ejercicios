package com.example;

/** Holds a variable's name, declared data type, and current value. */
public class Value {
    public enum Type {
        PEGEL,
        MELDUNG,
        SCHALTZUSTAND,
        ZEITPUNKT
    }

    public final String name;
    public final Type type;
    public final Object value;

    /** Creates a temporary value produced while evaluating an expression. */
    public Value(Type type, Object value) {
        this(null, type, value);
    }

    /** Creates a named value to store in the symbol table. */
    public Value(String name, Type type, Object value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return name + ": " + type + " = " + value;
    }
}
