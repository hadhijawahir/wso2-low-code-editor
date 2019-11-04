package org.wso2;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.wso2.antlr.PubSubBaseListener;
import org.wso2.antlr.PubSubParser;

import java.util.ArrayList;
import java.util.List;

public class Listener extends PubSubBaseListener {


    @Override
    public void exitKeyValuePair(PubSubParser.KeyValuePairContext ctx) {
        super.exitKeyValuePair(ctx);
        String KeyValuePair = ctx.getText();
        System.out.println("exitKeyValuePair: " + KeyValuePair);
    }

    @Override
    public void exitNatP(PubSubParser.NatPContext ctx) {
        super.exitNatP(ctx);
        String NatP = ctx.getText();
        System.out.println("exitNatP: " + NatP);
    }

    @Override
    public void exitNatS(PubSubParser.NatSContext ctx) {
        super.exitNatS(ctx);
        String NatS = ctx.getText();
        System.out.println("exitNatS: " + NatS);
    }

    @Override
    public void exitCompilationUnit(PubSubParser.CompilationUnitContext ctx) {
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
    public void exitNatP(PubSubParser.NatPContext ctx) {
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
    public void exitCompilationUnit(PubSubParser.CompilationUnitContext ctx) {
        super.exitCompilationUnit(ctx);
        String index1 = ctx.getChild(0).getText();
        String index2 = ctx.getChild(1).getText();
        System.out.println("index0 => " + index1);
        System.out.println("index1 => " + index2);
    }


    @Override
    public void exitNatP(PubSubParser.NatPContext ctx) {
        super.exitNatP(ctx);
        String index1 = ctx.getChild(0).getText();
        String index2 = ctx.getChild(2).getText();
        System.out.println("index3 => " + index1);
        System.out.println("index4 => " + index2);
    }
}
