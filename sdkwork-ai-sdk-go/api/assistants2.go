package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type Assistants2Api struct {
    client *sdkhttp.Client
}

func NewAssistants2Api(client *sdkhttp.Client) *Assistants2Api {
    return &Assistants2Api{client: client}
}

// Get assistant
func (a *Assistants2Api) GetAssistant(assistant_id string) (sdktypes.AssistantResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/assistants/%s", assistant_id)), nil, nil)
    if err != nil {
        var zero sdktypes.AssistantResponse
        return zero, err
    }
    return decodeResult[sdktypes.AssistantResponse](raw)
}

// Update assistant
func (a *Assistants2Api) UpdateAssistant(assistant_id string, body sdktypes.AssistantCreateRequest) (sdktypes.AssistantResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/assistants/%s", assistant_id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.AssistantResponse
        return zero, err
    }
    return decodeResult[sdktypes.AssistantResponse](raw)
}

// Delete assistant
func (a *Assistants2Api) DeleteAssistant(assistant_id string) (sdktypes.AssistantDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/assistants/%s", assistant_id)), nil, nil)
    if err != nil {
        var zero sdktypes.AssistantDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.AssistantDeleteResponse](raw)
}

// List assistants
func (a *Assistants2Api) ListAssistants(query map[string]interface{}) (sdktypes.AssistantListResponse, error) {
    raw, err := a.client.Get(AiApiPath("/assistants"), query, nil)
    if err != nil {
        var zero sdktypes.AssistantListResponse
        return zero, err
    }
    return decodeResult[sdktypes.AssistantListResponse](raw)
}

// Create assistant
func (a *Assistants2Api) CreateAssistant(body sdktypes.AssistantCreateRequest) (sdktypes.AssistantResponse, error) {
    raw, err := a.client.Post(AiApiPath("/assistants"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.AssistantResponse
        return zero, err
    }
    return decodeResult[sdktypes.AssistantResponse](raw)
}
