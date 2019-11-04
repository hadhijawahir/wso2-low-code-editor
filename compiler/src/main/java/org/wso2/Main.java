package org.wso2;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.wso2.antlr.PubSubLexer;
import org.wso2.antlr.PubSubParser;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {

            /*
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            CharStream charStream = CharStreams.fromString(input);
            */

            CharStream charStream = CharStreams.fromPath(Paths.get("/home/hadhi/Documents/Workspaces/IntelliJ/AntlrTest/pubSub/src/resources/input.txt"));
            PubSubLexer lexer = new PubSubLexer(charStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            PubSubParser parser = new PubSubParser(tokenStream);

            ParseTreeWalker walker = new ParseTreeWalker();
            parser.addParseListener(new Listener());
            parser.compilationUnit();

         /*
            PubSubParser.CompilationUnitContext tree = parser.compilationUnit();
            Listener extractor = new Listener();
            ParseTreeWalker.DEFAULT.walk(extractor, tree);
         */

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}