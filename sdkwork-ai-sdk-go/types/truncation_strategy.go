package types

// 截断策略
type TruncationStrategy struct {
	Type string `json:"type"`
	LastMessages int `json:"last_messages"`
}
