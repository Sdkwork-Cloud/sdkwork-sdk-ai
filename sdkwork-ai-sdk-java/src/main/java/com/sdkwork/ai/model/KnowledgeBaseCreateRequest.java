package com.sdkwork.ai.model;

public class KnowledgeBaseCreateRequest {
    private String name;
    private String description;
    private Map<String, Object> extra;
    private String embeddingModelId;
    private String indexType;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getExtra() {
        return this.extra;
    }
    
    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }

    public String getEmbeddingModelId() {
        return this.embeddingModelId;
    }
    
    public void setEmbeddingModelId(String embeddingModelId) {
        this.embeddingModelId = embeddingModelId;
    }

    public String getIndexType() {
        return this.indexType;
    }
    
    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }
}
