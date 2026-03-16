package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type ChatApi struct {
    client *sdkhttp.Client
}

func NewChatApi(client *sdkhttp.Client) *ChatApi {
    return &ChatApi{client: client}
}

// Get chat completion
func (a *ChatApi) GetCompletion(completion_id string) (sdktypes.ChatCompletionResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/chat/completions/%s", completion_id)), nil, nil)
    if err != nil {
        var zero sdktypes.ChatCompletionResponse
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionResponse](raw)
}

// Update chat completion
func (a *ChatApi) CreateUpdateCompletion(completion_id string, body sdktypes.UpdateCompletionPostRequest) (sdktypes.ChatCompletionResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/chat/completions/%s", completion_id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ChatCompletionResponse
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionResponse](raw)
}

// Delete chat completion
func (a *ChatApi) DeleteCompletion(completion_id string) (sdktypes.ChatCompletionDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/chat/completions/%s", completion_id)), nil, nil)
    if err != nil {
        var zero sdktypes.ChatCompletionDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionDeleteResponse](raw)
}

// Update chat completion
func (a *ChatApi) PatchUpdateCompletion(completion_id string, body sdktypes.UpdateCompletionPatchRequest) (sdktypes.ChatCompletionResponse, error) {
    raw, err := a.client.Patch(AiApiPath(fmt.Sprintf("/v1/chat/completions/%s", completion_id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ChatCompletionResponse
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionResponse](raw)
}

// Update chat completion
func (a *ChatApi) PatchUpdateCompletionChat(completion_id string, body sdktypes.PatchUpdateCompletionRequest) (sdktypes.ChatCompletionResponse, error) {
    raw, err := a.client.Patch(AiApiPath(fmt.Sprintf("/chat/completions/%s", completion_id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ChatCompletionResponse
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionResponse](raw)
}

// Get chat completion
func (a *ChatApi) GetChatCompletion(completion_id string) (sdktypes.ChatCompletionResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/management/chat/completions/%s", completion_id)), nil, nil)
    if err != nil {
        var zero sdktypes.ChatCompletionResponse
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionResponse](raw)
}

// Update chat completion
func (a *ChatApi) UpdateChatCompletion(completion_id string, body sdktypes.UpdateChatCompletionRequest) (sdktypes.ChatCompletionResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/management/chat/completions/%s", completion_id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ChatCompletionResponse
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionResponse](raw)
}

// Delete chat completion
func (a *ChatApi) DeleteChatCompletion(completion_id string) (sdktypes.ChatCompletionDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/management/chat/completions/%s", completion_id)), nil, nil)
    if err != nil {
        var zero sdktypes.ChatCompletionDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionDeleteResponse](raw)
}

// List chat completions
func (a *ChatApi) ListCompletions(query map[string]interface{}) (sdktypes.ChatCompletionList, error) {
    raw, err := a.client.Get(AiApiPath("/chat/completions"), query, nil)
    if err != nil {
        var zero sdktypes.ChatCompletionList
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionList](raw)
}

// Create chat completion
func (a *ChatApi) CreateChatCompletion(body sdktypes.ChatCompletionRequest) (sdktypes.CreateChatCompletionResponse, error) {
    raw, err := a.client.Post(AiApiPath("/chat/completions"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.CreateChatCompletionResponse
        return zero, err
    }
    return decodeResult[sdktypes.CreateChatCompletionResponse](raw)
}

// Get chat messages
func (a *ChatApi) GetChatMessages(completion_id string, query map[string]interface{}) (sdktypes.ChatMessageList, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/management/chat/completions/%s/messages", completion_id)), query, nil)
    if err != nil {
        var zero sdktypes.ChatMessageList
        return zero, err
    }
    return decodeResult[sdktypes.ChatMessageList](raw)
}

// List chat completions
func (a *ChatApi) ListChatCompletions(query map[string]interface{}) (sdktypes.ChatCompletionList, error) {
    raw, err := a.client.Get(AiApiPath("/management/chat/completions"), query, nil)
    if err != nil {
        var zero sdktypes.ChatCompletionList
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionList](raw)
}

// Get chat completion messages
func (a *ChatApi) GetMessages(completion_id string, query map[string]interface{}) (sdktypes.ChatMessageList, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/chat/completions/%s/messages", completion_id)), query, nil)
    if err != nil {
        var zero sdktypes.ChatMessageList
        return zero, err
    }
    return decodeResult[sdktypes.ChatMessageList](raw)
}
