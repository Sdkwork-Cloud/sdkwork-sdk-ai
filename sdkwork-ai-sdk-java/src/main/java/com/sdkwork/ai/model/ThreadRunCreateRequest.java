package com.sdkwork.ai.model;

public class ThreadRunCreateRequest {
    private String model;
    private String instructions;
    private List<Object> tools;
    private Map<String, String> metadata;
    private Double temperature;
    private Boolean stream;
    private ThreadCreateRequest thread;
    private String assistantId;
    private String additionalInstructions;
    private List<Map<String, Object>> additionalMessages;
    private Map<String, Object> toolResources;
    private Double topP;
    private Integer maxPromptTokens;
    private Integer maxCompletionTokens;
    private TruncationStrategy truncationStrategy;

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

    public Double getTemperature() {
        return this.temperature;
    }
    
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Boolean getStream() {
        return this.stream;
    }
    
    public void setStream(Boolean stream) {
        this.stream = stream;
    }

    public ThreadCreateRequest getThread() {
        return this.thread;
    }
    
    public void setThread(ThreadCreateRequest thread) {
        this.thread = thread;
    }

    public String getAssistantId() {
        return this.assistantId;
    }
    
    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    public String getAdditionalInstructions() {
        return this.additionalInstructions;
    }
    
    public void setAdditionalInstructions(String additionalInstructions) {
        this.additionalInstructions = additionalInstructions;
    }

    public List<Map<String, Object>> getAdditionalMessages() {
        return this.additionalMessages;
    }
    
    public void setAdditionalMessages(List<Map<String, Object>> additionalMessages) {
        this.additionalMessages = additionalMessages;
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

    public TruncationStrategy getTruncationStrategy() {
        return this.truncationStrategy;
    }
    
    public void setTruncationStrategy(TruncationStrategy truncationStrategy) {
        this.truncationStrategy = truncationStrategy;
    }
}
