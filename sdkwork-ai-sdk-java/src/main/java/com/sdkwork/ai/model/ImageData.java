package com.sdkwork.ai.model;

public class ImageData {
    private String url;
    private String b64Json;
    private String revisedPrompt;

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getB64Json() {
        return this.b64Json;
    }
    
    public void setB64Json(String b64Json) {
        this.b64Json = b64Json;
    }

    public String getRevisedPrompt() {
        return this.revisedPrompt;
    }
    
    public void setRevisedPrompt(String revisedPrompt) {
        this.revisedPrompt = revisedPrompt;
    }
}
