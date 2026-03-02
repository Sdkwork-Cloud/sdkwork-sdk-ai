package types

// Video generation request
type VideoGenerationRequest struct {
	Prompt string `json:"prompt"`
	Model string `json:"model"`
	Seconds string `json:"seconds"`
	Size string `json:"size"`
	Quality string `json:"quality"`
	User string `json:"user"`
	NegativePrompt string `json:"negative_prompt"`
	ImageUrls []string `json:"image_urls"`
}
