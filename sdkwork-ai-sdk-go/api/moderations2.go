package api

import (
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type Moderations2Api struct {
    client *sdkhttp.Client
}

func NewModerations2Api(client *sdkhttp.Client) *Moderations2Api {
    return &Moderations2Api{client: client}
}

// Create moderation
func (a *Moderations2Api) CreateModeration(body sdktypes.ModerationRequest) (sdktypes.ModerationResponse, error) {
    raw, err := a.client.Post(AiApiPath("/moderations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ModerationResponse
        return zero, err
    }
    return decodeResult[sdktypes.ModerationResponse](raw)
}
