package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type ModelsApi struct {
    client *sdkhttp.Client
}

func NewModelsApi(client *sdkhttp.Client) *ModelsApi {
    return &ModelsApi{client: client}
}

// Retrieve model
func (a *ModelsApi) RetrieveModel(model string) (sdktypes.OpenAiModel, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/models/%s", model)), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiModel
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiModel](raw)
}

// Delete model
func (a *ModelsApi) DeleteModel(model string) (sdktypes.OpenAiModelDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/models/%s", model)), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiModelDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiModelDeleteResponse](raw)
}

// List models
func (a *ModelsApi) ListModels() (sdktypes.OpenAiModelList, error) {
    raw, err := a.client.Get(AiApiPath("/models"), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiModelList
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiModelList](raw)
}
