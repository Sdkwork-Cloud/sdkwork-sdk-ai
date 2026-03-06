package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type Files2Api struct {
    client *sdkhttp.Client
}

func NewFiles2Api(client *sdkhttp.Client) *Files2Api {
    return &Files2Api{client: client}
}

// List files
func (a *Files2Api) ListFiles(query map[string]interface{}) (sdktypes.OpenAiFileList, error) {
    raw, err := a.client.Get(AiApiPath("/v1/files"), query, nil)
    if err != nil {
        var zero sdktypes.OpenAiFileList
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiFileList](raw)
}

// Upload file
func (a *Files2Api) UploadFile(body *sdktypes.UploadFilePostRequest, query map[string]interface{}) (sdktypes.OpenAiFileObject, error) {
    raw, err := a.client.Post(AiApiPath("/v1/files"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.OpenAiFileObject
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiFileObject](raw)
}

// Retrieve file content
func (a *Files2Api) RetrieveFileContent(fileId string) (string, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/v1/files/%s/content", fileId)), nil, nil)
    if err != nil {
        var zero string
        return zero, err
    }
    return decodeResult[string](raw)
}

// Retrieve file
func (a *Files2Api) RetrieveFile(fileId string) (sdktypes.OpenAiFileObject, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/v1/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiFileObject
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiFileObject](raw)
}

// Delete file
func (a *Files2Api) DeleteFile(fileId string) (sdktypes.OpenAiFileDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/v1/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiFileDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiFileDeleteResponse](raw)
}
