package com.sdkwork.ai.model;

public class ResponseFormat {
    private String type;
    private JsonSchema jsonSchema;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public JsonSchema getJsonSchema() {
        return this.jsonSchema;
    }
    
    public void setJsonSchema(JsonSchema jsonSchema) {
        this.jsonSchema = jsonSchema;
    }
}
