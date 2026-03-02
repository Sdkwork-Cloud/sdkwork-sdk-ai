package types

// 聊天完成响应
type ChatCompletionResponse struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Created int `json:"created"`
	Model string `json:"model"`
	Choices []Choice `json:"choices"`
	Usage Usage `json:"usage"`
	SystemFingerprint string `json:"system_fingerprint"`
	ServiceTier string `json:"service_tier"`
}
