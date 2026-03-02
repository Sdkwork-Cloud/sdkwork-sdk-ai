package com.sdkwork.ai.model;

public class PromptTokensDetails {
    private Integer cachedTokens;
    private Integer audioTokens;

    public Integer getCachedTokens() {
        return this.cachedTokens;
    }
    
    public void setCachedTokens(Integer cachedTokens) {
        this.cachedTokens = cachedTokens;
    }

    public Integer getAudioTokens() {
        return this.audioTokens;
    }
    
    public void setAudioTokens(Integer audioTokens) {
        this.audioTokens = audioTokens;
    }
}
