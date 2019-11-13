package org.wso2;

import org.wso2.antlr.CompilerParser;
import org.wso2.tree.CompilationUnit;
import org.wso2.tree.CompilationUnitBuilder;


public class Listener extends org.wso2.antlr.CompilerParserBaseListener {

    private CompilationUnitBuilder compilationUnitBuilder;


    public Listener(CompilationUnit compilationUnit) {
        this.compilationUnitBuilder = new CompilationUnitBuilder(compilationUnit);
    }

    @Override
    public void exitKeyValuePair(CompilerParser.KeyValuePairContext ctx) {
        compilationUnitBuilder.endKeyValuePair(ctx);
    }

    @Override
    public void enterCompilationUnit(CompilerParser.CompilationUnitContext ctx) {
        compilationUnitBuilder.startCompilationUnit(ctx);
    }

    @Override
    public void enterPublisher(CompilerParser.PublisherContext ctx) {
        compilationUnitBuilder.startPublisher(ctx);
    }

    @Override
    public void enterSubscriber(CompilerParser.SubscriberContext ctx) {
        compilationUnitBuilder.startSubscriber(ctx);
    }

    @Override
    public void enterKeyValuePair(CompilerParser.KeyValuePairContext ctx) {
        compilationUnitBuilder.startKeyValuePair(ctx);
    }

    @Override
    public void exitSubscriber(CompilerParser.SubscriberContext ctx) {
        compilationUnitBuilder.endSubscriber(ctx);
    }


    @Override
    public void exitPublisher(CompilerParser.PublisherContext ctx) {
        compilationUnitBuilder.endPublisher(ctx);
    }

    @Override
    public void exitCompilationUnit(CompilerParser.CompilationUnitContext ctx) {
        compilationUnitBuilder.endCompilationUnit(ctx);

    }
}
