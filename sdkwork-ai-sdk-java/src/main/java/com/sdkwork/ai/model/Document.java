package com.sdkwork.ai.model;

public class Document {
    private String content;
    private Object metadata;

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Object getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }
}
