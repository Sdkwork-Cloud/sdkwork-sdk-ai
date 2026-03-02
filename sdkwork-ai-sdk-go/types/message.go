package types

// 消息
type Message struct {
	Role string `json:"role"`
	Content interface{} `json:"content"`
	Refusal string `json:"refusal"`
	Annotations []interface{} `json:"annotations"`
	ReasoningContent string `json:"reasoning_content"`
	ToolCalls []ToolCall `json:"tool_calls"`
}
