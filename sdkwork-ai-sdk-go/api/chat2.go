package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type Chat2Api struct {
    client *sdkhttp.Client
}

func NewChat2Api(client *sdkhttp.Client) *Chat2Api {
    return &Chat2Api{client: client}
}

// Get chat completion
func (a *Chat2Api) GetCompletion(completion_id string) (sdktypes.ChatCompletionResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/chat/completions/%s", completion_id)), nil, nil)
    if err != nil {
        var zero sdktypes.ChatCompletionResponse
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionResponse](raw)
}

// Update chat completion
func (a *Chat2Api) UpdateCompletion(completion_id string, body sdktypes.UpdateCompletionPostRequest) (sdktypes.ChatCompletionResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/chat/completions/%s", completion_id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ChatCompletionResponse
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionResponse](raw)
}

// Delete chat completion
func (a *Chat2Api) DeleteCompletion(completion_id string) (sdktypes.ChatCompletionDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/chat/completions/%s", completion_id)), nil, nil)
    if err != nil {
        var zero sdktypes.ChatCompletionDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionDeleteResponse](raw)
}

// Update chat completion
func (a *Chat2Api) PatchUpdateCompletion(completion_id string, body sdktypes.PatchUpdateCompletionRequest) (sdktypes.ChatCompletionResponse, error) {
    raw, err := a.client.Patch(AiApiPath(fmt.Sprintf("/chat/completions/%s", completion_id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ChatCompletionResponse
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionResponse](raw)
}

// Count Claude tokens
func (a *Chat2Api) CountClaudeTokens(body sdktypes.CountClaudeTokensPostRequest) (sdktypes.CountClaudeTokensPostResponse, error) {
    raw, err := a.client.Post(AiApiPath("/messages/count_tokens"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.CountClaudeTokensPostResponse
        return zero, err
    }
    return decodeResult[sdktypes.CountClaudeTokensPostResponse](raw)
}

// Create Claude message
func (a *Chat2Api) CreateClaudeMessage(body sdktypes.CreateClaudeMessageRequest, headers map[string]string) (sdktypes.CreateClaudeMessageResponse, error) {
    raw, err := a.client.Post(AiApiPath("/messages"), body, nil, headers, "")
    if err != nil {
        var zero sdktypes.CreateClaudeMessageResponse
        return zero, err
    }
    return decodeResult[sdktypes.CreateClaudeMessageResponse](raw)
}

// List chat completions
func (a *Chat2Api) ListCompletions(query map[string]interface{}) (sdktypes.ChatCompletionList, error) {
    raw, err := a.client.Get(AiApiPath("/chat/completions"), query, nil)
    if err != nil {
        var zero sdktypes.ChatCompletionList
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionList](raw)
}

// Create chat completion
func (a *Chat2Api) CreateChatCompletion(body sdktypes.ChatCompletionRequest) (sdktypes.CreateChatCompletionResponse, error) {
    raw, err := a.client.Post(AiApiPath("/chat/completions"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.CreateChatCompletionResponse
        return zero, err
    }
    return decodeResult[sdktypes.CreateChatCompletionResponse](raw)
}

// Get chat completion messages
func (a *Chat2Api) GetMessages(completion_id string, query map[string]interface{}) (sdktypes.ChatMessageList, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/chat/completions/%s/messages", completion_id)), query, nil)
    if err != nil {
        var zero sdktypes.ChatMessageList
        return zero, err
    }
    return decodeResult[sdktypes.ChatMessageList](raw)
}
