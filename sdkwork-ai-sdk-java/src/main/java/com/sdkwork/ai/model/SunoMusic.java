package com.sdkwork.ai.model;

public class SunoMusic {
    private String id;
    private String object;
    private String title;
    private String status;
    private Integer duration;
    private List<String> tags;
    private String genre;
    private String audioUrl;
    private String lyrics;
    private Boolean instrumental;
    private MusicError error;
    private Integer createdAt;
    private Integer completedAt;

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

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getGenre() {
        return this.genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAudioUrl() {
        return this.audioUrl;
    }
    
    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public String getLyrics() {
        return this.lyrics;
    }
    
    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public Boolean getInstrumental() {
        return this.instrumental;
    }
    
    public void setInstrumental(Boolean instrumental) {
        this.instrumental = instrumental;
    }

    public MusicError getError() {
        return this.error;
    }
    
    public void setError(MusicError error) {
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
}
