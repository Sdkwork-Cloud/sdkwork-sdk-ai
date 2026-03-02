package com.sdkwork.ai.model;

public class KnowledgeBaseListResponse {
    private List<KnowledgeBaseResponse> data;
    private Integer total;
    private Boolean hasMore;

    public List<KnowledgeBaseResponse> getData() {
        return this.data;
    }
    
    public void setData(List<KnowledgeBaseResponse> data) {
        this.data = data;
    }

    public Integer getTotal() {
        return this.total;
    }
    
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Boolean getHasMore() {
        return this.hasMore;
    }
    
    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }
}
