package types

// 知识检索响应
type KnowledgeSearchResponse struct {
	Results []SearchResult `json:"results"`
	Total int `json:"total"`
}
