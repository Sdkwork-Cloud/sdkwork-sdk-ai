package types

// 选择项
type Choice struct {
	Index int `json:"index"`
	Message Message `json:"message"`
	Logprobs Logprobs `json:"logprobs"`
	FinishReason string `json:"finish_reason"`
	ModerationHitType string `json:"moderation_hit_type"`
}
