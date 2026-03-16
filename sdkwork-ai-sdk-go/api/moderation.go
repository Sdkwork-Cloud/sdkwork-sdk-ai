package api

import (
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type ModerationApi struct {
    client *sdkhttp.Client
}

func NewModerationApi(client *sdkhttp.Client) *ModerationApi {
    return &ModerationApi{client: client}
}

// Create moderation
func (a *ModerationApi) CreateModeration(body sdktypes.ModerationRequest) (sdktypes.ModerationResponse, error) {
    raw, err := a.client.Post(AiApiPath("/moderations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ModerationResponse
        return zero, err
    }
    return decodeResult[sdktypes.ModerationResponse](raw)
}
