package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type KnowledgeBaseApi struct {
    client *sdkhttp.Client
}

func NewKnowledgeBaseApi(client *sdkhttp.Client) *KnowledgeBaseApi {
    return &KnowledgeBaseApi{client: client}
}

// List documents
func (a *KnowledgeBaseApi) ListDocuments(knowledge_base_id string, query map[string]interface{}) (sdktypes.ListDocumentsGetResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/knowledge-bases/%s/documents", knowledge_base_id)), query, nil)
    if err != nil {
        var zero sdktypes.ListDocumentsGetResponse
        return zero, err
    }
    return decodeResult[sdktypes.ListDocumentsGetResponse](raw)
}

// Add document
func (a *KnowledgeBaseApi) AddDocument(knowledge_base_id string, body sdktypes.DocumentAddRequest) (sdktypes.DocumentResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/knowledge-bases/%s/documents", knowledge_base_id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.DocumentResponse
        return zero, err
    }
    return decodeResult[sdktypes.DocumentResponse](raw)
}

// Search knowledge
func (a *KnowledgeBaseApi) SearchKnowledge(body sdktypes.KnowledgeSearchRequest) (sdktypes.KnowledgeSearchResponse, error) {
    raw, err := a.client.Post(AiApiPath("/knowledge-bases/search"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.KnowledgeSearchResponse
        return zero, err
    }
    return decodeResult[sdktypes.KnowledgeSearchResponse](raw)
}

// List knowledge bases
func (a *KnowledgeBaseApi) ListKnowledgeBases(query map[string]interface{}) (sdktypes.KnowledgeBaseListResponse, error) {
    raw, err := a.client.Get(AiApiPath("/knowledge-bases"), query, nil)
    if err != nil {
        var zero sdktypes.KnowledgeBaseListResponse
        return zero, err
    }
    return decodeResult[sdktypes.KnowledgeBaseListResponse](raw)
}

// Create knowledge base
func (a *KnowledgeBaseApi) CreateKnowledgeBase(body sdktypes.KnowledgeBaseCreateRequest) (sdktypes.KnowledgeBaseResponse, error) {
    raw, err := a.client.Post(AiApiPath("/knowledge-bases"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.KnowledgeBaseResponse
        return zero, err
    }
    return decodeResult[sdktypes.KnowledgeBaseResponse](raw)
}

// Get document
func (a *KnowledgeBaseApi) GetDocument(knowledge_base_id string, document_id string) (sdktypes.DocumentResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/%s", knowledge_base_id, document_id)), nil, nil)
    if err != nil {
        var zero sdktypes.DocumentResponse
        return zero, err
    }
    return decodeResult[sdktypes.DocumentResponse](raw)
}

// Delete document
func (a *KnowledgeBaseApi) DeleteDocument(knowledge_base_id string, document_id string) (struct{}, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/%s", knowledge_base_id, document_id)), nil, nil)
    if err != nil {
        var zero struct{}
        return zero, err
    }
    return decodeResult[struct{}](raw)
}

// Get knowledge base
func (a *KnowledgeBaseApi) GetKnowledgeBase(knowledge_base_id string) (sdktypes.KnowledgeBaseResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/knowledge-bases/%s", knowledge_base_id)), nil, nil)
    if err != nil {
        var zero sdktypes.KnowledgeBaseResponse
        return zero, err
    }
    return decodeResult[sdktypes.KnowledgeBaseResponse](raw)
}

// Delete knowledge base
func (a *KnowledgeBaseApi) DeleteKnowledgeBase(knowledge_base_id string) (struct{}, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/knowledge-bases/%s", knowledge_base_id)), nil, nil)
    if err != nil {
        var zero struct{}
        return zero, err
    }
    return decodeResult[struct{}](raw)
}
