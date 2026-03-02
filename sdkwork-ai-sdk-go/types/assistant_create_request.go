package types

// Assistant creation request
type AssistantCreateRequest struct {
	Model string `json:"model"`
	Name string `json:"name"`
	Description string `json:"description"`
	Instructions string `json:"instructions"`
	Tools []Tool `json:"tools"`
	Metadata map[string]string `json:"metadata"`
	Temperature float64 `json:"temperature"`
	ToolResources map[string]interface{} `json:"tool_resources"`
	ResponseFormat ResponseFormat `json:"response_format"`
	TopP float64 `json:"top_p"`
}
