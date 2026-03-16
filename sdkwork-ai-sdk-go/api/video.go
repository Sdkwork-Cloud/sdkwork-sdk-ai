package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type VideoApi struct {
    client *sdkhttp.Client
}

func NewVideoApi(client *sdkhttp.Client) *VideoApi {
    return &VideoApi{client: client}
}

// List videos
func (a *VideoApi) ListVideos(query map[string]interface{}) (sdktypes.OpenAiVideoList, error) {
    raw, err := a.client.Get(AiApiPath("/videos"), query, nil)
    if err != nil {
        var zero sdktypes.OpenAiVideoList
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiVideoList](raw)
}

// Create video
func (a *VideoApi) CreateVideo(body sdktypes.VideoGenerationRequest) (sdktypes.OpenAiVideo, error) {
    raw, err := a.client.Post(AiApiPath("/videos"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.OpenAiVideo
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiVideo](raw)
}

// Create video
func (a *VideoApi) CreateVideoGenerations(body sdktypes.VideoGenerationRequest) (sdktypes.OpenAiVideo, error) {
    raw, err := a.client.Post(AiApiPath("/videos/generations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.OpenAiVideo
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiVideo](raw)
}

// Create video
func (a *VideoApi) CreateVideoGenerations2(body sdktypes.VideoGenerationRequest) (sdktypes.OpenAiVideo, error) {
    raw, err := a.client.Post(AiApiPath("/v1/videos/generations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.OpenAiVideo
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiVideo](raw)
}

// Retrieve video
func (a *VideoApi) Retrieve(video_id string) (sdktypes.OpenAiVideo, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/videos/%s", video_id)), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiVideo
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiVideo](raw)
}

// Delete video
func (a *VideoApi) DeleteVideo(video_id string) (sdktypes.OpenAiVideoDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/videos/%s", video_id)), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiVideoDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiVideoDeleteResponse](raw)
}
