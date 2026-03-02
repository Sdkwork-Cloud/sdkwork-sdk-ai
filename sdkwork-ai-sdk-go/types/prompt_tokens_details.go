package types

// 输入token详情
type PromptTokensDetails struct {
	CachedTokens int `json:"cached_tokens"`
	AudioTokens int `json:"audio_tokens"`
}
