package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type KnowledgeBases2Api struct {
    client *sdkhttp.Client
}

func NewKnowledgeBases2Api(client *sdkhttp.Client) *KnowledgeBases2Api {
    return &KnowledgeBases2Api{client: client}
}

// List documents
func (a *KnowledgeBases2Api) ListDocuments(knowledgeBaseId string, query map[string]interface{}) (sdktypes.ListDocumentsGetResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/knowledge-bases/%s/documents", knowledgeBaseId)), query, nil)
    if err != nil {
        var zero sdktypes.ListDocumentsGetResponse
        return zero, err
    }
    return decodeResult[sdktypes.ListDocumentsGetResponse](raw)
}

// Add document
func (a *KnowledgeBases2Api) AddDocument(knowledgeBaseId string, body sdktypes.DocumentAddRequest) (sdktypes.DocumentResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/knowledge-bases/%s/documents", knowledgeBaseId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.DocumentResponse
        return zero, err
    }
    return decodeResult[sdktypes.DocumentResponse](raw)
}

// Search knowledge
func (a *KnowledgeBases2Api) SearchKnowledge(body sdktypes.KnowledgeSearchRequest) (sdktypes.KnowledgeSearchResponse, error) {
    raw, err := a.client.Post(AiApiPath("/knowledge-bases/search"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.KnowledgeSearchResponse
        return zero, err
    }
    return decodeResult[sdktypes.KnowledgeSearchResponse](raw)
}

// List knowledge bases
func (a *KnowledgeBases2Api) ListKnowledgeBases(query map[string]interface{}) (sdktypes.KnowledgeBaseListResponse, error) {
    raw, err := a.client.Get(AiApiPath("/knowledge-bases"), query, nil)
    if err != nil {
        var zero sdktypes.KnowledgeBaseListResponse
        return zero, err
    }
    return decodeResult[sdktypes.KnowledgeBaseListResponse](raw)
}

// Create knowledge base
func (a *KnowledgeBases2Api) CreateKnowledgeBase(body sdktypes.KnowledgeBaseCreateRequest) (sdktypes.KnowledgeBaseResponse, error) {
    raw, err := a.client.Post(AiApiPath("/knowledge-bases"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.KnowledgeBaseResponse
        return zero, err
    }
    return decodeResult[sdktypes.KnowledgeBaseResponse](raw)
}

// Get document
func (a *KnowledgeBases2Api) GetDocument(knowledgeBaseId string, documentId string) (sdktypes.DocumentResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/%s", knowledgeBaseId, documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.DocumentResponse
        return zero, err
    }
    return decodeResult[sdktypes.DocumentResponse](raw)
}

// Delete document
func (a *KnowledgeBases2Api) DeleteDocument(knowledgeBaseId string, documentId string) (struct{}, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/%s", knowledgeBaseId, documentId)), nil, nil)
    if err != nil {
        var zero struct{}
        return zero, err
    }
    return decodeResult[struct{}](raw)
}

// Get knowledge base
func (a *KnowledgeBases2Api) GetKnowledgeBase(knowledgeBaseId string) (sdktypes.KnowledgeBaseResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/knowledge-bases/%s", knowledgeBaseId)), nil, nil)
    if err != nil {
        var zero sdktypes.KnowledgeBaseResponse
        return zero, err
    }
    return decodeResult[sdktypes.KnowledgeBaseResponse](raw)
}

// Delete knowledge base
func (a *KnowledgeBases2Api) DeleteKnowledgeBase(knowledgeBaseId string) (struct{}, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/knowledge-bases/%s", knowledgeBaseId)), nil, nil)
    if err != nil {
        var zero struct{}
        return zero, err
    }
    return decodeResult[struct{}](raw)
}
