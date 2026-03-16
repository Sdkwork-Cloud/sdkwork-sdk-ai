package com.sdkwork.ai.model;

public class ChatCompletionRequest {
    private String model;
    private List<ChatMessage> messages;
    private Double temperature;
    private Integer n;
    private Boolean stream;
    private List<String> stop;
    private String user;
    private List<Tool> tools;
    private Double seed;
    private List<String> modalities;
    private AudioParameters audio;
    private Boolean store;
    private Map<String, String> metadata;
    private Thinking thinking;
    private Double topP;
    private Integer maxTokens;
    private Integer maxCompletionTokens;
    private Double presencePenalty;
    private Double frequencyPenalty;
    private Map<String, Integer> logitBias;
    private ResponseFormat responseFormat;
    private Object toolChoice;
    private String serviceTier;
    private StreamOptions streamOptions;
    private String reasoningEffort;
    private Boolean parallelToolCalls;
    private Boolean logprobs;
    private Integer topLogprobs;

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public List<ChatMessage> getMessages() {
        return this.messages;
    }
    
    public void setMessages(List<ChatMessage> messages) {
        this.messages = messages;
    }

    public Double getTemperature() {
        return this.temperature;
    }
    
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Integer getN() {
        return this.n;
    }
    
    public void setN(Integer n) {
        this.n = n;
    }

    public Boolean getStream() {
        return this.stream;
    }
    
    public void setStream(Boolean stream) {
        this.stream = stream;
    }

    public List<String> getStop() {
        return this.stop;
    }
    
    public void setStop(List<String> stop) {
        this.stop = stop;
    }

    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    public List<Tool> getTools() {
        return this.tools;
    }
    
    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    public Double getSeed() {
        return this.seed;
    }
    
    public void setSeed(Double seed) {
        this.seed = seed;
    }

    public List<String> getModalities() {
        return this.modalities;
    }
    
    public void setModalities(List<String> modalities) {
        this.modalities = modalities;
    }

    public AudioParameters getAudio() {
        return this.audio;
    }
    
    public void setAudio(AudioParameters audio) {
        this.audio = audio;
    }

    public Boolean getStore() {
        return this.store;
    }
    
    public void setStore(Boolean store) {
        this.store = store;
    }

    public Map<String, String> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public Thinking getThinking() {
        return this.thinking;
    }
    
    public void setThinking(Thinking thinking) {
        this.thinking = thinking;
    }

    public Double getTopP() {
        return this.topP;
    }
    
    public void setTopP(Double topP) {
        this.topP = topP;
    }

    public Integer getMaxTokens() {
        return this.maxTokens;
    }
    
    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public Integer getMaxCompletionTokens() {
        return this.maxCompletionTokens;
    }
    
    public void setMaxCompletionTokens(Integer maxCompletionTokens) {
        this.maxCompletionTokens = maxCompletionTokens;
    }

    public Double getPresencePenalty() {
        return this.presencePenalty;
    }
    
    public void setPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
    }

    public Double getFrequencyPenalty() {
        return this.frequencyPenalty;
    }
    
    public void setFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
    }

    public Map<String, Integer> getLogitBias() {
        return this.logitBias;
    }
    
    public void setLogitBias(Map<String, Integer> logitBias) {
        this.logitBias = logitBias;
    }

    public ResponseFormat getResponseFormat() {
        return this.responseFormat;
    }
    
    public void setResponseFormat(ResponseFormat responseFormat) {
        this.responseFormat = responseFormat;
    }

    public Object getToolChoice() {
        return this.toolChoice;
    }
    
    public void setToolChoice(Object toolChoice) {
        this.toolChoice = toolChoice;
    }

    public String getServiceTier() {
        return this.serviceTier;
    }
    
    public void setServiceTier(String serviceTier) {
        this.serviceTier = serviceTier;
    }

    public StreamOptions getStreamOptions() {
        return this.streamOptions;
    }
    
    public void setStreamOptions(StreamOptions streamOptions) {
        this.streamOptions = streamOptions;
    }

    public String getReasoningEffort() {
        return this.reasoningEffort;
    }
    
    public void setReasoningEffort(String reasoningEffort) {
        this.reasoningEffort = reasoningEffort;
    }

    public Boolean getParallelToolCalls() {
        return this.parallelToolCalls;
    }
    
    public void setParallelToolCalls(Boolean parallelToolCalls) {
        this.parallelToolCalls = parallelToolCalls;
    }

    public Boolean getLogprobs() {
        return this.logprobs;
    }
    
    public void setLogprobs(Boolean logprobs) {
        this.logprobs = logprobs;
    }

    public Integer getTopLogprobs() {
        return this.topLogprobs;
    }
    
    public void setTopLogprobs(Integer topLogprobs) {
        this.topLogprobs = topLogprobs;
    }
}
