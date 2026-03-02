package com.sdkwork.ai.model;

public class TopLogprob {
    private String token;
    private Double logprob;
    private List<Integer> bytes;

    public String getToken() {
        return this.token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }

    public Double getLogprob() {
        return this.logprob;
    }
    
    public void setLogprob(Double logprob) {
        this.logprob = logprob;
    }

    public List<Integer> getBytes() {
        return this.bytes;
    }
    
    public void setBytes(List<Integer> bytes) {
        this.bytes = bytes;
    }
}
