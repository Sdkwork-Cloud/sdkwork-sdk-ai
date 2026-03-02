package com.sdkwork.ai.model;

public class EmbeddingRequest {
    private String model;
    private Object input;
    private Integer dimensions;
    private String user;
    private String encodingFormat;

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public Object getInput() {
        return this.input;
    }
    
    public void setInput(Object input) {
        this.input = input;
    }

    public Integer getDimensions() {
        return this.dimensions;
    }
    
    public void setDimensions(Integer dimensions) {
        this.dimensions = dimensions;
    }

    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    public String getEncodingFormat() {
        return this.encodingFormat;
    }
    
    public void setEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
    }
}
