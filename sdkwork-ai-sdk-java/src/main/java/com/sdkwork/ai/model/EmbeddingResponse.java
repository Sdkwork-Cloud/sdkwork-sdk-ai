package com.sdkwork.ai.model;

public class EmbeddingResponse {
    private String object;
    private List<Embedding> data;
    private String model;
    private Usage usage;

    public String getObject() {
        return this.object;
    }
    
    public void setObject(String object) {
        this.object = object;
    }

    public List<Embedding> getData() {
        return this.data;
    }
    
    public void setData(List<Embedding> data) {
        this.data = data;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public Usage getUsage() {
        return this.usage;
    }
    
    public void setUsage(Usage usage) {
        this.usage = usage;
    }
}
