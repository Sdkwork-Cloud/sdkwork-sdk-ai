package com.sdkwork.ai.model;

public class ContextResponse {
    private String id;
    private String object;
    private Integer created;
    private String model;
    private String mode;
    private Integer ttl;
    private TruncationStrategy truncationStrategy;
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

    public Integer getCreated() {
        return this.created;
    }
    
    public void setCreated(Integer created) {
        this.created = created;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getMode() {
        return this.mode;
    }
    
    public void setMode(String mode) {
        this.mode = mode;
    }

    public Integer getTtl() {
        return this.ttl;
    }
    
    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public TruncationStrategy getTruncationStrategy() {
        return this.truncationStrategy;
    }
    
    public void setTruncationStrategy(TruncationStrategy truncationStrategy) {
        this.truncationStrategy = truncationStrategy;
    }

    public Usage getUsage() {
        return this.usage;
    }
    
    public void setUsage(Usage usage) {
        this.usage = usage;
    }
}
