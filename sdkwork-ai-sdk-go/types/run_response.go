package types

// 运行响应
type RunResponse struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Status string `json:"status"`
	Model string `json:"model"`
	Instructions string `json:"instructions"`
	Tools []interface{} `json:"tools"`
	Metadata map[string]string `json:"metadata"`
	Usage Usage `json:"usage"`
	Temperature float64 `json:"temperature"`
	CreatedAt int `json:"created_at"`
	ThreadId string `json:"thread_id"`
	AssistantId string `json:"assistant_id"`
	RequiredAction RequiredAction `json:"required_action"`
	LastError LastError `json:"last_error"`
	ExpiresAt int `json:"expires_at"`
	StartedAt int `json:"started_at"`
	CancelledAt int `json:"cancelled_at"`
	FailedAt int `json:"failed_at"`
	CompletedAt int `json:"completed_at"`
	ToolResources map[string]interface{} `json:"tool_resources"`
	TopP float64 `json:"top_p"`
	MaxPromptTokens int `json:"max_prompt_tokens"`
	MaxCompletionTokens int `json:"max_completion_tokens"`
	TruncationStrategy interface{} `json:"truncation_strategy"`
}
