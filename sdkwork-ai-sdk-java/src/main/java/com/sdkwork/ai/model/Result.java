package com.sdkwork.ai.model;

public class Result {
    private Integer index;
    private Double score;
    private String document;

    public Integer getIndex() {
        return this.index;
    }
    
    public void setIndex(Integer index) {
        this.index = index;
    }

    public Double getScore() {
        return this.score;
    }
    
    public void setScore(Double score) {
        this.score = score;
    }

    public String getDocument() {
        return this.document;
    }
    
    public void setDocument(String document) {
        this.document = document;
    }
}
