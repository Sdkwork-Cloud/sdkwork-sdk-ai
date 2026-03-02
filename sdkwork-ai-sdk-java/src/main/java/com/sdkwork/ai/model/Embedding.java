package com.sdkwork.ai.model;

public class Embedding {
    private String object;
    private List<Double> embedding;
    private Integer index;

    public String getObject() {
        return this.object;
    }
    
    public void setObject(String object) {
        this.object = object;
    }

    public List<Double> getEmbedding() {
        return this.embedding;
    }
    
    public void setEmbedding(List<Double> embedding) {
        this.embedding = embedding;
    }

    public Integer getIndex() {
        return this.index;
    }
    
    public void setIndex(Integer index) {
        this.index = index;
    }
}
