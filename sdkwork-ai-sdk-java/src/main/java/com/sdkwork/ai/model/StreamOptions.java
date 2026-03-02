package com.sdkwork.ai.model;

public class StreamOptions {
    private Boolean includeUsage;
    private Boolean chunkIncludeUsage;

    public Boolean getIncludeUsage() {
        return this.includeUsage;
    }
    
    public void setIncludeUsage(Boolean includeUsage) {
        this.includeUsage = includeUsage;
    }

    public Boolean getChunkIncludeUsage() {
        return this.chunkIncludeUsage;
    }
    
    public void setChunkIncludeUsage(Boolean chunkIncludeUsage) {
        this.chunkIncludeUsage = chunkIncludeUsage;
    }
}
