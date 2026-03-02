package com.sdkwork.ai.model;

public class KnowledgeSearchResponse {
    private List<SearchResult> results;
    private Integer total;

    public List<SearchResult> getResults() {
        return this.results;
    }
    
    public void setResults(List<SearchResult> results) {
        this.results = results;
    }

    public Integer getTotal() {
        return this.total;
    }
    
    public void setTotal(Integer total) {
        this.total = total;
    }
}
