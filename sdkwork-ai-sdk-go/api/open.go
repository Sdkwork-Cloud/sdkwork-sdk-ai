package api

import (
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type OpenApi struct {
    client *sdkhttp.Client
}

func NewOpenApi(client *sdkhttp.Client) *OpenApi {
    return &OpenApi{client: client}
}

func (a *OpenApi) GetOptions(query map[string]interface{}) (sdktypes.PlusApiResultListLabelOption, error) {
    raw, err := a.client.Get(AiApiPath("/v1/open/i18n/options"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListLabelOption
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListLabelOption](raw)
}

func (a *OpenApi) CreateOptions(query map[string]interface{}) (sdktypes.PlusApiResultListLabelOption, error) {
    raw, err := a.client.Post(AiApiPath("/v1/open/i18n/options"), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListLabelOption
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListLabelOption](raw)
}
