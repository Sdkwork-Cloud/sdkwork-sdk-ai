package com.sdkwork.ai.model;

public class ModerationRequest {
    private String model;
    private Object input;
    private String user;

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public Object getInput() {
        return this.input;
    }
    
    public void setInput(Object input) {
        this.input = input;
    }

    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
}
