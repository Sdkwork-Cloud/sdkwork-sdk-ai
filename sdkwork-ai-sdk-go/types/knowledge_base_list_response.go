package types

// 知识库列表响应
type KnowledgeBaseListResponse struct {
	Data []KnowledgeBaseResponse `json:"data"`
	Total int `json:"total"`
	HasMore bool `json:"has_more"`
}
