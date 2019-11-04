package org.wso2;

import org.wso2.antlr.CompilerParser;

public class Listener extends org.wso2.antlr.CompilerBaseListener {

/*
    @Override
    public void exitKeyValuePair(CompilerParser.KeyValuePairContext ctx) {
        super.exitKeyValuePair(ctx);
        String KeyValuePair = ctx.getText();
        System.out.println("exitKeyValuePair: " + KeyValuePair);
    }

    @Override
    public void exitNatP(CompilerParser.NatPContext ctx) {
        super.exitNatP(ctx);
        String NatP = ctx.getText();
        System.out.println("exitNatP: " + NatP);
    }

    @Override
    public void exitNatS(CompilerParser.NatSContext ctx) {
        super.exitNatS(ctx);
        String NatS = ctx.getText();
        System.out.println("exitNatS: " + NatS);
    }

    @Override
    public void exitCompilationUnit(CompilerParser.CompilationUnitContext ctx) {
        super.exitCompilationUnit(ctx);
        String CompilationUnit = ctx.getText();
        System.out.println("exitCompilationUnit: " + CompilationUnit);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
        String NatS = ctx.getText();
        System.out.println(NatS);
    }

    @Override
    public void exitNatP(CompilerParser.NatPContext ctx) {
        super.exitNatP(ctx);
        String NatP = ctx.getText();
        System.out.println("exitNatP: " + NatP);
        List<TerminalNode> terminalNodes = new ArrayList<TerminalNode>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof TerminalNode) {
                terminalNodes.add((TerminalNode)ctx.getChild(i));
            }
        }
        System.out.println(terminalNodes.get(0));
    }

    @Override
    public void exitCompilationUnit(CompilerParser.CompilationUnitContext ctx) {
        super.exitCompilationUnit(ctx);
        String index1 = ctx.getChild(0).getText();
        String index2 = ctx.getChild(1).getText();
        System.out.println("index0 => " + index1);
        System.out.println("index1 => " + index2);
    }

    @Override
    public void exitNatP(CompilerParser.NatPContext ctx) {
        super.exitNatP(ctx);
        String index1 = ctx.getChild(0).getText();
        String index2 = ctx.getChild(2).getText();
        System.out.println("index3 => " + index1);
        System.out.println("index4 => " + index2);
    }

 */
}
