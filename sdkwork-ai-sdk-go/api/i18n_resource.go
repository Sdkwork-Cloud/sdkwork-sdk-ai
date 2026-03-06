package api

import (
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type I18nResourceApi struct {
    client *sdkhttp.Client
}

func NewI18nResourceApi(client *sdkhttp.Client) *I18nResourceApi {
    return &I18nResourceApi{client: client}
}

func (a *I18nResourceApi) GetOptions(query map[string]interface{}) (sdktypes.PlusApiResultListLabelOption, error) {
    raw, err := a.client.Get(AiApiPath("/v1/open/i18n/options"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListLabelOption
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListLabelOption](raw)
}

func (a *I18nResourceApi) CreateOptions(query map[string]interface{}) (sdktypes.PlusApiResultListLabelOption, error) {
    raw, err := a.client.Post(AiApiPath("/v1/open/i18n/options"), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListLabelOption
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListLabelOption](raw)
}
