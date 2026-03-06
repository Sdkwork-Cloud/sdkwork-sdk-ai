package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type Batches2Api struct {
    client *sdkhttp.Client
}

func NewBatches2Api(client *sdkhttp.Client) *Batches2Api {
    return &Batches2Api{client: client}
}

// Cancel batch
func (a *Batches2Api) CancelBatch(batch_id string) (sdktypes.BatchResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/v1/batches/%s/cancel", batch_id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.BatchResponse
        return zero, err
    }
    return decodeResult[sdktypes.BatchResponse](raw)
}

// List batches
func (a *Batches2Api) ListBatches(query map[string]interface{}) (sdktypes.BatchListResponse, error) {
    raw, err := a.client.Get(AiApiPath("/v1/batches"), query, nil)
    if err != nil {
        var zero sdktypes.BatchListResponse
        return zero, err
    }
    return decodeResult[sdktypes.BatchListResponse](raw)
}

// Create batch
func (a *Batches2Api) CreateBatch(body sdktypes.BatchCreateRequest) (sdktypes.BatchResponse, error) {
    raw, err := a.client.Post(AiApiPath("/v1/batches"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.BatchResponse
        return zero, err
    }
    return decodeResult[sdktypes.BatchResponse](raw)
}

// Get batch
func (a *Batches2Api) GetBatch(batch_id string) (sdktypes.BatchResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/v1/batches/%s", batch_id)), nil, nil)
    if err != nil {
        var zero sdktypes.BatchResponse
        return zero, err
    }
    return decodeResult[sdktypes.BatchResponse](raw)
}
