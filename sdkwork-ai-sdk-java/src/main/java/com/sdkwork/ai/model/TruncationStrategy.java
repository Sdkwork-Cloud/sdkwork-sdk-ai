package com.sdkwork.ai.model;

public class TruncationStrategy {
    private String type;
    private Integer lastMessages;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Integer getLastMessages() {
        return this.lastMessages;
    }
    
    public void setLastMessages(Integer lastMessages) {
        this.lastMessages = lastMessages;
    }
}
