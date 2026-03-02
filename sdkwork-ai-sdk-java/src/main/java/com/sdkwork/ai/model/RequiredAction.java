package com.sdkwork.ai.model;

public class RequiredAction {
    private String type;
    private SubmitToolOutputs submitToolOutputs;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public SubmitToolOutputs getSubmitToolOutputs() {
        return this.submitToolOutputs;
    }
    
    public void setSubmitToolOutputs(SubmitToolOutputs submitToolOutputs) {
        this.submitToolOutputs = submitToolOutputs;
    }
}
