package com.sdkwork.ai.model;

public class Attachment {
    private List<Map<String, Object>> tools;
    private String fileId;

    public List<Map<String, Object>> getTools() {
        return this.tools;
    }
    
    public void setTools(List<Map<String, Object>> tools) {
        this.tools = tools;
    }

    public String getFileId() {
        return this.fileId;
    }
    
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}
