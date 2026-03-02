package types

// 知识库响应
type KnowledgeBaseResponse struct {
	Name string `json:"name"`
	Description string `json:"description"`
	Status string `json:"status"`
	KnowledgeBaseId string `json:"knowledge_base_id"`
	EmbeddingModelId string `json:"embedding_model_id"`
	IndexType string `json:"index_type"`
	CreatedAt int `json:"created_at"`
	UpdatedAt int `json:"updated_at"`
	DocCount int `json:"doc_count"`
}
