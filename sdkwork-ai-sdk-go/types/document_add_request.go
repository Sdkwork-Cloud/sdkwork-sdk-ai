package types

// Document add request
type DocumentAddRequest struct {
	Content string `json:"content"`
	Title string `json:"title"`
	Type string `json:"type"`
	Metadata map[string]interface{} `json:"metadata"`
	ChunkConfig ChunkConfig `json:"chunkConfig"`
	KnowledgeBaseId string `json:"knowledge_base_id"`
}
