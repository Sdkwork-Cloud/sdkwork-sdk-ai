package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type Videos2Api struct {
    client *sdkhttp.Client
}

func NewVideos2Api(client *sdkhttp.Client) *Videos2Api {
    return &Videos2Api{client: client}
}

// List videos
func (a *Videos2Api) ListVideos(query map[string]interface{}) (sdktypes.OpenAiVideoList, error) {
    raw, err := a.client.Get(AiApiPath("/v1/videos"), query, nil)
    if err != nil {
        var zero sdktypes.OpenAiVideoList
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiVideoList](raw)
}

// Create video
func (a *Videos2Api) CreateVideo(body sdktypes.VideoGenerationRequest) (sdktypes.OpenAiVideo, error) {
    raw, err := a.client.Post(AiApiPath("/v1/videos"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.OpenAiVideo
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiVideo](raw)
}

// Retrieve video
func (a *Videos2Api) RetrieveVideo(video_id string) (sdktypes.OpenAiVideo, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/v1/videos/%s", video_id)), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiVideo
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiVideo](raw)
}

// Delete video
func (a *Videos2Api) DeleteVideo(video_id string) (sdktypes.OpenAiVideoDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/v1/videos/%s", video_id)), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiVideoDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiVideoDeleteResponse](raw)
}
