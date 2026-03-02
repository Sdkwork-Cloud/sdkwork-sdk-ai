package com.sdkwork.ai.model;

public class ThreadCreateRequest {
    private List<Message> messages;
    private Map<String, String> metadata;
    private Map<String, Object> toolResources;

    public List<Message> getMessages() {
        return this.messages;
    }
    
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Map<String, String> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public Map<String, Object> getToolResources() {
        return this.toolResources;
    }
    
    public void setToolResources(Map<String, Object> toolResources) {
        this.toolResources = toolResources;
    }
}
