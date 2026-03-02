package types

// Knowledge base creation request
type KnowledgeBaseCreateRequest struct {
	Name string `json:"name"`
	Description string `json:"description"`
	Extra map[string]interface{} `json:"extra"`
	EmbeddingModelId string `json:"embedding_model_id"`
	IndexType string `json:"index_type"`
}
