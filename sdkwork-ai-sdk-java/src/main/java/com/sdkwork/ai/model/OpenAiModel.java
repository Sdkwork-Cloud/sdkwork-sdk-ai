package com.sdkwork.ai.model;

public class OpenAiModel {
    private String id;
    private String object;
    private Integer created;
    private String ownedBy;

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

    public Integer getCreated() {
        return this.created;
    }
    
    public void setCreated(Integer created) {
        this.created = created;
    }

    public String getOwnedBy() {
        return this.ownedBy;
    }
    
    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }
}
