package types

// Image generation request
type ImageGenerationRequest struct {
	Model string `json:"model"`
	Prompt string `json:"prompt"`
	N int `json:"n"`
	Quality string `json:"quality"`
	Size string `json:"size"`
	Style string `json:"style"`
	User string `json:"user"`
	Image []string `json:"image"`
	Extra map[string]interface{} `json:"extra"`
	ResponseFormat string `json:"response_format"`
}
