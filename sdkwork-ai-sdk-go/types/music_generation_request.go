package types

// Music generation request
type MusicGenerationRequest struct {
	Model string `json:"model"`
	Prompt string `json:"prompt"`
	Duration int `json:"duration"`
	Format string `json:"format"`
	N int `json:"n"`
	Style string `json:"style"`
	Metadata map[string]string `json:"metadata"`
	NegativePrompt string `json:"negative_prompt"`
	ResponseFormat string `json:"response_format"`
	ReferenceAudio string `json:"reference_audio"`
}
