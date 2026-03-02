package types

// OpenAI标准视频对象
type OpenAiVideo struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Model string `json:"model"`
	Status string `json:"status"`
	Progress int `json:"progress"`
	Prompt string `json:"prompt"`
	Seconds string `json:"seconds"`
	Size string `json:"size"`
	Quality string `json:"quality"`
	Error VideoError `json:"error"`
	CreatedAt int `json:"created_at"`
	CompletedAt int `json:"completed_at"`
	ExpiresAt int `json:"expires_at"`
	OutputUrl string `json:"output_url"`
	RemixedFromVideoId string `json:"remixed_from_video_id"`
}
