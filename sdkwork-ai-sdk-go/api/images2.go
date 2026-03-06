package api

import (
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type Images2Api struct {
    client *sdkhttp.Client
}

func NewImages2Api(client *sdkhttp.Client) *Images2Api {
    return &Images2Api{client: client}
}

// Create image variation
func (a *Images2Api) CreateImageVariation(body *sdktypes.CreateImageVariationPostRequest, query map[string]interface{}) (sdktypes.ImageGenerationResponse, error) {
    raw, err := a.client.Post(AiApiPath("/v1/images/variations"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.ImageGenerationResponse
        return zero, err
    }
    return decodeResult[sdktypes.ImageGenerationResponse](raw)
}

// Create image
func (a *Images2Api) CreateImage(body sdktypes.ImageGenerationRequest) (sdktypes.ImageGenerationResponse, error) {
    raw, err := a.client.Post(AiApiPath("/v1/images/generations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ImageGenerationResponse
        return zero, err
    }
    return decodeResult[sdktypes.ImageGenerationResponse](raw)
}

// Create image edit
func (a *Images2Api) CreateImageEdit(body *sdktypes.CreateImageEditRequest, query map[string]interface{}) (sdktypes.ImageGenerationResponse, error) {
    raw, err := a.client.Post(AiApiPath("/v1/images/edits"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.ImageGenerationResponse
        return zero, err
    }
    return decodeResult[sdktypes.ImageGenerationResponse](raw)
}
