package api

import (
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type EmbeddingApi struct {
    client *sdkhttp.Client
}

func NewEmbeddingApi(client *sdkhttp.Client) *EmbeddingApi {
    return &EmbeddingApi{client: client}
}

// Create embeddings
func (a *EmbeddingApi) CreateEmbedding(body sdktypes.EmbeddingRequest) (sdktypes.EmbeddingResponse, error) {
    raw, err := a.client.Post(AiApiPath("/embeddings"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.EmbeddingResponse
        return zero, err
    }
    return decodeResult[sdktypes.EmbeddingResponse](raw)
}
