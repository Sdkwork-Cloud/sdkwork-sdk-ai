package com.sdkwork.ai.model;

public class KnowledgeBaseResponse {
    private String name;
    private String description;
    private String status;
    private String knowledgeBaseId;
    private String embeddingModelId;
    private String indexType;
    private Integer createdAt;
    private Integer updatedAt;
    private Integer docCount;

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

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }
    
    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
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

    public Integer getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getDocCount() {
        return this.docCount;
    }
    
    public void setDocCount(Integer docCount) {
        this.docCount = docCount;
    }
}
