package types

// 所需操作
type RequiredAction struct {
	Type string `json:"type"`
	SubmitToolOutputs SubmitToolOutputs `json:"submit_tool_outputs"`
}
