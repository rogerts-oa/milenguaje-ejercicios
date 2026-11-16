package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class Main {

    private static final String EXTENSION = "jr";
    private static final Path DIRBASE = Paths.get("src", "test", "resources");

    private static Path resolveFile(String file) throws IOException {
        // Quita separadores finales accidentales, por ejemplo "test.jr\\".
        String cleanFile = file.trim().replaceAll("[\\\\/]+$", "");
        Path requested = Paths.get(cleanFile);

        if (Files.exists(requested)) {
            return requested;
        }

        Path fromDemo = DIRBASE.resolve(requested);
        if (Files.exists(fromDemo)) {
            return fromDemo;
        }

        Path fromRepository = Paths.get("demo").resolve(DIRBASE).resolve(requested);
        if (Files.exists(fromRepository)) {
            return fromRepository;
        }

        throw new IOException("No se encontró el archivo Junior: " + file
                + ". Se buscó en " + requested.toAbsolutePath() + " y en las carpetas de recursos.");
    }

    public static void main(String[] args) throws IOException {
        String files[] = args.length==0? new String[]{ "test." + EXTENSION } : args;
        for (String file : files){
            Path inputFile = resolveFile(file);
            System.out.println("START: " + inputFile);

            CharStream in = CharStreams.fromPath(inputFile);
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
