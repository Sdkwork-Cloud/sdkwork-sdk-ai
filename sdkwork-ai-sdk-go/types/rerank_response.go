package types

// 重排响应
type RerankResponse struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Model string `json:"model"`
	Results []Result `json:"results"`
	Usage Usage `json:"usage"`
}
