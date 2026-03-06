package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type Context2Api struct {
    client *sdkhttp.Client
}

func NewContext2Api(client *sdkhttp.Client) *Context2Api {
    return &Context2Api{client: client}
}

// Chat with context
func (a *Context2Api) ChatWith(contextId string, body sdktypes.ChatWithContextPostRequest) (sdktypes.ContextResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/v1/context/%s/chat/completions", contextId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ContextResponse
        return zero, err
    }
    return decodeResult[sdktypes.ContextResponse](raw)
}

// Create context
func (a *Context2Api) CreateContext(body sdktypes.ContextCreateRequest) (sdktypes.ContextResponse, error) {
    raw, err := a.client.Post(AiApiPath("/v1/context/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ContextResponse
        return zero, err
    }
    return decodeResult[sdktypes.ContextResponse](raw)
}

// Get context
func (a *Context2Api) GetContext(contextId string) (sdktypes.ContextResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/v1/context/%s", contextId)), nil, nil)
    if err != nil {
        var zero sdktypes.ContextResponse
        return zero, err
    }
    return decodeResult[sdktypes.ContextResponse](raw)
}

// Delete context
func (a *Context2Api) DeleteContext(contextId string) (struct{}, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/v1/context/%s", contextId)), nil, nil)
    if err != nil {
        var zero struct{}
        return zero, err
    }
    return decodeResult[struct{}](raw)
}
