package types

// Message update payload
type ThreadMessageModifyRequest struct {
	Metadata map[string]string `json:"metadata"`
}
