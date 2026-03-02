package com.sdkwork.ai.model;

public class ThreadResponse {
    private String id;
    private String object;
    private Map<String, String> metadata;
    private Integer createdAt;
    private Map<String, Object> toolResources;

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

    public Map<String, String> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public Integer getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Map<String, Object> getToolResources() {
        return this.toolResources;
    }
    
    public void setToolResources(Map<String, Object> toolResources) {
        this.toolResources = toolResources;
    }
}
