package com.sdkwork.ai.model;

public class Choice {
    private Integer index;
    private Message message;
    private Logprobs logprobs;
    private String finishReason;
    private String moderationHitType;

    public Integer getIndex() {
        return this.index;
    }
    
    public void setIndex(Integer index) {
        this.index = index;
    }

    public Message getMessage() {
        return this.message;
    }
    
    public void setMessage(Message message) {
        this.message = message;
    }

    public Logprobs getLogprobs() {
        return this.logprobs;
    }
    
    public void setLogprobs(Logprobs logprobs) {
        this.logprobs = logprobs;
    }

    public String getFinishReason() {
        return this.finishReason;
    }
    
    public void setFinishReason(String finishReason) {
        this.finishReason = finishReason;
    }

    public String getModerationHitType() {
        return this.moderationHitType;
    }
    
    public void setModerationHitType(String moderationHitType) {
        this.moderationHitType = moderationHitType;
    }
}
