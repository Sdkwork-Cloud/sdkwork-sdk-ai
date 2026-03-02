package ai

import (
    "github.com/sdkwork/ai-sdk/api"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type SdkworkAiClient struct {
    http *sdkhttp.Client
    Chat *api.ChatApi
    Videos *api.VideosApi
    Threads *api.ThreadsApi
    Responses *api.ResponsesApi
    Rerank *api.RerankApi
    Music *api.MusicApi
    Moderations *api.ModerationsApi
    ChatCompletions *api.ChatCompletionsApi
    KnowledgeBases *api.KnowledgeBasesApi
    Images *api.ImagesApi
    Files *api.FilesApi
    Embeddings *api.EmbeddingsApi
    Context *api.ContextApi
    Batches *api.BatchesApi
    Audio *api.AudioApi
    Assistants *api.AssistantsApi
    Models *api.ModelsApi
}

func NewSdkworkAiClient(baseURL string) *SdkworkAiClient {
    cfg := sdkhttp.NewDefaultConfig(baseURL)
    return NewSdkworkAiClientWithConfig(cfg)
}

func NewSdkworkAiClientWithConfig(config sdkhttp.Config) *SdkworkAiClient {
    client := sdkhttp.NewClient(config)
    return &SdkworkAiClient{
        http: client,
        Chat: api.NewChatApi(client),
        Videos: api.NewVideosApi(client),
        Threads: api.NewThreadsApi(client),
        Responses: api.NewResponsesApi(client),
        Rerank: api.NewRerankApi(client),
        Music: api.NewMusicApi(client),
        Moderations: api.NewModerationsApi(client),
        ChatCompletions: api.NewChatCompletionsApi(client),
        KnowledgeBases: api.NewKnowledgeBasesApi(client),
        Images: api.NewImagesApi(client),
        Files: api.NewFilesApi(client),
        Embeddings: api.NewEmbeddingsApi(client),
        Context: api.NewContextApi(client),
        Batches: api.NewBatchesApi(client),
        Audio: api.NewAudioApi(client),
        Assistants: api.NewAssistantsApi(client),
        Models: api.NewModelsApi(client),
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
