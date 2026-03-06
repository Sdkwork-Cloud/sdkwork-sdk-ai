package api

import (
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type EmbeddingsApi struct {
    client *sdkhttp.Client
}

func NewEmbeddingsApi(client *sdkhttp.Client) *EmbeddingsApi {
    return &EmbeddingsApi{client: client}
}

// Create embeddings
func (a *EmbeddingsApi) CreateEmbedding(body sdktypes.EmbeddingRequest) (sdktypes.EmbeddingResponse, error) {
    raw, err := a.client.Post(AiApiPath("/v1/embeddings"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.EmbeddingResponse
        return zero, err
    }
    return decodeResult[sdktypes.EmbeddingResponse](raw)
}
