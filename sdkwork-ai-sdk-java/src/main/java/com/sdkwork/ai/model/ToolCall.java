package com.sdkwork.ai.model;

public class ToolCall {
    private String id;
    private String type;
    private FunctionCall function;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public FunctionCall getFunction() {
        return this.function;
    }
    
    public void setFunction(FunctionCall function) {
        this.function = function;
    }
}
