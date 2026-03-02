package types

// 上下文消息
type ContextMessage struct {
	Role string `json:"role"`
	Content string `json:"content"`
	Name string `json:"name"`
	ToolCalls []ToolCall `json:"toolCalls"`
}
