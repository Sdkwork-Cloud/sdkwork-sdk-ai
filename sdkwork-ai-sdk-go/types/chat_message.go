package types

// OpenAI标准聊天消息
type ChatMessage struct {
	Role string `json:"role"`
	Content interface{} `json:"content"`
	Name string `json:"name"`
	Refusal string `json:"refusal"`
	Audio Audio `json:"audio"`
	Annotations []Annotation `json:"annotations"`
	ToolCalls []ToolCall `json:"tool_calls"`
	ToolCallId string `json:"tool_call_id"`
}
