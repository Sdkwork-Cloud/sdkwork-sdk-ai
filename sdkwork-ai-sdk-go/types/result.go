package types

// 重排结果
type Result struct {
	Index int `json:"index"`
	Score float64 `json:"score"`
	Document string `json:"document"`
}
