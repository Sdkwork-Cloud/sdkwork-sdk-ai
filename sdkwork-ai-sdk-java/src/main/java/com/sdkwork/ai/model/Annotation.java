package com.sdkwork.ai.model;

public class Annotation {
    private String type;
    private String text;
    private FileCitation fileCitation;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public FileCitation getFileCitation() {
        return this.fileCitation;
    }
    
    public void setFileCitation(FileCitation fileCitation) {
        this.fileCitation = fileCitation;
    }
}
