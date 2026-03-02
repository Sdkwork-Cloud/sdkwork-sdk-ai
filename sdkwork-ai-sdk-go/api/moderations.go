package api

import (
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type ModerationsApi struct {
    client *sdkhttp.Client
}

func NewModerationsApi(client *sdkhttp.Client) *ModerationsApi {
    return &ModerationsApi{client: client}
}

// Create moderation
func (a *ModerationsApi) CreateModeration(body sdktypes.ModerationRequest) (sdktypes.ModerationResponse, error) {
    raw, err := a.client.Post(AiApiPath("/moderations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ModerationResponse
        return zero, err
    }
    return decodeResult[sdktypes.ModerationResponse](raw)
}
