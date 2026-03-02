package types

// Music generation request
type MusicGenerationRequest struct {
	Model string `json:"model"`
	Prompt string `json:"prompt"`
	NegativePrompt string `json:"negativePrompt"`
	Duration int `json:"duration"`
	Format string `json:"format"`
	N int `json:"n"`
	ReferenceAudio string `json:"referenceAudio"`
	Style string `json:"style"`
	Metadata map[string]string `json:"metadata"`
	ResponseFormat string `json:"response_format"`
}
