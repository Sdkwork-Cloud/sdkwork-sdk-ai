package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type KnowledgeBasesApi struct {
    client *sdkhttp.Client
}

func NewKnowledgeBasesApi(client *sdkhttp.Client) *KnowledgeBasesApi {
    return &KnowledgeBasesApi{client: client}
}

// List documents
func (a *KnowledgeBasesApi) ListDocuments(knowledgeBaseId string, query map[string]interface{}) (sdktypes.ListDocumentsResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/v1/knowledge-bases/%s/documents", knowledgeBaseId)), query, nil)
    if err != nil {
        var zero sdktypes.ListDocumentsResponse
        return zero, err
    }
    return decodeResult[sdktypes.ListDocumentsResponse](raw)
}

// Add document
func (a *KnowledgeBasesApi) AddDocument(knowledgeBaseId string, body sdktypes.DocumentAddRequest) (sdktypes.DocumentResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/v1/knowledge-bases/%s/documents", knowledgeBaseId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.DocumentResponse
        return zero, err
    }
    return decodeResult[sdktypes.DocumentResponse](raw)
}

// Search knowledge
func (a *KnowledgeBasesApi) SearchKnowledge(body sdktypes.KnowledgeSearchRequest) (sdktypes.KnowledgeSearchResponse, error) {
    raw, err := a.client.Post(AiApiPath("/v1/knowledge-bases/search"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.KnowledgeSearchResponse
        return zero, err
    }
    return decodeResult[sdktypes.KnowledgeSearchResponse](raw)
}

// List knowledge bases
func (a *KnowledgeBasesApi) ListKnowledgeBases(query map[string]interface{}) (sdktypes.KnowledgeBaseListResponse, error) {
    raw, err := a.client.Get(AiApiPath("/v1/knowledge-bases"), query, nil)
    if err != nil {
        var zero sdktypes.KnowledgeBaseListResponse
        return zero, err
    }
    return decodeResult[sdktypes.KnowledgeBaseListResponse](raw)
}

// Create knowledge base
func (a *KnowledgeBasesApi) CreateKnowledgeBase(body sdktypes.KnowledgeBaseCreateRequest) (sdktypes.KnowledgeBaseResponse, error) {
    raw, err := a.client.Post(AiApiPath("/v1/knowledge-bases"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.KnowledgeBaseResponse
        return zero, err
    }
    return decodeResult[sdktypes.KnowledgeBaseResponse](raw)
}

// Get document
func (a *KnowledgeBasesApi) GetDocument(knowledgeBaseId string, documentId string) (sdktypes.DocumentResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/v1/knowledge-bases/%s/documents/%s", knowledgeBaseId, documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.DocumentResponse
        return zero, err
    }
    return decodeResult[sdktypes.DocumentResponse](raw)
}

// Delete document
func (a *KnowledgeBasesApi) DeleteDocument(knowledgeBaseId string, documentId string) (struct{}, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/v1/knowledge-bases/%s/documents/%s", knowledgeBaseId, documentId)), nil, nil)
    if err != nil {
        var zero struct{}
        return zero, err
    }
    return decodeResult[struct{}](raw)
}

// Get knowledge base
func (a *KnowledgeBasesApi) GetKnowledgeBase(knowledgeBaseId string) (sdktypes.KnowledgeBaseResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/v1/knowledge-bases/%s", knowledgeBaseId)), nil, nil)
    if err != nil {
        var zero sdktypes.KnowledgeBaseResponse
        return zero, err
    }
    return decodeResult[sdktypes.KnowledgeBaseResponse](raw)
}

// Delete knowledge base
func (a *KnowledgeBasesApi) DeleteKnowledgeBase(knowledgeBaseId string) (struct{}, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/v1/knowledge-bases/%s", knowledgeBaseId)), nil, nil)
    if err != nil {
        var zero struct{}
        return zero, err
    }
    return decodeResult[struct{}](raw)
}
