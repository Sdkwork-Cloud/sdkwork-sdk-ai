package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/ai-sdk/types"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type FilesApi struct {
    client *sdkhttp.Client
}

func NewFilesApi(client *sdkhttp.Client) *FilesApi {
    return &FilesApi{client: client}
}

// List files
func (a *FilesApi) ListFiles(query map[string]interface{}) (sdktypes.OpenAiFileList, error) {
    raw, err := a.client.Get(AiApiPath("/files"), query, nil)
    if err != nil {
        var zero sdktypes.OpenAiFileList
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiFileList](raw)
}

// Upload file
func (a *FilesApi) UploadFile(body *sdktypes.UploadFileRequest, query map[string]interface{}) (sdktypes.OpenAiFileObject, error) {
    raw, err := a.client.Post(AiApiPath("/files"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.OpenAiFileObject
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiFileObject](raw)
}

// Retrieve file content
func (a *FilesApi) RetrieveFileContent(fileId string) (string, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/files/%s/content", fileId)), nil, nil)
    if err != nil {
        var zero string
        return zero, err
    }
    return decodeResult[string](raw)
}

// Retrieve file
func (a *FilesApi) RetrieveFile(fileId string) (sdktypes.OpenAiFileObject, error) {
    raw, err := a.client.Get(AiApiPath(fmt.Sprintf("/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiFileObject
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiFileObject](raw)
}

// Delete file
func (a *FilesApi) DeleteFile(fileId string) (sdktypes.OpenAiFileDeleteResponse, error) {
    raw, err := a.client.Delete(AiApiPath(fmt.Sprintf("/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.OpenAiFileDeleteResponse
        return zero, err
    }
    return decodeResult[sdktypes.OpenAiFileDeleteResponse](raw)
}
