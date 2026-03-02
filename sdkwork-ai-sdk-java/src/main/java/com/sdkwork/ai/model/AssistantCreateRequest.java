package com.sdkwork.ai.model;

public class AssistantCreateRequest {
    private String model;
    private String name;
    private String description;
    private String instructions;
    private List<Tool> tools;
    private Map<String, String> metadata;
    private Double temperature;
    private Map<String, Object> toolResources;
    private ResponseFormat responseFormat;
    private Double topP;

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

    public List<Tool> getTools() {
        return this.tools;
    }
    
    public void setTools(List<Tool> tools) {
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

    public Map<String, Object> getToolResources() {
        return this.toolResources;
    }
    
    public void setToolResources(Map<String, Object> toolResources) {
        this.toolResources = toolResources;
    }

    public ResponseFormat getResponseFormat() {
        return this.responseFormat;
    }
    
    public void setResponseFormat(ResponseFormat responseFormat) {
        this.responseFormat = responseFormat;
    }

    public Double getTopP() {
        return this.topP;
    }
    
    public void setTopP(Double topP) {
        this.topP = topP;
    }
}
