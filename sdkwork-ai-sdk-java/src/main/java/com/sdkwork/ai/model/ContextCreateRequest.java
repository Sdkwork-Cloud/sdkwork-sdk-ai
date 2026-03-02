package com.sdkwork.ai.model;

public class ContextCreateRequest {
    private String model;
    private List<ContextMessage> messages;
    private String mode;
    private Integer ttl;
    private TruncationStrategy truncationStrategy;

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public List<ContextMessage> getMessages() {
        return this.messages;
    }
    
    public void setMessages(List<ContextMessage> messages) {
        this.messages = messages;
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
}
