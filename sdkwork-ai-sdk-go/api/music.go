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
func (a *MusicApi) CreateGenerate(body sdktypes.MusicGenerationRequest) (sdktypes.SunoMusic, error) {
    raw, err := a.client.Post(AiApiPath("/v1/music/generations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.SunoMusic
        return zero, err
    }
    return decodeResult[sdktypes.SunoMusic](raw)
}

// List music
func (a *MusicApi) ListMusic(query map[string]interface{}) (sdktypes.SunoMusicList, error) {
    raw, err := a.client.Get(AiApiPath("/music"), query, nil)
    if err != nil {
        var zero sdktypes.SunoMusicList
        return zero, err
    }
    return decodeResult[sdktypes.SunoMusicList](raw)
}

// Generate music
func (a *MusicApi) CreateGenerateMusic(body sdktypes.MusicGenerationRequest) (sdktypes.SunoMusic, error) {
    raw, err := a.client.Post(AiApiPath("/music"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.SunoMusic
        return zero, err
    }
    return decodeResult[sdktypes.SunoMusic](raw)
}

// Generate music
func (a *MusicApi) CreateGenerateGenerations(body sdktypes.MusicGenerationRequest) (sdktypes.SunoMusic, error) {
    raw, err := a.client.Post(AiApiPath("/music/generations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.SunoMusic
        return zero, err
    }
    return decodeResult[sdktypes.SunoMusic](raw)
}

// Retrieve music
func (a *MusicApi) Retrieve(music_id string) (sdktypes.SunoMusic, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/music/%s", music_id)), nil, nil)
    if err != nil {
        var zero sdktypes.SunoMusic
        return zero, err
    }
    return decodeResult[sdktypes.SunoMusic](raw)
}

// Delete music
func (a *MusicApi) DeleteMusic(music_id string) (sdktypes.SunoMusicDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/music/%s", music_id)), nil, nil)
    if err != nil {
        var zero sdktypes.SunoMusicDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.SunoMusicDeleteResponse](raw)
}
