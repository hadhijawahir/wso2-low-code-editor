package org.wso2;

public class NatC extends Node {
    private String url;
    private String topic;

    public NatC(String url, String topic) {
        this.url = url;
        this.topic = topic;

    }


    public String getUrl() {
        return url;
    }

    public String getTopic() {
        return topic;
    }
}
