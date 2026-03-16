package types

// Video generation request
type VideoGenerationRequest struct {
	Prompt string `json:"prompt"`
	Model string `json:"model"`
	Seconds string `json:"seconds"`
	Size string `json:"size"`
	Quality string `json:"quality"`
	Width int `json:"width"`
	Height int `json:"height"`
	Seed int `json:"seed"`
	User string `json:"user"`
	NegativePrompt string `json:"negative_prompt"`
	ImageUrls []string `json:"image_urls"`
	AspectRatio string `json:"aspect_ratio"`
	ResponseFormat string `json:"response_format"`
}
