package com.sdkwork.ai.model;

public class ModerationResponse {
    private String id;
    private String model;
    private List<ModerationResult> results;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public List<ModerationResult> getResults() {
        return this.results;
    }
    
    public void setResults(List<ModerationResult> results) {
        this.results = results;
    }
}
