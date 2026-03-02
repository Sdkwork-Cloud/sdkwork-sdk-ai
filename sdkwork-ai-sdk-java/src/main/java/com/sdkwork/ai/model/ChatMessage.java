package com.sdkwork.ai.model;

public class ChatMessage {
    private String role;
    private Object content;
    private String name;
    private String refusal;
    private Audio audio;
    private List<Annotation> annotations;
    private List<ToolCall> toolCalls;
    private String toolCallId;

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

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getRefusal() {
        return this.refusal;
    }
    
    public void setRefusal(String refusal) {
        this.refusal = refusal;
    }

    public Audio getAudio() {
        return this.audio;
    }
    
    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public List<Annotation> getAnnotations() {
        return this.annotations;
    }
    
    public void setAnnotations(List<Annotation> annotations) {
        this.annotations = annotations;
    }

    public List<ToolCall> getToolCalls() {
        return this.toolCalls;
    }
    
    public void setToolCalls(List<ToolCall> toolCalls) {
        this.toolCalls = toolCalls;
    }

    public String getToolCallId() {
        return this.toolCallId;
    }
    
    public void setToolCallId(String toolCallId) {
        this.toolCallId = toolCallId;
    }
}
