package types

// OpenAI batch list response
type BatchListResponse struct {
	Object string `json:"object"`
	Data []BatchResponse `json:"data"`
	HasMore bool `json:"has_more"`
	FirstId string `json:"first_id"`
	LastId string `json:"last_id"`
}
