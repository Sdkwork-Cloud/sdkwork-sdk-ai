package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type Music2Api struct {
    client *sdkhttp.Client
}

func NewMusic2Api(client *sdkhttp.Client) *Music2Api {
    return &Music2Api{client: client}
}

// Generate music
func (a *Music2Api) Generate(body sdktypes.MusicGenerationRequest) (sdktypes.SunoMusic, error) {
    raw, err := a.client.Post(AiApiPath("/music/generations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.SunoMusic
        return zero, err
    }
    return decodeResult[sdktypes.SunoMusic](raw)
}

// Retrieve music
func (a *Music2Api) Retrieve(musicId string) (sdktypes.SunoMusic, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/music/%s", musicId)), nil, nil)
    if err != nil {
        var zero sdktypes.SunoMusic
        return zero, err
    }
    return decodeResult[sdktypes.SunoMusic](raw)
}

// Delete music
func (a *Music2Api) DeleteMusic(musicId string) (sdktypes.SunoMusicDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/music/%s", musicId)), nil, nil)
    if err != nil {
        var zero sdktypes.SunoMusicDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.SunoMusicDeleteResponse](raw)
}

// List music
func (a *Music2Api) ListMusic(query map[string]interface{}) (sdktypes.SunoMusicList, error) {
    raw, err := a.client.Get(AiApiPath("/music"), query, nil)
    if err != nil {
        var zero sdktypes.SunoMusicList
        return zero, err
    }
    return decodeResult[sdktypes.SunoMusicList](raw)
}
