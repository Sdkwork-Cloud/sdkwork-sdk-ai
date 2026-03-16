package api

import (
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type MessageApi struct {
    client *sdkhttp.Client
}

func NewMessageApi(client *sdkhttp.Client) *MessageApi {
    return &MessageApi{client: client}
}

// Count Claude tokens
func (a *MessageApi) CountClaudeTokens(body sdktypes.CountClaudeTokensPostRequest) (sdktypes.CountClaudeTokensPostResponse, error) {
    raw, err := a.client.Post(AiApiPath("/messages/count_tokens"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.CountClaudeTokensPostResponse
        return zero, err
    }
    return decodeResult[sdktypes.CountClaudeTokensPostResponse](raw)
}

// Create Claude message
func (a *MessageApi) CreateClaude(body sdktypes.CreateClaudeMessageRequest, headers map[string]string) (sdktypes.CreateClaudeMessageResponse, error) {
    raw, err := a.client.Post(AiApiPath("/messages"), body, nil, headers, "")
    if err != nil {
        var zero sdktypes.CreateClaudeMessageResponse
        return zero, err
    }
    return decodeResult[sdktypes.CreateClaudeMessageResponse](raw)
}
