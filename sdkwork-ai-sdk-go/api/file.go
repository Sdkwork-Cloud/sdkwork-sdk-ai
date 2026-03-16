package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type FileApi struct {
    client *sdkhttp.Client
}

func NewFileApi(client *sdkhttp.Client) *FileApi {
    return &FileApi{client: client}
}

// List files
func (a *FileApi) ListFiles(query map[string]interface{}) (sdktypes.OpenAiFileList, error) {
    raw, err := a.client.Get(AiApiPath("/files"), query, nil)
    if err != nil {
        var zero sdktypes.OpenAiFileList
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiFileList](raw)
}

// Upload file
func (a *FileApi) Upload(body *sdktypes.UploadFileRequest, query map[string]interface{}) (sdktypes.OpenAiFileObject, error) {
    raw, err := a.client.Post(AiApiPath("/files"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.OpenAiFileObject
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiFileObject](raw)
}

// Retrieve file content
func (a *FileApi) RetrieveFileContent(file_id string) (string, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/files/%s/content", file_id)), nil, nil)
    if err != nil {
        var zero string
        return zero, err
    }
    return decodeResult[string](raw)
}

// Retrieve file
func (a *FileApi) Retrieve(file_id string) (sdktypes.OpenAiFileObject, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/files/%s", file_id)), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiFileObject
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiFileObject](raw)
}

// Delete file
func (a *FileApi) DeleteFile(file_id string) (sdktypes.OpenAiFileDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/files/%s", file_id)), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiFileDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiFileDeleteResponse](raw)
}
