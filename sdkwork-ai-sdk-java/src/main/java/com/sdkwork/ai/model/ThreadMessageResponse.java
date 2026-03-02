package com.sdkwork.ai.model;

public class ThreadMessageResponse {
    private String id;
    private String object;
    private String role;
    private String status;
    private List<ContentBlock> content;
    private Map<String, String> metadata;
    private Integer createdAt;
    private String threadId;
    private Object incompleteDetails;
    private Integer completedAt;
    private Integer incompleteAt;
    private String assistantId;
    private String runId;
    private List<String> fileIds;

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

    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public List<ContentBlock> getContent() {
        return this.content;
    }
    
    public void setContent(List<ContentBlock> content) {
        this.content = content;
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

    public String getThreadId() {
        return this.threadId;
    }
    
    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public Object getIncompleteDetails() {
        return this.incompleteDetails;
    }
    
    public void setIncompleteDetails(Object incompleteDetails) {
        this.incompleteDetails = incompleteDetails;
    }

    public Integer getCompletedAt() {
        return this.completedAt;
    }
    
    public void setCompletedAt(Integer completedAt) {
        this.completedAt = completedAt;
    }

    public Integer getIncompleteAt() {
        return this.incompleteAt;
    }
    
    public void setIncompleteAt(Integer incompleteAt) {
        this.incompleteAt = incompleteAt;
    }

    public String getAssistantId() {
        return this.assistantId;
    }
    
    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    public String getRunId() {
        return this.runId;
    }
    
    public void setRunId(String runId) {
        this.runId = runId;
    }

    public List<String> getFileIds() {
        return this.fileIds;
    }
    
    public void setFileIds(List<String> fileIds) {
        this.fileIds = fileIds;
    }
}
