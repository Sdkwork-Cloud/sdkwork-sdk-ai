package types

// OpenAI标准嵌入响应
type EmbeddingResponse struct {
	Object string `json:"object"`
	Data []Embedding `json:"data"`
	Model string `json:"model"`
	Usage Usage `json:"usage"`
}
