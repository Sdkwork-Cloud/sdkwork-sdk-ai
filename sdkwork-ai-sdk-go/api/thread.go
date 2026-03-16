package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type ThreadApi struct {
    client *sdkhttp.Client
}

func NewThreadApi(client *sdkhttp.Client) *ThreadApi {
    return &ThreadApi{client: client}
}

// Submit tool outputs
func (a *ThreadApi) SubmitToolOutputs(thread_id string, run_id string, body sdktypes.SubmitToolOutputsPostRequest) (sdktypes.SubmitToolOutputsPostResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/threads/%s/runs/%s/submit_tool_outputs", thread_id, run_id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.SubmitToolOutputsPostResponse
        return zero, err
    }
    return decodeResult[sdktypes.SubmitToolOutputsPostResponse](raw)
}

// Cancel run
func (a *ThreadApi) CancelRun(thread_id string, run_id string) (sdktypes.RunResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/threads/%s/runs/%s/cancel", thread_id, run_id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.RunResponse
        return zero, err
    }
    return decodeResult[sdktypes.RunResponse](raw)
}

// Get run
func (a *ThreadApi) GetRun(thread_id string, run_id string) (sdktypes.RunResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/threads/%s/runs/%s", thread_id, run_id)), nil, nil)
    if err != nil {
        var zero sdktypes.RunResponse
        return zero, err
    }
    return decodeResult[sdktypes.RunResponse](raw)
}

// Modify run
func (a *ThreadApi) UpdateRun(thread_id string, run_id string, body sdktypes.UpdateRunRequest) (sdktypes.RunResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/threads/%s/runs/%s", thread_id, run_id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.RunResponse
        return zero, err
    }
    return decodeResult[sdktypes.RunResponse](raw)
}

// List runs
func (a *ThreadApi) ListRuns(thread_id string, query map[string]interface{}) (sdktypes.RunListResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/threads/%s/runs", thread_id)), query, nil)
    if err != nil {
        var zero sdktypes.RunListResponse
        return zero, err
    }
    return decodeResult[sdktypes.RunListResponse](raw)
}

// Create run
func (a *ThreadApi) CreateRun(thread_id string, body sdktypes.RunCreateRequest) (sdktypes.CreateRunPostResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/threads/%s/runs", thread_id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.CreateRunPostResponse
        return zero, err
    }
    return decodeResult[sdktypes.CreateRunPostResponse](raw)
}

// Get thread message
func (a *ThreadApi) GetThreadMessage(thread_id string, message_id string) (sdktypes.ThreadMessageResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/threads/%s/messages/%s", thread_id, message_id)), nil, nil)
    if err != nil {
        var zero sdktypes.ThreadMessageResponse
        return zero, err
    }
    return decodeResult[sdktypes.ThreadMessageResponse](raw)
}

// Modify thread message
func (a *ThreadApi) UpdateThreadMessage(thread_id string, message_id string, body sdktypes.ThreadMessageModifyRequest) (sdktypes.ThreadMessageResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/threads/%s/messages/%s", thread_id, message_id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ThreadMessageResponse
        return zero, err
    }
    return decodeResult[sdktypes.ThreadMessageResponse](raw)
}

// List thread messages
func (a *ThreadApi) ListThreadMessages(thread_id string, query map[string]interface{}) (sdktypes.ThreadMessageListResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/threads/%s/messages", thread_id)), query, nil)
    if err != nil {
        var zero sdktypes.ThreadMessageListResponse
        return zero, err
    }
    return decodeResult[sdktypes.ThreadMessageListResponse](raw)
}

// Create thread message
func (a *ThreadApi) CreateThreadMessage(thread_id string, body sdktypes.ThreadMessageCreateRequest) (sdktypes.ThreadMessageResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/threads/%s/messages", thread_id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ThreadMessageResponse
        return zero, err
    }
    return decodeResult[sdktypes.ThreadMessageResponse](raw)
}

// Get thread
func (a *ThreadApi) GetThread(thread_id string) (sdktypes.ThreadResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/threads/%s", thread_id)), nil, nil)
    if err != nil {
        var zero sdktypes.ThreadResponse
        return zero, err
    }
    return decodeResult[sdktypes.ThreadResponse](raw)
}

// Update thread
func (a *ThreadApi) UpdateThread(thread_id string, body sdktypes.ThreadCreateRequest) (sdktypes.ThreadResponse, error) {
    raw, err := a.client.Post(AiApiPath(fmt.Sprintf("/threads/%s", thread_id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ThreadResponse
        return zero, err
    }
    return decodeResult[sdktypes.ThreadResponse](raw)
}

// Delete thread
func (a *ThreadApi) DeleteThread(thread_id string) (sdktypes.ThreadDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/threads/%s", thread_id)), nil, nil)
    if err != nil {
        var zero sdktypes.ThreadDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.ThreadDeleteResponse](raw)
}

// Create thread and run
func (a *ThreadApi) CreateThreadAndRun(body sdktypes.ThreadRunCreateRequest) (sdktypes.CreateThreadAndRunResponse, error) {
    raw, err := a.client.Post(AiApiPath("/threads/runs"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.CreateThreadAndRunResponse
        return zero, err
    }
    return decodeResult[sdktypes.CreateThreadAndRunResponse](raw)
}

// Create thread
func (a *ThreadApi) CreateThread(body *sdktypes.ThreadCreateRequest) (sdktypes.ThreadResponse, error) {
    raw, err := a.client.Post(AiApiPath("/threads"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.ThreadResponse
        return zero, err
    }
    return decodeResult[sdktypes.ThreadResponse](raw)
}

// Get run step
func (a *ThreadApi) GetRunStep(thread_id string, run_id string, step_id string) (sdktypes.RunStepResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/threads/%s/runs/%s/steps/%s", thread_id, run_id, step_id)), nil, nil)
    if err != nil {
        var zero sdktypes.RunStepResponse
        return zero, err
    }
    return decodeResult[sdktypes.RunStepResponse](raw)
}

// List run steps
func (a *ThreadApi) ListRunSteps(thread_id string, run_id string, query map[string]interface{}) (sdktypes.RunStepListResponse, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/threads/%s/runs/%s/steps", thread_id, run_id)), query, nil)
    if err != nil {
        var zero sdktypes.RunStepListResponse
        return zero, err
    }
    return decodeResult[sdktypes.RunStepListResponse](raw)
}
