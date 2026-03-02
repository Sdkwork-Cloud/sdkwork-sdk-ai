package types

// 工具调用
type ToolCall struct {
	Id string `json:"id"`
	Type string `json:"type"`
	Function FunctionCall `json:"function"`
}
