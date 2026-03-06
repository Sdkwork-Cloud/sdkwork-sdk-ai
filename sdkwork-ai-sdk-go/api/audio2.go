package api

import (
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type Audio2Api struct {
    client *sdkhttp.Client
}

func NewAudio2Api(client *sdkhttp.Client) *Audio2Api {
    return &Audio2Api{client: client}
}

// Create translation
func (a *Audio2Api) CreateTranslation(body *sdktypes.CreateTranslationPostRequest, query map[string]interface{}) (sdktypes.TranscriptionResponse, error) {
    raw, err := a.client.Post(AiApiPath("/v1/audio/translations"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.TranscriptionResponse
        return zero, err
    }
    return decodeResult[sdktypes.TranscriptionResponse](raw)
}

// Create transcription
func (a *Audio2Api) CreateTranscription(body *sdktypes.CreateTranscriptionRequest, query map[string]interface{}) (sdktypes.TranscriptionResponse, error) {
    raw, err := a.client.Post(AiApiPath("/v1/audio/transcriptions"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.TranscriptionResponse
        return zero, err
    }
    return decodeResult[sdktypes.TranscriptionResponse](raw)
}

// Create speech
func (a *Audio2Api) CreateSpeech(body sdktypes.SpeechRequest) (string, error) {
    raw, err := a.client.Post(AiApiPath("/v1/audio/speech"), body, nil, nil, "")
    if err != nil {
        var zero string
        return zero, err
    }
    return decodeResult[string](raw)
}
