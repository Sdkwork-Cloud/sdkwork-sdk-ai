package com.sdkwork.ai.model;

public class Errors {
    private ErrorObject object;
    private Object data;

    public ErrorObject getObject() {
        return this.object;
    }
    
    public void setObject(ErrorObject object) {
        this.object = object;
    }

    public Object getData() {
        return this.data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }
}
