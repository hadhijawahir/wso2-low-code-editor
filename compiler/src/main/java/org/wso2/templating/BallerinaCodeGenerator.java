package org.wso2.templating;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import org.wso2.tree.Client;
import org.wso2.tree.CompilationUnit;
import org.wso2.tree.KeyValuePair;
import org.wso2.tree.Node;
import org.wso2.tree.Publisher;
import org.wso2.tree.Subscriber;
import org.wso2.util.Constants;

public class BallerinaCodeGenerator {
    public static void compilePubSubTemplates(CompilationUnit compilationUnit) throws IOException {
        Handlebars handlebars = new Handlebars();
        Template template = null;
        String templateString = "";
        String outputFile = "";
        String templateFile = "";
        List<Node> compilationUnitChildren = compilationUnit.getChildren();
        for (Node compilationUnitChild : compilationUnitChildren) {
            Client client = (Client) compilationUnitChild;
            if (Constants.PUBLISHER.equals(client.getType())) {
                Publisher publisher = (Publisher) client;
                templateFile = Constants.TEMPLATE_DIR +
                        File.separator + Constants.PUBLISHER + Constants.BALLERINA_FILE_EXTENSION;
                outputFile = Constants.PUBLISHER + Constants.BALLERINA_FILE_EXTENSION;
            } else if (Constants.SUBSCRIBER.equals(client.getType())) {
                Subscriber subscriber = (Subscriber) client;
                templateFile = Constants.TEMPLATE_DIR +
                        File.separator + Constants.SUBSCRIBER + Constants.BALLERINA_FILE_EXTENSION;
                outputFile = Constants.SUBSCRIBER + Constants.BALLERINA_FILE_EXTENSION;
            }

            template = handlebars.compile(templateFile);
            List<Node> children = client.getChildren();
            Map<String, String> params = new HashMap<>();
            for (Node child : children) {
                KeyValuePair keyValuePair = (KeyValuePair) child;
                params.put(keyValuePair.getKey(), keyValuePair.getValue());
            }

            templateString = template.apply(params);
            File f = new File(outputFile);
            BufferedWriter bufferedWriter = null;
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(f));
                bufferedWriter.write(templateString);
                bufferedWriter.flush();
            } finally {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            }
        }
    }
}
