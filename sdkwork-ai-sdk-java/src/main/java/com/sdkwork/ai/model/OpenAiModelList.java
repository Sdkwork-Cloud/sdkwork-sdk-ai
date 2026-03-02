package com.sdkwork.ai.model;

public class OpenAiModelList {
    private String object;
    private List<OpenAiModel> data;

    public String getObject() {
        return this.object;
    }
    
    public void setObject(String object) {
        this.object = object;
    }

    public List<OpenAiModel> getData() {
        return this.data;
    }
    
    public void setData(List<OpenAiModel> data) {
        this.data = data;
    }
}
