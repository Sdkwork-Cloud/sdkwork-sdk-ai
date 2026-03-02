package com.sdkwork.ai.model;

public class BatchResponse {
    private String id;
    private String object;
    private String endpoint;
    private Errors errors;
    private String status;
    private Map<String, String> metadata;
    private String inputFileId;
    private String outputFileId;
    private String errorFileId;
    private Integer createdAt;
    private String completionWindow;
    private Integer expiresAt;
    private Integer startedAt;
    private Integer completedAt;
    private Integer failedAt;
    private Integer expiredAt;
    private Integer cancelledAt;
    private RequestCounts requestCounts;

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

    public String getEndpoint() {
        return this.endpoint;
    }
    
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public Errors getErrors() {
        return this.errors;
    }
    
    public void setErrors(Errors errors) {
        this.errors = errors;
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

    public String getInputFileId() {
        return this.inputFileId;
    }
    
    public void setInputFileId(String inputFileId) {
        this.inputFileId = inputFileId;
    }

    public String getOutputFileId() {
        return this.outputFileId;
    }
    
    public void setOutputFileId(String outputFileId) {
        this.outputFileId = outputFileId;
    }

    public String getErrorFileId() {
        return this.errorFileId;
    }
    
    public void setErrorFileId(String errorFileId) {
        this.errorFileId = errorFileId;
    }

    public Integer getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public String getCompletionWindow() {
        return this.completionWindow;
    }
    
    public void setCompletionWindow(String completionWindow) {
        this.completionWindow = completionWindow;
    }

    public Integer getExpiresAt() {
        return this.expiresAt;
    }
    
    public void setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
    }

    public Integer getStartedAt() {
        return this.startedAt;
    }
    
    public void setStartedAt(Integer startedAt) {
        this.startedAt = startedAt;
    }

    public Integer getCompletedAt() {
        return this.completedAt;
    }
    
    public void setCompletedAt(Integer completedAt) {
        this.completedAt = completedAt;
    }

    public Integer getFailedAt() {
        return this.failedAt;
    }
    
    public void setFailedAt(Integer failedAt) {
        this.failedAt = failedAt;
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

    public RequestCounts getRequestCounts() {
        return this.requestCounts;
    }
    
    public void setRequestCounts(RequestCounts requestCounts) {
        this.requestCounts = requestCounts;
    }
}
