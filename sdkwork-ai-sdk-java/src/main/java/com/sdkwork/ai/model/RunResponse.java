package com.sdkwork.ai.model;

public class RunResponse {
    private String id;
    private String object;
    private String status;
    private String model;
    private String instructions;
    private List<Object> tools;
    private Map<String, String> metadata;
    private Usage usage;
    private Double temperature;
    private Integer createdAt;
    private String threadId;
    private String assistantId;
    private RequiredAction requiredAction;
    private LastError lastError;
    private Integer expiresAt;
    private Integer startedAt;
    private Integer cancelledAt;
    private Integer failedAt;
    private Integer completedAt;
    private Map<String, Object> toolResources;
    private Double topP;
    private Integer maxPromptTokens;
    private Integer maxCompletionTokens;
    private Object truncationStrategy;

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

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getInstructions() {
        return this.instructions;
    }
    
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public List<Object> getTools() {
        return this.tools;
    }
    
    public void setTools(List<Object> tools) {
        this.tools = tools;
    }

    public Map<String, String> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public Usage getUsage() {
        return this.usage;
    }
    
    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public Double getTemperature() {
        return this.temperature;
    }
    
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
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

    public String getAssistantId() {
        return this.assistantId;
    }
    
    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    public RequiredAction getRequiredAction() {
        return this.requiredAction;
    }
    
    public void setRequiredAction(RequiredAction requiredAction) {
        this.requiredAction = requiredAction;
    }

    public LastError getLastError() {
        return this.lastError;
    }
    
    public void setLastError(LastError lastError) {
        this.lastError = lastError;
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

    public Map<String, Object> getToolResources() {
        return this.toolResources;
    }
    
    public void setToolResources(Map<String, Object> toolResources) {
        this.toolResources = toolResources;
    }

    public Double getTopP() {
        return this.topP;
    }
    
    public void setTopP(Double topP) {
        this.topP = topP;
    }

    public Integer getMaxPromptTokens() {
        return this.maxPromptTokens;
    }
    
    public void setMaxPromptTokens(Integer maxPromptTokens) {
        this.maxPromptTokens = maxPromptTokens;
    }

    public Integer getMaxCompletionTokens() {
        return this.maxCompletionTokens;
    }
    
    public void setMaxCompletionTokens(Integer maxCompletionTokens) {
        this.maxCompletionTokens = maxCompletionTokens;
    }

    public Object getTruncationStrategy() {
        return this.truncationStrategy;
    }
    
    public void setTruncationStrategy(Object truncationStrategy) {
        this.truncationStrategy = truncationStrategy;
    }
}
