package types

// 对数概率
type Logprobs struct {
	Content []Content `json:"content"`
	Refusal []Content `json:"refusal"`
}
