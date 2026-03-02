package com.sdkwork.ai.model;

public class ContentBlock {
    private String type;
    private TextContent text;
    private ImageFileContent imageFile;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public TextContent getText() {
        return this.text;
    }
    
    public void setText(TextContent text) {
        this.text = text;
    }

    public ImageFileContent getImageFile() {
        return this.imageFile;
    }
    
    public void setImageFile(ImageFileContent imageFile) {
        this.imageFile = imageFile;
    }
}
