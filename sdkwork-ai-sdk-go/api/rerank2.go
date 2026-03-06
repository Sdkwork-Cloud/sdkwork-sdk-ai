package api

import (
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type Rerank2Api struct {
    client *sdkhttp.Client
}

func NewRerank2Api(client *sdkhttp.Client) *Rerank2Api {
    return &Rerank2Api{client: client}
}

// Rerank documents
func (a *Rerank2Api) Rerank(body sdktypes.RerankRequest) (sdktypes.RerankResponse, error) {
    raw, err := a.client.Post(AiApiPath("/v1/rerank"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.RerankResponse
        return zero, err
    }
    return decodeResult[sdktypes.RerankResponse](raw)
}
