package types

// OpenAI标准聊天完成列表
type ChatCompletionList struct {
	Object string `json:"object"`
	Data []ChatCompletionResponse `json:"data"`
	HasMore bool `json:"has_more"`
	FirstId string `json:"first_id"`
	LastId string `json:"last_id"`
}
