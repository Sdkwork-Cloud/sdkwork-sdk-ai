package com.sdkwork.ai.model;

public class RerankRequest {
    private String query;
    private List<Document> documents;
    private String model;
    private Integer topN;
    private Boolean returnDocuments;

    public String getQuery() {
        return this.query;
    }
    
    public void setQuery(String query) {
        this.query = query;
    }

    public List<Document> getDocuments() {
        return this.documents;
    }
    
    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public Integer getTopN() {
        return this.topN;
    }
    
    public void setTopN(Integer topN) {
        this.topN = topN;
    }

    public Boolean getReturnDocuments() {
        return this.returnDocuments;
    }
    
    public void setReturnDocuments(Boolean returnDocuments) {
        this.returnDocuments = returnDocuments;
    }
}
