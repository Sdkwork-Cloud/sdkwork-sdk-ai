package api

import (
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type RerankApi struct {
    client *sdkhttp.Client
}

func NewRerankApi(client *sdkhttp.Client) *RerankApi {
    return &RerankApi{client: client}
}

// Rerank documents
func (a *RerankApi) Rerank(body sdktypes.RerankRequest) (sdktypes.RerankResponse, error) {
    raw, err := a.client.Post(AiApiPath("/rerank"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.RerankResponse
        return zero, err
    }
    return decodeResult[sdktypes.RerankResponse](raw)
}
