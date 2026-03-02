package com.sdkwork.ai.model;

public class SearchResult {
    private String content;
    private Double score;
    private Map<String, Object> metadata;
    private String documentId;
    private String chunkId;

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Double getScore() {
        return this.score;
    }
    
    public void setScore(Double score) {
        this.score = score;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public String getDocumentId() {
        return this.documentId;
    }
    
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getChunkId() {
        return this.chunkId;
    }
    
    public void setChunkId(String chunkId) {
        this.chunkId = chunkId;
    }
}
