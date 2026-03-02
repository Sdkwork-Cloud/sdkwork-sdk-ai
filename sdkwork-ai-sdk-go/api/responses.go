package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type ResponsesApi struct {
    client *sdkhttp.Client
}

func NewResponsesApi(client *sdkhttp.Client) *ResponsesApi {
    return &ResponsesApi{client: client}
}

// Cancel response
func (a *ResponsesApi) CancelResponse(response_id string) (sdktypes.CancelResponseResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/responses/%s/cancel", response_id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.CancelResponseResponse
        return zero, err
    }
    return decodeResult[sdktypes.CancelResponseResponse](raw)
}

// Create response
func (a *ResponsesApi) CreateResponse(body sdktypes.CreateResponseRequest) (sdktypes.CreateResponseResponse, error) {
    raw, err := a.client.Post(AiApiPath("/responses"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.CreateResponseResponse
        return zero, err
    }
    return decodeResult[sdktypes.CreateResponseResponse](raw)
}

// List response input items
func (a *ResponsesApi) ListResponseInputItems(response_id string) (sdktypes.ListResponseInputItemsResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/responses/%s/input_items", response_id)), nil, nil)
    if err != nil {
        var zero sdktypes.ListResponseInputItemsResponse
        return zero, err
    }
    return decodeResult[sdktypes.ListResponseInputItemsResponse](raw)
}

// Get response
func (a *ResponsesApi) GetResponse(response_id string) (sdktypes.GetResponseResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/responses/%s", response_id)), nil, nil)
    if err != nil {
        var zero sdktypes.GetResponseResponse
        return zero, err
    }
    return decodeResult[sdktypes.GetResponseResponse](raw)
}

// Delete response
func (a *ResponsesApi) DeleteResponse(response_id string) (sdktypes.DeleteResponseResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/responses/%s", response_id)), nil, nil)
    if err != nil {
        var zero sdktypes.DeleteResponseResponse
        return zero, err
    }
    return decodeResult[sdktypes.DeleteResponseResponse](raw)
}
