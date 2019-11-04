package org.wso2;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.wso2.antlr.CompilerLexer;
import org.wso2.antlr.CompilerParser;
import org.wso2.tree.CompilationUnit;
import org.wso2.tree.KeyValuePair;
import org.wso2.tree.NatS;

import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {

            /*
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            CharStream charStream = CharStreams.fromString(input);
            */


            CharStream charStream = CharStreams.fromPath(Paths.get(Main.class.getClassLoader().getResource("input.txt").getFile()));
            CompilerLexer lexer = new CompilerLexer(charStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            CompilerParser parser = new CompilerParser(tokenStream);

            ParseTreeWalker walker = new ParseTreeWalker();
            parser.addParseListener(new Listener());
            CompilerParser.CompilationUnitContext compilationUnitContext = parser.compilationUnit();

            // Access the Context
            KeyValuePair keyValuePair = new KeyValuePair("a", "b");
            KeyValuePair keyValuePair2 = new KeyValuePair("c", "d");
            NatS natS = new NatS();
            natS.addKeyValuePair(keyValuePair);
            natS.addKeyValuePair(keyValuePair2);

            CompilationUnit compilationUnit = new CompilationUnit(natS);

            List<KeyValuePair> keyValuePairs = compilationUnit.getNatS().getKeyValuePairs();
            for (KeyValuePair valuePair : keyValuePairs) {
                System.out.println(valuePair.getKey() + ": " + valuePair.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}