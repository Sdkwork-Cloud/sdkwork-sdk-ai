package types

// Thread creation request
type ThreadCreateRequest struct {
	Messages []Message `json:"messages"`
	Metadata map[string]string `json:"metadata"`
	ToolResources map[string]interface{} `json:"tool_resources"`
}
