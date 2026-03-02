package com.sdkwork.ai.model;

public class SubmitToolOutputs {
    private List<ToolCall> toolCalls;

    public List<ToolCall> getToolCalls() {
        return this.toolCalls;
    }
    
    public void setToolCalls(List<ToolCall> toolCalls) {
        this.toolCalls = toolCalls;
    }
}
