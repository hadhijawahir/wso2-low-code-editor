package org.wso2.tree;

import java.util.Stack;
import org.wso2.antlr.CompilerParser;

public class CompilationUnitBuilder {
    private CompilationUnit compilationUnit;
    private Stack<Node> nodes = new Stack<>();
    private Stack<NatNode> natNodeStack = new Stack<>();
    private Stack<KeyValuePair> keyValuePairStack = new Stack<>();

    public void startCompilationUnit(CompilerParser.CompilationUnitContext ctx) {
        compilationUnit = new CompilationUnit();
    }

    public void endCompilationUnit(CompilerParser.CompilationUnitContext ctx) {

    }

    public void startNatS(CompilerParser.NatSContext ctx) {
        NatS natS = new NatS();
        natNodeStack.push(natS);
    }

    public void endNatS(CompilerParser.NatSContext ctx) {
        // get nat s children from their stacks and add to this nats obj.
        NatNode natNode = natNodeStack.pop();

        // add to compilation unit
        compilationUnit.addChild(natNode);
    }

    public void startNatP(CompilerParser.NatPContext ctx) {
        NatP natP = new NatP();
        natNodeStack.add(natP);
    }

    public void endNatP(CompilerParser.NatPContext ctx) {
        NatNode natNode = natNodeStack.pop();
        compilationUnit.addChild(natNode);
    }

    public void startKeyValuePair(CompilerParser.KeyValuePairContext ctx) {
        KeyValuePair keyValuePair = new KeyValuePair();
        keyValuePairStack.push(keyValuePair);
    }

    public void endKeyValuePair(CompilerParser.KeyValuePairContext ctx) {
        String rawContent = ctx.getText();
        String[] split = rawContent.split(":");
        String key = split[0];
        String value = split[1].replace("\"", "");

        KeyValuePair keyValuePair = keyValuePairStack.pop();
        keyValuePair.setKey(key);
        keyValuePair.setValue(value);
        NatNode natNode = natNodeStack.peek();
        natNode.addChild(keyValuePair);

    }
}
