package com.sdkwork.ai.model;

public class CompletionTokensDetails {
    private Integer reasoningTokens;
    private Integer audioTokens;
    private Integer acceptedPredictionTokens;
    private Integer rejectedPredictionTokens;

    public Integer getReasoningTokens() {
        return this.reasoningTokens;
    }
    
    public void setReasoningTokens(Integer reasoningTokens) {
        this.reasoningTokens = reasoningTokens;
    }

    public Integer getAudioTokens() {
        return this.audioTokens;
    }
    
    public void setAudioTokens(Integer audioTokens) {
        this.audioTokens = audioTokens;
    }

    public Integer getAcceptedPredictionTokens() {
        return this.acceptedPredictionTokens;
    }
    
    public void setAcceptedPredictionTokens(Integer acceptedPredictionTokens) {
        this.acceptedPredictionTokens = acceptedPredictionTokens;
    }

    public Integer getRejectedPredictionTokens() {
        return this.rejectedPredictionTokens;
    }
    
    public void setRejectedPredictionTokens(Integer rejectedPredictionTokens) {
        this.rejectedPredictionTokens = rejectedPredictionTokens;
    }
}
