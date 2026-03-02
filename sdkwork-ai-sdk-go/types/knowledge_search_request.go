package types

// Search request
type KnowledgeSearchRequest struct {
	Query string `json:"query"`
	Filters []Filter `json:"filters"`
	KnowledgeBaseId string `json:"knowledge_base_id"`
	TopK int `json:"top_k"`
	ScoreThreshold float64 `json:"score_threshold"`
}
