package types

// OpenAI assistant list response
type AssistantListResponse struct {
	Object string `json:"object"`
	Data []AssistantResponse `json:"data"`
	HasMore bool `json:"has_more"`
	FirstId string `json:"first_id"`
	LastId string `json:"last_id"`
}
