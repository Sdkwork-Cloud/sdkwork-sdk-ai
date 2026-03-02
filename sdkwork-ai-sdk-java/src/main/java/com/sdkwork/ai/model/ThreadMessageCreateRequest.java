package com.sdkwork.ai.model;

public class ThreadMessageCreateRequest {
    private String role;
    private Object content;
    private List<Attachment> attachments;
    private Map<String, String> metadata;

    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    public Object getContent() {
        return this.content;
    }
    
    public void setContent(Object content) {
        this.content = content;
    }

    public List<Attachment> getAttachments() {
        return this.attachments;
    }
    
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public Map<String, String> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }
}
