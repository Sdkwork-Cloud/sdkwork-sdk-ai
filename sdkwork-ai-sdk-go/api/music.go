package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type MusicApi struct {
    client *sdkhttp.Client
}

func NewMusicApi(client *sdkhttp.Client) *MusicApi {
    return &MusicApi{client: client}
}

// Generate music
func (a *MusicApi) Generate(body sdktypes.MusicGenerationRequest) (sdktypes.SunoMusic, error) {
    raw, err := a.client.Post(AiApiPath("/v1/music/generations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.SunoMusic
        return zero, err
    }
    return decodeResult[sdktypes.SunoMusic](raw)
}

// Retrieve music
func (a *MusicApi) Retrieve(musicId string) (sdktypes.SunoMusic, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/v1/music/%s", musicId)), nil, nil)
    if err != nil {
        var zero sdktypes.SunoMusic
        return zero, err
    }
    return decodeResult[sdktypes.SunoMusic](raw)
}

// Delete music
func (a *MusicApi) DeleteMusic(musicId string) (sdktypes.SunoMusicDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/v1/music/%s", musicId)), nil, nil)
    if err != nil {
        var zero sdktypes.SunoMusicDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.SunoMusicDeleteResponse](raw)
}

// List music
func (a *MusicApi) ListMusic(query map[string]interface{}) (sdktypes.SunoMusicList, error) {
    raw, err := a.client.Get(AiApiPath("/v1/music"), query, nil)
    if err != nil {
        var zero sdktypes.SunoMusicList
        return zero, err
    }
    return decodeResult[sdktypes.SunoMusicList](raw)
}
