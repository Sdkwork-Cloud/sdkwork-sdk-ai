package api

import (
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type AudioApi struct {
    client *sdkhttp.Client
}

func NewAudioApi(client *sdkhttp.Client) *AudioApi {
    return &AudioApi{client: client}
}

// Create translation
func (a *AudioApi) CreateTranslation(body *sdktypes.CreateTranslationRequest, query map[string]interface{}) (sdktypes.TranscriptionResponse, error) {
    raw, err := a.client.Post(AiApiPath("/audio/translations"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.TranscriptionResponse
        return zero, err
    }
    return decodeResult[sdktypes.TranscriptionResponse](raw)
}

// Create transcription
func (a *AudioApi) CreateTranscription(body *sdktypes.CreateTranscriptionRequest, query map[string]interface{}) (sdktypes.TranscriptionResponse, error) {
    raw, err := a.client.Post(AiApiPath("/audio/transcriptions"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.TranscriptionResponse
        return zero, err
    }
    return decodeResult[sdktypes.TranscriptionResponse](raw)
}

// Create speech
func (a *AudioApi) CreateSpeech(body sdktypes.SpeechRequest) (string, error) {
    raw, err := a.client.Post(AiApiPath("/audio/speech"), body, nil, nil, "")
    if err != nil {
        var zero string
        return zero, err
    }
    return decodeResult[string](raw)
}
