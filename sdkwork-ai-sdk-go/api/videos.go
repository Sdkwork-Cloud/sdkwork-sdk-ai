package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type VideosApi struct {
    client *sdkhttp.Client
}

func NewVideosApi(client *sdkhttp.Client) *VideosApi {
    return &VideosApi{client: client}
}

// List videos
func (a *VideosApi) ListVideos(query map[string]interface{}) (sdktypes.OpenAiVideoList, error) {
    raw, err := a.client.Get(AiApiPath("/videos"), query, nil)
    if err != nil {
        var zero sdktypes.OpenAiVideoList
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiVideoList](raw)
}

// Create video
func (a *VideosApi) CreateVideo(body sdktypes.VideoGenerationRequest) (sdktypes.OpenAiVideo, error) {
    raw, err := a.client.Post(AiApiPath("/videos"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.OpenAiVideo
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiVideo](raw)
}

// Retrieve video
func (a *VideosApi) RetrieveVideo(videoId string) (sdktypes.OpenAiVideo, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/videos/%s", videoId)), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiVideo
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiVideo](raw)
}

// Delete video
func (a *VideosApi) DeleteVideo(videoId string) (sdktypes.OpenAiVideoDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/videos/%s", videoId)), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiVideoDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiVideoDeleteResponse](raw)
}
