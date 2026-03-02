package com.sdkwork.ai.model;

public class RunStepListResponse {
    private String object;
    private List<RunStepResponse> data;
    private Boolean hasMore;
    private String firstId;
    private String lastId;

    public String getObject() {
        return this.object;
    }
    
    public void setObject(String object) {
        this.object = object;
    }

    public List<RunStepResponse> getData() {
        return this.data;
    }
    
    public void setData(List<RunStepResponse> data) {
        this.data = data;
    }

    public Boolean getHasMore() {
        return this.hasMore;
    }
    
    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
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
}
