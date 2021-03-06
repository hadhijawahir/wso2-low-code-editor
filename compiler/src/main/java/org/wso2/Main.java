package org.wso2;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wso2.antlr.CompilerLexer;
import org.wso2.antlr.CompilerParser;
import org.wso2.templating.BallerinaCodeGenerator;
import org.wso2.tree.Client;
import org.wso2.tree.CompilationUnit;
import org.wso2.tree.Node;
import org.wso2.util.Constants;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        try {
            CharStream charStream = CharStreams.fromPath(
                    Paths.get(Main.class.getClassLoader().getResource("input.txt").getFile()));
            CompilerLexer lexer = new CompilerLexer(charStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            CompilerParser parser = new CompilerParser(tokenStream);

            ParseTreeWalker walker = new ParseTreeWalker();
            CompilationUnit compilationUnit = new CompilationUnit();
            parser.addParseListener(new Listener(compilationUnit));
            CompilerParser.CompilationUnitContext compilationUnitContext = parser.compilationUnit();

            BallerinaCodeGenerator.compilePubSubTemplates(compilationUnit);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}