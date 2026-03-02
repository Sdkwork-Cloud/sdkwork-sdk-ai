package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type ContextApi struct {
    client *sdkhttp.Client
}

func NewContextApi(client *sdkhttp.Client) *ContextApi {
    return &ContextApi{client: client}
}

// Chat with context
func (a *ContextApi) ChatWith(contextId string, body sdktypes.ChatWithContextRequest) (sdktypes.ContextResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/context/%s/chat/completions", contextId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ContextResponse
        return zero, err
    }
    return decodeResult[sdktypes.ContextResponse](raw)
}

// Create context
func (a *ContextApi) CreateContext(body sdktypes.ContextCreateRequest) (sdktypes.ContextResponse, error) {
    raw, err := a.client.Post(AiApiPath("/context/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ContextResponse
        return zero, err
    }
    return decodeResult[sdktypes.ContextResponse](raw)
}

// Get context
func (a *ContextApi) GetContext(contextId string) (sdktypes.ContextResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/context/%s", contextId)), nil, nil)
    if err != nil {
        var zero sdktypes.ContextResponse
        return zero, err
    }
    return decodeResult[sdktypes.ContextResponse](raw)
}

// Delete context
func (a *ContextApi) DeleteContext(contextId string) (struct{}, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/context/%s", contextId)), nil, nil)
    if err != nil {
        var zero struct{}
        return zero, err
    }
    return decodeResult[struct{}](raw)
}
