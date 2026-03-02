package types

// 文档响应
type DocumentResponse struct {
	Title string `json:"title"`
	Type string `json:"type"`
	Status string `json:"status"`
	Metadata map[string]interface{} `json:"metadata"`
	DocumentId string `json:"document_id"`
	KnowledgeBaseId string `json:"knowledge_base_id"`
	ChunkCount int `json:"chunk_count"`
	CreatedAt int `json:"created_at"`
	UpdatedAt int `json:"updated_at"`
}
