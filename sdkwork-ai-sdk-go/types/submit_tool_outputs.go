package types

// 提交工具输出
type SubmitToolOutputs struct {
	ToolCalls []ToolCall `json:"tool_calls"`
}
