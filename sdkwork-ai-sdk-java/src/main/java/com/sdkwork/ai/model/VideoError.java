package com.sdkwork.ai.model;

public class VideoError {
    private String code;
    private String message;
    private String type;
    private String param;

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getParam() {
        return this.param;
    }
    
    public void setParam(String param) {
        this.param = param;
    }
}
