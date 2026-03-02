package types

// 最可能的token
type TopLogprob struct {
	Token string `json:"token"`
	Logprob float64 `json:"logprob"`
	Bytes []int `json:"bytes"`
}
