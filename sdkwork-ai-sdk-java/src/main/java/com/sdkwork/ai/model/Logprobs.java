package com.sdkwork.ai.model;

public class Logprobs {
    private List<Content> content;
    private List<Content> refusal;

    public List<Content> getContent() {
        return this.content;
    }
    
    public void setContent(List<Content> content) {
        this.content = content;
    }

    public List<Content> getRefusal() {
        return this.refusal;
    }
    
    public void setRefusal(List<Content> refusal) {
        this.refusal = refusal;
    }
}
