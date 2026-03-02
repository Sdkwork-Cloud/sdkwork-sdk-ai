package com.sdkwork.ai.model;

public class TextContent {
    private String value;
    private List<Object> annotations;

    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }

    public List<Object> getAnnotations() {
        return this.annotations;
    }
    
    public void setAnnotations(List<Object> annotations) {
        this.annotations = annotations;
    }
}
