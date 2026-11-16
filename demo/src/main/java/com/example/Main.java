package com.example;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class Main {

    private static final String EXTENSION = "jr";
    private static final String DIRBASE = "src/test/resources/";

    public static void main(String[] args) throws IOException {
        String files[] = args.length==0? new String[]{ "test." + EXTENSION } : args;
        System.out.println("Dirbase: " + DIRBASE);
        for (String file : files){
            System.out.println("START: " + file);

            CharStream in = CharStreams.fromFileName(DIRBASE + file);
            JuniorLexer lexer = new JuniorLexer(in);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                        int charPositionInLine, String msg, RecognitionException e) {
                    throw new IllegalArgumentException("Error léxico (línea " + line + ", columna "
                            + (charPositionInLine + 1) + "): " + msg, e);
                }
            });
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JuniorParser parser = new JuniorParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                        int charPositionInLine, String msg, RecognitionException e) {
                    throw new IllegalArgumentException("Error sintáctico (línea " + line + ", columna "
                            + (charPositionInLine + 1) + "): " + msg, e);
                }
            });
            JuniorParser.ProgramContext tree = parser.program();
            JuniorCustomVisitor visitor = new JuniorCustomVisitor();
            visitor.visit(tree);

            System.out.println("FINISH: " + file);
        }
    }
}
