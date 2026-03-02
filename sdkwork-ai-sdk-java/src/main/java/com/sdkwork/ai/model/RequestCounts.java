package com.sdkwork.ai.model;

public class RequestCounts {
    private Integer total;
    private Integer completed;
    private Integer failed;

    public Integer getTotal() {
        return this.total;
    }
    
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCompleted() {
        return this.completed;
    }
    
    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    public Integer getFailed() {
        return this.failed;
    }
    
    public void setFailed(Integer failed) {
        this.failed = failed;
    }
}
