package com.sdkwork.ai.model;

public class Audio {
    private String id;
    private String data;
    private String transcript;
    private Integer expiresAt;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return this.data;
    }
    
    public void setData(String data) {
        this.data = data;
    }

    public String getTranscript() {
        return this.transcript;
    }
    
    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    public Integer getExpiresAt() {
        return this.expiresAt;
    }
    
    public void setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
    }
}
