package types

// 助手响应
type AssistantResponse struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Model string `json:"model"`
	Name string `json:"name"`
	Description string `json:"description"`
	Instructions string `json:"instructions"`
	Tools []interface{} `json:"tools"`
	Metadata map[string]string `json:"metadata"`
	Temperature float64 `json:"temperature"`
	CreatedAt int `json:"created_at"`
	ToolResources map[string]interface{} `json:"tool_resources"`
	ResponseFormat interface{} `json:"response_format"`
	TopP float64 `json:"top_p"`
}
