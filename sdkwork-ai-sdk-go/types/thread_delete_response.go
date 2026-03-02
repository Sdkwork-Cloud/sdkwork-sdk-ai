package types

// OpenAI thread delete response
type ThreadDeleteResponse struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Deleted bool `json:"deleted"`
}
