package com.sdkwork.ai.model;

public class OpenAiVideo {
    private String id;
    private String object;
    private String model;
    private String status;
    private Integer progress;
    private String prompt;
    private String seconds;
    private String size;
    private String quality;
    private VideoError error;
    private Integer createdAt;
    private Integer completedAt;
    private Integer expiresAt;
    private String outputUrl;
    private String remixedFromVideoId;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return this.object;
    }
    
    public void setObject(String object) {
        this.object = object;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getProgress() {
        return this.progress;
    }
    
    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getSeconds() {
        return this.seconds;
    }
    
    public void setSeconds(String seconds) {
        this.seconds = seconds;
    }

    public String getSize() {
        return this.size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }

    public String getQuality() {
        return this.quality;
    }
    
    public void setQuality(String quality) {
        this.quality = quality;
    }

    public VideoError getError() {
        return this.error;
    }
    
    public void setError(VideoError error) {
        this.error = error;
    }

    public Integer getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCompletedAt() {
        return this.completedAt;
    }
    
    public void setCompletedAt(Integer completedAt) {
        this.completedAt = completedAt;
    }

    public Integer getExpiresAt() {
        return this.expiresAt;
    }
    
    public void setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
    }

    public String getOutputUrl() {
        return this.outputUrl;
    }
    
    public void setOutputUrl(String outputUrl) {
        this.outputUrl = outputUrl;
    }

    public String getRemixedFromVideoId() {
        return this.remixedFromVideoId;
    }
    
    public void setRemixedFromVideoId(String remixedFromVideoId) {
        this.remixedFromVideoId = remixedFromVideoId;
    }
}
