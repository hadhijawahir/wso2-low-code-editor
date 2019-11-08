package org.wso2.tree;

import java.util.Stack;
import org.wso2.antlr.CompilerParser;

public class CompilationUnitBuilder {
    private CompilationUnit compilationUnit;
    private Stack<Client> clientStack = new Stack<>();
    private Stack<KeyValuePair> keyValuePairStack = new Stack<>();

    public CompilationUnitBuilder(CompilationUnit compilationUnit) {
        this.compilationUnit = compilationUnit;
    }

    public void startCompilationUnit(CompilerParser.CompilationUnitContext ctx) {

    }

    public void endCompilationUnit(CompilerParser.CompilationUnitContext ctx) {

    }

    public void startSubscriber(CompilerParser.SubscriberContext ctx) {
        Subscriber subscriber = new Subscriber();
        clientStack.push(subscriber);
    }

    public void endSubscriber(CompilerParser.SubscriberContext ctx) {
        // get nat s children from their stacks and add to this Subscriber obj.
        Client client = clientStack.pop();

        // add to compilation unit
        compilationUnit.addChild(client);
    }

    public void startPublisher(CompilerParser.PublisherContext ctx) {
        Publisher publisher = new Publisher();
        clientStack.add(publisher);
    }

    public void endPublisher(CompilerParser.PublisherContext ctx) {
        Client client = clientStack.pop();
        compilationUnit.addChild(client);
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
        Client client = clientStack.peek();
        client.addChild(keyValuePair);

    }
}
