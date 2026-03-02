package types

// OpenAI thread message list response
type ThreadMessageListResponse struct {
	Object string `json:"object"`
	Data []ThreadMessageResponse `json:"data"`
	HasMore bool `json:"has_more"`
	FirstId string `json:"first_id"`
	LastId string `json:"last_id"`
}
