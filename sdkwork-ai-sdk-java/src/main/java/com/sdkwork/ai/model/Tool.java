package com.sdkwork.ai.model;

public class Tool {
    private String type;
    private Function function;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Function getFunction() {
        return this.function;
    }
    
    public void setFunction(Function function) {
        this.function = function;
    }
}
