package types

// OpenAI标准聊天消息列表
type ChatMessageList struct {
	Object string `json:"object"`
	Data []ChatMessage `json:"data"`
	HasMore bool `json:"has_more"`
	FirstId string `json:"first_id"`
	LastId string `json:"last_id"`
}
