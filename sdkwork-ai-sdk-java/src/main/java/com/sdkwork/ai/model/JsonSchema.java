package com.sdkwork.ai.model;

public class JsonSchema {
    private String name;
    private String description;
    private Object schema;
    private Boolean strict;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Object getSchema() {
        return this.schema;
    }
    
    public void setSchema(Object schema) {
        this.schema = schema;
    }

    public Boolean getStrict() {
        return this.strict;
    }
    
    public void setStrict(Boolean strict) {
        this.strict = strict;
    }
}
