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
func (a *ImagesApi) CreateImageVariation(body *sdktypes.CreateImageVariationRequest, query map[string]interface{}) (sdktypes.ImageGenerationResponse, error) {
    raw, err := a.client.Post(AiApiPath("/images/variations"), body, query, nil, "multipart/form-data")
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
func (a *ImagesApi) CreateImageEdit(body *sdktypes.CreateImageEditPostRequest, query map[string]interface{}) (sdktypes.ImageGenerationResponse, error) {
    raw, err := a.client.Post(AiApiPath("/images/edits"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.ImageGenerationResponse
        return zero, err
    }
    return decodeResult[sdktypes.ImageGenerationResponse](raw)
}
