package com.sdkwork.ai.model;

public class KnowledgeSearchRequest {
    private String query;
    private List<Filter> filters;
    private String knowledgeBaseId;
    private Integer topK;
    private Double scoreThreshold;

    public String getQuery() {
        return this.query;
    }
    
    public void setQuery(String query) {
        this.query = query;
    }

    public List<Filter> getFilters() {
        return this.filters;
    }
    
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }
    
    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    public Integer getTopK() {
        return this.topK;
    }
    
    public void setTopK(Integer topK) {
        this.topK = topK;
    }

    public Double getScoreThreshold() {
        return this.scoreThreshold;
    }
    
    public void setScoreThreshold(Double scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
    }
}
