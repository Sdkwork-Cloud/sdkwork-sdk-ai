package types

// Context creation request
type ContextCreateRequest struct {
	Model string `json:"model"`
	Messages []ContextMessage `json:"messages"`
	Mode string `json:"mode"`
	Ttl int `json:"ttl"`
	TruncationStrategy TruncationStrategy `json:"truncationStrategy"`
}
