package com.sdkwork.ai.model;

public class BatchCreateRequest {
    private String endpoint;
    private Map<String, String> metadata;
    private String inputFileId;
    private String completionWindow;

    public String getEndpoint() {
        return this.endpoint;
    }
    
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public Map<String, String> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public String getInputFileId() {
        return this.inputFileId;
    }
    
    public void setInputFileId(String inputFileId) {
        this.inputFileId = inputFileId;
    }

    public String getCompletionWindow() {
        return this.completionWindow;
    }
    
    public void setCompletionWindow(String completionWindow) {
        this.completionWindow = completionWindow;
    }
}
