package org.wso2;

import org.wso2.antlr.CompilerParser;
import org.wso2.tree.CompilationUnitBuilder;

public class Listener extends org.wso2.antlr.CompilerBaseListener {
    private final CompilationUnitBuilder compilationUnitBuilder;

    public Listener() {
        this.compilationUnitBuilder = new CompilationUnitBuilder();
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
    public void enterNatP(CompilerParser.NatPContext ctx) {
        compilationUnitBuilder.startNatP(ctx);
    }

    @Override
    public void enterNatS(CompilerParser.NatSContext ctx) {
        compilationUnitBuilder.startNatS(ctx);
    }

    @Override
    public void enterKeyValuePair(CompilerParser.KeyValuePairContext ctx) {
        compilationUnitBuilder.startKeyValuePair(ctx);
    }

    @Override
    public void exitNatS(CompilerParser.NatSContext ctx) {
        compilationUnitBuilder.endNatS(ctx);
    }


    @Override
    public void exitNatP(CompilerParser.NatPContext ctx) {
        compilationUnitBuilder.endNatP(ctx);
    }

    @Override
    public void exitCompilationUnit(CompilerParser.CompilationUnitContext ctx) {
        compilationUnitBuilder.endCompilationUnit(ctx);
    }
}
