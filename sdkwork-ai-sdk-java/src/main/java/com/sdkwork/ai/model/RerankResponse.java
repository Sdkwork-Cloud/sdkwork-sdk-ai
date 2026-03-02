package com.sdkwork.ai.model;

public class RerankResponse {
    private String id;
    private String object;
    private String model;
    private List<Result> results;
    private Usage usage;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return this.object;
    }
    
    public void setObject(String object) {
        this.object = object;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public List<Result> getResults() {
        return this.results;
    }
    
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Usage getUsage() {
        return this.usage;
    }
    
    public void setUsage(Usage usage) {
        this.usage = usage;
    }
}
