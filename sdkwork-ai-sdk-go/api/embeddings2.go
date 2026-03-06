package api

import (
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type Embeddings2Api struct {
    client *sdkhttp.Client
}

func NewEmbeddings2Api(client *sdkhttp.Client) *Embeddings2Api {
    return &Embeddings2Api{client: client}
}

// Create embeddings
func (a *Embeddings2Api) CreateEmbedding(body sdktypes.EmbeddingRequest) (sdktypes.EmbeddingResponse, error) {
    raw, err := a.client.Post(AiApiPath("/embeddings"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.EmbeddingResponse
        return zero, err
    }
    return decodeResult[sdktypes.EmbeddingResponse](raw)
}
