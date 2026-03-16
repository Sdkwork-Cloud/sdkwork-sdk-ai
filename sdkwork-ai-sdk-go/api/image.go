package api

import (
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type ImageApi struct {
    client *sdkhttp.Client
}

func NewImageApi(client *sdkhttp.Client) *ImageApi {
    return &ImageApi{client: client}
}

// Create image variation
func (a *ImageApi) CreateImageVariation(body *sdktypes.CreateImageVariationRequest, query map[string]interface{}) (sdktypes.ImageGenerationResponse, error) {
    raw, err := a.client.Post(AiApiPath("/images/variations"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.ImageGenerationResponse
        return zero, err
    }
    return decodeResult[sdktypes.ImageGenerationResponse](raw)
}

// Create image
func (a *ImageApi) CreateImage(body sdktypes.ImageGenerationRequest) (sdktypes.ImageGenerationResponse, error) {
    raw, err := a.client.Post(AiApiPath("/images"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ImageGenerationResponse
        return zero, err
    }
    return decodeResult[sdktypes.ImageGenerationResponse](raw)
}

// Create image
func (a *ImageApi) CreateImageGenerations(body sdktypes.ImageGenerationRequest) (sdktypes.ImageGenerationResponse, error) {
    raw, err := a.client.Post(AiApiPath("/images/generations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ImageGenerationResponse
        return zero, err
    }
    return decodeResult[sdktypes.ImageGenerationResponse](raw)
}

// Create image edit
func (a *ImageApi) CreateImageEdit(body *sdktypes.CreateImageEditPostRequest, query map[string]interface{}) (sdktypes.ImageGenerationResponse, error) {
    raw, err := a.client.Post(AiApiPath("/images/edits"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.ImageGenerationResponse
        return zero, err
    }
    return decodeResult[sdktypes.ImageGenerationResponse](raw)
}
