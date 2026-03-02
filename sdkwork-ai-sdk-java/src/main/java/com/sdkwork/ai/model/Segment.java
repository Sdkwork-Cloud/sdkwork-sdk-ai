package com.sdkwork.ai.model;

public class Segment {
    private Integer id;
    private Integer seek;
    private Double start;
    private Double end;
    private String text;
    private List<Integer> tokens;
    private Double temperature;
    private Double avgLogprob;
    private Double compressionRatio;
    private Double noSpeechProb;

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeek() {
        return this.seek;
    }
    
    public void setSeek(Integer seek) {
        this.seek = seek;
    }

    public Double getStart() {
        return this.start;
    }
    
    public void setStart(Double start) {
        this.start = start;
    }

    public Double getEnd() {
        return this.end;
    }
    
    public void setEnd(Double end) {
        this.end = end;
    }

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public List<Integer> getTokens() {
        return this.tokens;
    }
    
    public void setTokens(List<Integer> tokens) {
        this.tokens = tokens;
    }

    public Double getTemperature() {
        return this.temperature;
    }
    
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getAvgLogprob() {
        return this.avgLogprob;
    }
    
    public void setAvgLogprob(Double avgLogprob) {
        this.avgLogprob = avgLogprob;
    }

    public Double getCompressionRatio() {
        return this.compressionRatio;
    }
    
    public void setCompressionRatio(Double compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    public Double getNoSpeechProb() {
        return this.noSpeechProb;
    }
    
    public void setNoSpeechProb(Double noSpeechProb) {
        this.noSpeechProb = noSpeechProb;
    }
}
