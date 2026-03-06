package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type ChatCompletions2Api struct {
    client *sdkhttp.Client
}

func NewChatCompletions2Api(client *sdkhttp.Client) *ChatCompletions2Api {
    return &ChatCompletions2Api{client: client}
}

// Get chat completion
func (a *ChatCompletions2Api) GetChatCompletion(completionId string) (sdktypes.ChatCompletionResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/v1/management/chat/completions/%s", completionId)), nil, nil)
    if err != nil {
        var zero sdktypes.ChatCompletionResponse
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionResponse](raw)
}

// Update chat completion
func (a *ChatCompletions2Api) UpdateChatCompletion(completionId string, body sdktypes.UpdateChatCompletionPostRequest) (sdktypes.ChatCompletionResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/v1/management/chat/completions/%s", completionId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ChatCompletionResponse
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionResponse](raw)
}

// Delete chat completion
func (a *ChatCompletions2Api) DeleteChatCompletion(completionId string) (sdktypes.ChatCompletionDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/v1/management/chat/completions/%s", completionId)), nil, nil)
    if err != nil {
        var zero sdktypes.ChatCompletionDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionDeleteResponse](raw)
}

// Get chat messages
func (a *ChatCompletions2Api) GetChatMessages(completionId string, query map[string]interface{}) (sdktypes.ChatMessageList, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/v1/management/chat/completions/%s/messages", completionId)), query, nil)
    if err != nil {
        var zero sdktypes.ChatMessageList
        return zero, err
    }
    return decodeResult[sdktypes.ChatMessageList](raw)
}

// List chat completions
func (a *ChatCompletions2Api) ListChatCompletions(query map[string]interface{}) (sdktypes.ChatCompletionList, error) {
    raw, err := a.client.Get(AiApiPath("/v1/management/chat/completions"), query, nil)
    if err != nil {
        var zero sdktypes.ChatCompletionList
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionList](raw)
}
