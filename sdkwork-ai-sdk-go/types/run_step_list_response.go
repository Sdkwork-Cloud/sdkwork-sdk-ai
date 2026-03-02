package types

// OpenAI run step list response
type RunStepListResponse struct {
	Object string `json:"object"`
	Data []RunStepResponse `json:"data"`
	HasMore bool `json:"has_more"`
	FirstId string `json:"first_id"`
	LastId string `json:"last_id"`
}
