package org.wso2.tree;

public class KeyValuePair extends Node {

    private String key;
    private String value;

    public KeyValuePair() {

    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}
