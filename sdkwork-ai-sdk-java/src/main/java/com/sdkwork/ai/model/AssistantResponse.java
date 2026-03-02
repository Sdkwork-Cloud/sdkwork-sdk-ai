package com.sdkwork.ai.model;

public class AssistantResponse {
    private String id;
    private String object;
    private String model;
    private String name;
    private String description;
    private String instructions;
    private List<Object> tools;
    private Map<String, String> metadata;
    private Double temperature;
    private Integer createdAt;
    private Map<String, Object> toolResources;
    private Object responseFormat;
    private Double topP;

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

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
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

    public Integer getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Map<String, Object> getToolResources() {
        return this.toolResources;
    }
    
    public void setToolResources(Map<String, Object> toolResources) {
        this.toolResources = toolResources;
    }

    public Object getResponseFormat() {
        return this.responseFormat;
    }
    
    public void setResponseFormat(Object responseFormat) {
        this.responseFormat = responseFormat;
    }

    public Double getTopP() {
        return this.topP;
    }
    
    public void setTopP(Double topP) {
        this.topP = topP;
    }
}
