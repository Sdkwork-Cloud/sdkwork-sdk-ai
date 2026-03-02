package types

// OpenAI标准审核响应
type ModerationResponse struct {
	Id string `json:"id"`
	Model string `json:"model"`
	Results []ModerationResult `json:"results"`
}
