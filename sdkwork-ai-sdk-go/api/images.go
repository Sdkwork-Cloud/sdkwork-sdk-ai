package api

import (
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type ImagesApi struct {
    client *sdkhttp.Client
}

func NewImagesApi(client *sdkhttp.Client) *ImagesApi {
    return &ImagesApi{client: client}
}

// Create image variation
func (a *ImagesApi) CreateImageVariation(body sdktypes.ImageGenerationRequest) (sdktypes.ImageGenerationResponse, error) {
    raw, err := a.client.Post(AiApiPath("/images/variations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ImageGenerationResponse
        return zero, err
    }
    return decodeResult[sdktypes.ImageGenerationResponse](raw)
}

// Create image
func (a *ImagesApi) CreateImage(body sdktypes.ImageGenerationRequest) (sdktypes.ImageGenerationResponse, error) {
    raw, err := a.client.Post(AiApiPath("/images/generations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ImageGenerationResponse
        return zero, err
    }
    return decodeResult[sdktypes.ImageGenerationResponse](raw)
}

// Create image edit
func (a *ImagesApi) CreateImageEdit(body sdktypes.ImageGenerationRequest) (sdktypes.ImageGenerationResponse, error) {
    raw, err := a.client.Post(AiApiPath("/images/edits"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ImageGenerationResponse
        return zero, err
    }
    return decodeResult[sdktypes.ImageGenerationResponse](raw)
}
