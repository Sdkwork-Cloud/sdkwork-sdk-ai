package types

// 内容对数概率
type Content struct {
	Token string `json:"token"`
	Logprob float64 `json:"logprob"`
	Bytes []int `json:"bytes"`
	TopLogprobs []TopLogprob `json:"top_logprobs"`
}
