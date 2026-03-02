package com.sdkwork.ai.model;

public class OpenAiFileList {
    private List<OpenAiFileObject> data;
    private String object;
    private String firstId;
    private String lastId;
    private Boolean hasMore;

    public List<OpenAiFileObject> getData() {
        return this.data;
    }
    
    public void setData(List<OpenAiFileObject> data) {
        this.data = data;
    }

    public String getObject() {
        return this.object;
    }
    
    public void setObject(String object) {
        this.object = object;
    }

    public String getFirstId() {
        return this.firstId;
    }
    
    public void setFirstId(String firstId) {
        this.firstId = firstId;
    }

    public String getLastId() {
        return this.lastId;
    }
    
    public void setLastId(String lastId) {
        this.lastId = lastId;
    }

    public Boolean getHasMore() {
        return this.hasMore;
    }
    
    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }
}
