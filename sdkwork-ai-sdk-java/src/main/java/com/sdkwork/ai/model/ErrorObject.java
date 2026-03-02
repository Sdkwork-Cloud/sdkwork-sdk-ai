package com.sdkwork.ai.model;

public class ErrorObject {
    private String code;
    private String message;
    private Integer line;
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

    public Integer getLine() {
        return this.line;
    }
    
    public void setLine(Integer line) {
        this.line = line;
    }

    public String getParam() {
        return this.param;
    }
    
    public void setParam(String param) {
        this.param = param;
    }
}
