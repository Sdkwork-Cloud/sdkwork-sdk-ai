package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type AssistantsApi struct {
    client *sdkhttp.Client
}

func NewAssistantsApi(client *sdkhttp.Client) *AssistantsApi {
    return &AssistantsApi{client: client}
}

// Get assistant
func (a *AssistantsApi) GetAssistant(assistant_id string) (sdktypes.AssistantResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/assistants/%s", assistant_id)), nil, nil)
    if err != nil {
        var zero sdktypes.AssistantResponse
        return zero, err
    }
    return decodeResult[sdktypes.AssistantResponse](raw)
}

// Update assistant
func (a *AssistantsApi) UpdateAssistant(assistant_id string, body sdktypes.AssistantCreateRequest) (sdktypes.AssistantResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/assistants/%s", assistant_id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.AssistantResponse
        return zero, err
    }
    return decodeResult[sdktypes.AssistantResponse](raw)
}

// Delete assistant
func (a *AssistantsApi) DeleteAssistant(assistant_id string) (sdktypes.AssistantDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/assistants/%s", assistant_id)), nil, nil)
    if err != nil {
        var zero sdktypes.AssistantDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.AssistantDeleteResponse](raw)
}

// List assistants
func (a *AssistantsApi) ListAssistants(query map[string]interface{}) (sdktypes.AssistantListResponse, error) {
    raw, err := a.client.Get(AiApiPath("/assistants"), query, nil)
    if err != nil {
        var zero sdktypes.AssistantListResponse
        return zero, err
    }
    return decodeResult[sdktypes.AssistantListResponse](raw)
}

// Create assistant
func (a *AssistantsApi) CreateAssistant(body sdktypes.AssistantCreateRequest) (sdktypes.AssistantResponse, error) {
    raw, err := a.client.Post(AiApiPath("/assistants"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.AssistantResponse
        return zero, err
    }
    return decodeResult[sdktypes.AssistantResponse](raw)
}
