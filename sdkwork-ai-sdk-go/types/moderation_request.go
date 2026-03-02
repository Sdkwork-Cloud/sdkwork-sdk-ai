package types

// Moderation request
type ModerationRequest struct {
	Model string `json:"model"`
	Input interface{} `json:"input"`
	User string `json:"user"`
}
