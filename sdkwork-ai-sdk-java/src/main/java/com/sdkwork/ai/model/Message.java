package com.sdkwork.ai.model;

public class Message {
    private String role;
    private Object content;
    private String refusal;
    private List<Object> annotations;
    private String reasoningContent;
    private List<ToolCall> toolCalls;

    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    public Object getContent() {
        return this.content;
    }
    
    public void setContent(Object content) {
        this.content = content;
    }

    public String getRefusal() {
        return this.refusal;
    }
    
    public void setRefusal(String refusal) {
        this.refusal = refusal;
    }

    public List<Object> getAnnotations() {
        return this.annotations;
    }
    
    public void setAnnotations(List<Object> annotations) {
        this.annotations = annotations;
    }

    public String getReasoningContent() {
        return this.reasoningContent;
    }
    
    public void setReasoningContent(String reasoningContent) {
        this.reasoningContent = reasoningContent;
    }

    public List<ToolCall> getToolCalls() {
        return this.toolCalls;
    }
    
    public void setToolCalls(List<ToolCall> toolCalls) {
        this.toolCalls = toolCalls;
    }
}
