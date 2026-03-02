package com.sdkwork.ai.model;

public class Filter {
    private String field;
    private String op;
    private Object value;

    public String getField() {
        return this.field;
    }
    
    public void setField(String field) {
        this.field = field;
    }

    public String getOp() {
        return this.op;
    }
    
    public void setOp(String op) {
        this.op = op;
    }

    public Object getValue() {
        return this.value;
    }
    
    public void setValue(Object value) {
        this.value = value;
    }
}
