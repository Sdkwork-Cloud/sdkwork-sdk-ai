package types

// 线程响应
type ThreadResponse struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Metadata map[string]string `json:"metadata"`
	CreatedAt int `json:"created_at"`
	ToolResources map[string]interface{} `json:"tool_resources"`
}
