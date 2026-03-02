package com.sdkwork.ai.model;

public class ImageGenerationResponse {
    private Integer created;
    private List<ImageData> data;

    public Integer getCreated() {
        return this.created;
    }
    
    public void setCreated(Integer created) {
        this.created = created;
    }

    public List<ImageData> getData() {
        return this.data;
    }
    
    public void setData(List<ImageData> data) {
        this.data = data;
    }
}
