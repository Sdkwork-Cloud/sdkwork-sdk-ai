package types

// Rerank request
type RerankRequest struct {
	Query string `json:"query"`
	Documents []Document `json:"documents"`
	Model string `json:"model"`
	TopN int `json:"top_n"`
	ReturnDocuments bool `json:"return_documents"`
}
