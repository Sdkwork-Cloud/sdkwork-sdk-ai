package types

// 请求统计
type RequestCounts struct {
	Total int `json:"total"`
	Completed int `json:"completed"`
	Failed int `json:"failed"`
}
