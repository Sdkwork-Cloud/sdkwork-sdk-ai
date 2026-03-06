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
func (a *ResponsesApi) CreateResponse(body sdktypes.CreateResponsePostRequest) (sdktypes.CreateResponsePostResponse, error) {
    raw, err := a.client.Post(AiApiPath("/responses"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.CreateResponsePostResponse
        return zero, err
    }
    return decodeResult[sdktypes.CreateResponsePostResponse](raw)
}

// List response input items
func (a *ResponsesApi) ListResponseInputItems(response_id string) (sdktypes.ListResponseInputItemsGetResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/responses/%s/input_items", response_id)), nil, nil)
    if err != nil {
        var zero sdktypes.ListResponseInputItemsGetResponse
        return zero, err
    }
    return decodeResult[sdktypes.ListResponseInputItemsGetResponse](raw)
}

// Get response
func (a *ResponsesApi) GetResponse(response_id string) (sdktypes.GetResponseGetResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/responses/%s", response_id)), nil, nil)
    if err != nil {
        var zero sdktypes.GetResponseGetResponse
        return zero, err
    }
    return decodeResult[sdktypes.GetResponseGetResponse](raw)
}

// Delete response
func (a *ResponsesApi) DeleteResponse(response_id string) (sdktypes.DeleteResponseDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/responses/%s", response_id)), nil, nil)
    if err != nil {
        var zero sdktypes.DeleteResponseDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.DeleteResponseDeleteResponse](raw)
}
