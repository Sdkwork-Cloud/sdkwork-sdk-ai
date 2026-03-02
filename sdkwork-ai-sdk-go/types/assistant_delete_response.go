package types

// OpenAI assistant delete response
type AssistantDeleteResponse struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Deleted bool `json:"deleted"`
}
