package types

// Embedding request
type EmbeddingRequest struct {
	Model string `json:"model"`
	Input interface{} `json:"input"`
	Dimensions int `json:"dimensions"`
	User string `json:"user"`
	EncodingFormat string `json:"encoding_format"`
}
