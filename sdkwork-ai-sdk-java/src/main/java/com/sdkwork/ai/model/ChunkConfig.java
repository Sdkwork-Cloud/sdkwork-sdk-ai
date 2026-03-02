package com.sdkwork.ai.model;

public class ChunkConfig {
    private String separator;
    private Integer chunkSize;
    private Integer chunkOverlap;

    public String getSeparator() {
        return this.separator;
    }
    
    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public Integer getChunkSize() {
        return this.chunkSize;
    }
    
    public void setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
    }

    public Integer getChunkOverlap() {
        return this.chunkOverlap;
    }
    
    public void setChunkOverlap(Integer chunkOverlap) {
        this.chunkOverlap = chunkOverlap;
    }
}
