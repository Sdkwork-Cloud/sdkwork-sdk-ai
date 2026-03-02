package com.sdkwork.ai.model;

public class OpenAiVideoList {
    private String object;
    private List<OpenAiVideo> data;

    public String getObject() {
        return this.object;
    }
    
    public void setObject(String object) {
        this.object = object;
    }

    public List<OpenAiVideo> getData() {
        return this.data;
    }
    
    public void setData(List<OpenAiVideo> data) {
        this.data = data;
    }
}
