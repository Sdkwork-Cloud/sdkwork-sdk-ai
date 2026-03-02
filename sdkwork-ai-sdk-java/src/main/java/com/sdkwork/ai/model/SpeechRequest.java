package com.sdkwork.ai.model;

public class SpeechRequest {
    private String model;
    private String input;
    private String voice;
    private Double speed;
    private Map<String, Object> extra;
    private String responseFormat;

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getInput() {
        return this.input;
    }
    
    public void setInput(String input) {
        this.input = input;
    }

    public String getVoice() {
        return this.voice;
    }
    
    public void setVoice(String voice) {
        this.voice = voice;
    }

    public Double getSpeed() {
        return this.speed;
    }
    
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Map<String, Object> getExtra() {
        return this.extra;
    }
    
    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }

    public String getResponseFormat() {
        return this.responseFormat;
    }
    
    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }
}
