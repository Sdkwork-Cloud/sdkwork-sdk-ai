package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type Models2Api struct {
    client *sdkhttp.Client
}

func NewModels2Api(client *sdkhttp.Client) *Models2Api {
    return &Models2Api{client: client}
}

// Retrieve model
func (a *Models2Api) RetrieveModel(model string) (sdktypes.OpenAiModel, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/v1/models/%s", model)), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiModel
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiModel](raw)
}

// Delete model
func (a *Models2Api) DeleteModel(model string) (sdktypes.OpenAiModelDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/v1/models/%s", model)), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiModelDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiModelDeleteResponse](raw)
}

// List models
func (a *Models2Api) ListModels() (sdktypes.OpenAiModelList, error) {
    raw, err := a.client.Get(AiApiPath("/v1/models"), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiModelList
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiModelList](raw)
}
