package com.sdkwork.ai.model;

public class RunStepResponse {
    private String id;
    private String object;
    private String type;
    private String status;
    private Map<String, String> metadata;
    private Integer createdAt;
    private String assistantId;
    private String threadId;
    private String runId;
    private Object stepDetails;
    private Object lastError;
    private Integer expiredAt;
    private Integer cancelledAt;
    private Integer failedAt;
    private Integer completedAt;

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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
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

    public String getAssistantId() {
        return this.assistantId;
    }
    
    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    public String getThreadId() {
        return this.threadId;
    }
    
    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public String getRunId() {
        return this.runId;
    }
    
    public void setRunId(String runId) {
        this.runId = runId;
    }

    public Object getStepDetails() {
        return this.stepDetails;
    }
    
    public void setStepDetails(Object stepDetails) {
        this.stepDetails = stepDetails;
    }

    public Object getLastError() {
        return this.lastError;
    }
    
    public void setLastError(Object lastError) {
        this.lastError = lastError;
    }

    public Integer getExpiredAt() {
        return this.expiredAt;
    }
    
    public void setExpiredAt(Integer expiredAt) {
        this.expiredAt = expiredAt;
    }

    public Integer getCancelledAt() {
        return this.cancelledAt;
    }
    
    public void setCancelledAt(Integer cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public Integer getFailedAt() {
        return this.failedAt;
    }
    
    public void setFailedAt(Integer failedAt) {
        this.failedAt = failedAt;
    }

    public Integer getCompletedAt() {
        return this.completedAt;
    }
    
    public void setCompletedAt(Integer completedAt) {
        this.completedAt = completedAt;
    }
}
