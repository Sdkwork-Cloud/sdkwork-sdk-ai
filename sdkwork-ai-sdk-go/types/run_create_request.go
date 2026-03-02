package types

// Run creation request
type RunCreateRequest struct {
	Model string `json:"model"`
	Instructions string `json:"instructions"`
	Tools []interface{} `json:"tools"`
	Metadata map[string]string `json:"metadata"`
	Temperature float64 `json:"temperature"`
	Stream bool `json:"stream"`
	AssistantId string `json:"assistant_id"`
	AdditionalInstructions string `json:"additional_instructions"`
	AdditionalMessages []map[string]interface{} `json:"additional_messages"`
	ToolResources map[string]interface{} `json:"tool_resources"`
	TopP float64 `json:"top_p"`
	MaxPromptTokens int `json:"max_prompt_tokens"`
	MaxCompletionTokens int `json:"max_completion_tokens"`
	TruncationStrategy TruncationStrategy `json:"truncation_strategy"`
}
