package ai

import (
    "github.com/sdkwork/ai-sdk/api"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type SdkworkAiClient struct {
    http *sdkhttp.Client
    Open *api.OpenApi
    Chat *api.ChatApi
    Video *api.VideoApi
    Thread *api.ThreadApi
    Response *api.ResponseApi
    Rerank *api.RerankApi
    Music *api.MusicApi
    Moderation *api.ModerationApi
    Message *api.MessageApi
    KnowledgeBase *api.KnowledgeBaseApi
    Image *api.ImageApi
    File *api.FileApi
    Embedding *api.EmbeddingApi
    Context *api.ContextApi
    Batch *api.BatchApi
    Audio *api.AudioApi
    Assistant *api.AssistantApi
    Model *api.ModelApi
}

func NewSdkworkAiClient(baseURL string) *SdkworkAiClient {
    cfg := sdkhttp.NewDefaultConfig(baseURL)
    return NewSdkworkAiClientWithConfig(cfg)
}

func NewSdkworkAiClientWithConfig(config sdkhttp.Config) *SdkworkAiClient {
    client := sdkhttp.NewClient(config)
    return &SdkworkAiClient{
        http: client,
        Open: api.NewOpenApi(client),
        Chat: api.NewChatApi(client),
        Video: api.NewVideoApi(client),
        Thread: api.NewThreadApi(client),
        Response: api.NewResponseApi(client),
        Rerank: api.NewRerankApi(client),
        Music: api.NewMusicApi(client),
        Moderation: api.NewModerationApi(client),
        Message: api.NewMessageApi(client),
        KnowledgeBase: api.NewKnowledgeBaseApi(client),
        Image: api.NewImageApi(client),
        File: api.NewFileApi(client),
        Embedding: api.NewEmbeddingApi(client),
        Context: api.NewContextApi(client),
        Batch: api.NewBatchApi(client),
        Audio: api.NewAudioApi(client),
        Assistant: api.NewAssistantApi(client),
        Model: api.NewModelApi(client),
    }
}

func (c *SdkworkAiClient) SetApiKey(apiKey string) *SdkworkAiClient {
    c.http.SetApiKey(apiKey)
    return c
}

func (c *SdkworkAiClient) SetAuthToken(token string) *SdkworkAiClient {
    c.http.SetAuthToken(token)
    return c
}

func (c *SdkworkAiClient) SetAccessToken(token string) *SdkworkAiClient {
    c.http.SetAccessToken(token)
    return c
}

func (c *SdkworkAiClient) SetHeader(key string, value string) *SdkworkAiClient {
    c.http.SetHeader(key, value)
    return c
}

func (c *SdkworkAiClient) Http() *sdkhttp.Client {
    return c.http
}
