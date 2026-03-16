package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type BatchApi struct {
    client *sdkhttp.Client
}

func NewBatchApi(client *sdkhttp.Client) *BatchApi {
    return &BatchApi{client: client}
}

// Cancel batch
func (a *BatchApi) Cancel(batch_id string) (sdktypes.BatchResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/batches/%s/cancel", batch_id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.BatchResponse
        return zero, err
    }
    return decodeResult[sdktypes.BatchResponse](raw)
}

// List batches
func (a *BatchApi) ListBatches(query map[string]interface{}) (sdktypes.BatchListResponse, error) {
    raw, err := a.client.Get(AiApiPath("/batches"), query, nil)
    if err != nil {
        var zero sdktypes.BatchListResponse
        return zero, err
    }
    return decodeResult[sdktypes.BatchListResponse](raw)
}

// Create batch
func (a *BatchApi) CreateBatch(body sdktypes.BatchCreateRequest) (sdktypes.BatchResponse, error) {
    raw, err := a.client.Post(AiApiPath("/batches"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.BatchResponse
        return zero, err
    }
    return decodeResult[sdktypes.BatchResponse](raw)
}

// Get batch
func (a *BatchApi) GetBatch(batch_id string) (sdktypes.BatchResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/batches/%s", batch_id)), nil, nil)
    if err != nil {
        var zero sdktypes.BatchResponse
        return zero, err
    }
    return decodeResult[sdktypes.BatchResponse](raw)
}
