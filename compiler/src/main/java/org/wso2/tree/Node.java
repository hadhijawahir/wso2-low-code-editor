package org.wso2.tree;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {
    public String name;
    public String id;
    public String type;
    public Node parent;
    private List<Node> children = new ArrayList<>();

    public Node(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setParent(Node parentNode) {
        parent = parentNode;
    }

    public Node(Node parent) {
        this.parent = parent;
    }

    public void addChild(Node childNode) {
        childNode.setParent(this);
        children.add(childNode);
    }

    public List<Node> getChildren() {
        return children;
    }

    public Node getParent() {
        return parent;
    }
}


