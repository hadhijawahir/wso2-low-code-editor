package org.wso2.tree;

import org.wso2.util.Constants;

public class KeyValuePair extends Node {

    private String key;
    private String value;

    public KeyValuePair() {
        super(Constants.KEY_VALUE_PAIR);
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

    @Override
    public String toString() {
        return "KeyValuePair{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
