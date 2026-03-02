package types

// 上下文缓存响应
type ContextResponse struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Created int `json:"created"`
	Model string `json:"model"`
	Mode string `json:"mode"`
	Ttl int `json:"ttl"`
	TruncationStrategy TruncationStrategy `json:"truncationStrategy"`
	Usage Usage `json:"usage"`
}
