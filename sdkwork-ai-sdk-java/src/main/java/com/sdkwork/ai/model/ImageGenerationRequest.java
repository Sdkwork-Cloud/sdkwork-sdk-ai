package com.sdkwork.ai.model;

public class ImageGenerationRequest {
    private String model;
    private String prompt;
    private Integer n;
    private String quality;
    private String size;
    private String style;
    private String user;
    private List<String> image;
    private Map<String, Object> extra;
    private String responseFormat;

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public Integer getN() {
        return this.n;
    }
    
    public void setN(Integer n) {
        this.n = n;
    }

    public String getQuality() {
        return this.quality;
    }
    
    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getSize() {
        return this.size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }

    public String getStyle() {
        return this.style;
    }
    
    public void setStyle(String style) {
        this.style = style;
    }

    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    public List<String> getImage() {
        return this.image;
    }
    
    public void setImage(List<String> image) {
        this.image = image;
    }

    public Map<String, Object> getExtra() {
        return this.extra;
    }
    
    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }

    public String getResponseFormat() {
        return this.responseFormat;
    }
    
    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }
}
