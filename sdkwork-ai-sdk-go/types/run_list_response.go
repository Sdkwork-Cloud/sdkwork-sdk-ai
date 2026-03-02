package types

// OpenAI run list response
type RunListResponse struct {
	Object string `json:"object"`
	Data []RunResponse `json:"data"`
	HasMore bool `json:"has_more"`
	FirstId string `json:"first_id"`
	LastId string `json:"last_id"`
}
