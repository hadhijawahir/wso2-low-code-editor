package org.wso2;

import java.nio.file.Paths;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.wso2.antlr.CompilerLexer;
import org.wso2.antlr.CompilerParser;

public class Main {
    public static void main(String[] args) {
        try {
            /*
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            CharStream charStream = CharStreams.fromString(input);
            */


            CharStream charStream = CharStreams.fromPath(
                    Paths.get(Main.class.getClassLoader().getResource("input.txt").getFile()));
            CompilerLexer lexer = new CompilerLexer(charStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            CompilerParser parser = new CompilerParser(tokenStream);

            ParseTreeWalker walker = new ParseTreeWalker();
            parser.addParseListener(new Listener());
            CompilerParser.CompilationUnitContext compilationUnitContext = parser.compilationUnit();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}