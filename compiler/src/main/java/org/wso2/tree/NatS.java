package org.wso2.tree;

import java.util.ArrayList;
import java.util.List;

public class NatS extends Node {

    private List<KeyValuePair> keyValuePairs;

    public NatS() {
        this.keyValuePairs = new ArrayList<>();
    }

    public void addKeyValuePair(KeyValuePair keyValuePair) {
        keyValuePairs.add(keyValuePair);
    }

    public List<KeyValuePair> getKeyValuePairs() {
        return keyValuePairs;
    }

}
