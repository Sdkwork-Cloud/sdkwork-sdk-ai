package types

// 检索结果
type SearchResult struct {
	Content string `json:"content"`
	Score float64 `json:"score"`
	Metadata map[string]interface{} `json:"metadata"`
	DocumentId string `json:"document_id"`
	ChunkId string `json:"chunk_id"`
}
