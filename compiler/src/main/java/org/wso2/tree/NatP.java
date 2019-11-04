package org.wso2.tree;

import java.util.ArrayList;
import java.util.List;

public class NatP extends Node {

    private List<KeyValuePair> keyValuePairs;

    public NatP() {
        this.keyValuePairs = new ArrayList<>();
    }

    public void addKeyValuePair(KeyValuePair keyValuePair) {
        keyValuePairs.add(keyValuePair);
    }

    public List<KeyValuePair> getKeyValuePairs() {
        return keyValuePairs;
    }

}
