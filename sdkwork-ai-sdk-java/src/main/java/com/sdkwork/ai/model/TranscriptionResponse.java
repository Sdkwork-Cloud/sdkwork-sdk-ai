package com.sdkwork.ai.model;

public class TranscriptionResponse {
    private String text;
    private String task;
    private String language;
    private Double duration;
    private List<Word> words;
    private List<Segment> segments;

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public String getTask() {
        return this.task;
    }
    
    public void setTask(String task) {
        this.task = task;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public Double getDuration() {
        return this.duration;
    }
    
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public List<Word> getWords() {
        return this.words;
    }
    
    public void setWords(List<Word> words) {
        this.words = words;
    }

    public List<Segment> getSegments() {
        return this.segments;
    }
    
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }
}
