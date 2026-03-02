package types

// Chat completion request
type ChatCompletionRequest struct {
	Model string `json:"model"`
	Messages []ChatMessage `json:"messages"`
	Temperature float64 `json:"temperature"`
	N int `json:"n"`
	Stream bool `json:"stream"`
	Stop []string `json:"stop"`
	User string `json:"user"`
	Tools []Tool `json:"tools"`
	ToolChoice interface{} `json:"toolChoice"`
	Seed float64 `json:"seed"`
	StreamOptions StreamOptions `json:"streamOptions"`
	Modalities []string `json:"modalities"`
	Audio AudioParameters `json:"audio"`
	Store bool `json:"store"`
	Metadata map[string]string `json:"metadata"`
	Thinking Thinking `json:"thinking"`
	TopP float64 `json:"top_p"`
	MaxTokens int `json:"max_tokens"`
	MaxCompletionTokens int `json:"max_completion_tokens"`
	PresencePenalty float64 `json:"presence_penalty"`
	FrequencyPenalty float64 `json:"frequency_penalty"`
	LogitBias map[string]int `json:"logit_bias"`
	ResponseFormat ResponseFormat `json:"response_format"`
	ServiceTier string `json:"service_tier"`
	ReasoningEffort string `json:"reasoning_effort"`
	ParallelToolCalls bool `json:"parallel_tool_calls"`
	Logprobs bool `json:"logprobs"`
	TopLogprobs int `json:"top_logprobs"`
}
