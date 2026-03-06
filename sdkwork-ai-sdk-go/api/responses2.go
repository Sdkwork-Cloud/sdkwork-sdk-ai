package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type Responses2Api struct {
    client *sdkhttp.Client
}

func NewResponses2Api(client *sdkhttp.Client) *Responses2Api {
    return &Responses2Api{client: client}
}

// Cancel response
func (a *Responses2Api) CancelResponse(response_id string) (sdktypes.CancelResponsePostResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/v1/responses/%s/cancel", response_id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.CancelResponsePostResponse
        return zero, err
    }
    return decodeResult[sdktypes.CancelResponsePostResponse](raw)
}

// Create response
func (a *Responses2Api) CreateResponse(body sdktypes.CreateResponseRequest) (sdktypes.CreateResponseResponse, error) {
    raw, err := a.client.Post(AiApiPath("/v1/responses"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.CreateResponseResponse
        return zero, err
    }
    return decodeResult[sdktypes.CreateResponseResponse](raw)
}

// List response input items
func (a *Responses2Api) ListResponseInputItems(response_id string) (sdktypes.ListResponseInputItemsResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/v1/responses/%s/input_items", response_id)), nil, nil)
    if err != nil {
        var zero sdktypes.ListResponseInputItemsResponse
        return zero, err
    }
    return decodeResult[sdktypes.ListResponseInputItemsResponse](raw)
}

// Get response
func (a *Responses2Api) GetResponse(response_id string) (sdktypes.GetResponseResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/v1/responses/%s", response_id)), nil, nil)
    if err != nil {
        var zero sdktypes.GetResponseResponse
        return zero, err
    }
    return decodeResult[sdktypes.GetResponseResponse](raw)
}

// Delete response
func (a *Responses2Api) DeleteResponse(response_id string) (sdktypes.DeleteResponseResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/v1/responses/%s", response_id)), nil, nil)
    if err != nil {
        var zero sdktypes.DeleteResponseResponse
        return zero, err
    }
    return decodeResult[sdktypes.DeleteResponseResponse](raw)
}
