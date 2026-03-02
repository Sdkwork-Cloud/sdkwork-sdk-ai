package types

// Speech request
type SpeechRequest struct {
	Model string `json:"model"`
	Input string `json:"input"`
	Voice string `json:"voice"`
	Speed float64 `json:"speed"`
	Extra map[string]interface{} `json:"extra"`
	ResponseFormat string `json:"response_format"`
}
