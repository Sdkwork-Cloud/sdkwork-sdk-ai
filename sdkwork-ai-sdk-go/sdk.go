package ai

import (
    "github.com/sdkwork/ai-sdk/api"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

type SdkworkAiClient struct {
    http *sdkhttp.Client
    I18nResource *api.I18nResourceApi
    Chat *api.ChatApi
    Chat2 *api.Chat2Api
    Videos *api.VideosApi
    Videos2 *api.Videos2Api
    Threads *api.ThreadsApi
    Threads2 *api.Threads2Api
    Responses *api.ResponsesApi
    Responses2 *api.Responses2Api
    Rerank *api.RerankApi
    Rerank2 *api.Rerank2Api
    Music *api.MusicApi
    Music2 *api.Music2Api
    Moderations *api.ModerationsApi
    Moderations2 *api.Moderations2Api
    ChatCompletions *api.ChatCompletionsApi
    ChatCompletions2 *api.ChatCompletions2Api
    KnowledgeBases *api.KnowledgeBasesApi
    KnowledgeBases2 *api.KnowledgeBases2Api
    Images *api.ImagesApi
    Images2 *api.Images2Api
    Files *api.FilesApi
    Files2 *api.Files2Api
    Embeddings *api.EmbeddingsApi
    Embeddings2 *api.Embeddings2Api
    Context *api.ContextApi
    Context2 *api.Context2Api
    Batches *api.BatchesApi
    Batches2 *api.Batches2Api
    Audio *api.AudioApi
    Audio2 *api.Audio2Api
    Assistants *api.AssistantsApi
    Assistants2 *api.Assistants2Api
    Models *api.ModelsApi
    Models2 *api.Models2Api
}

func NewSdkworkAiClient(baseURL string) *SdkworkAiClient {
    cfg := sdkhttp.NewDefaultConfig(baseURL)
    return NewSdkworkAiClientWithConfig(cfg)
}

func NewSdkworkAiClientWithConfig(config sdkhttp.Config) *SdkworkAiClient {
    client := sdkhttp.NewClient(config)
    return &SdkworkAiClient{
        http: client,
        I18nResource: api.NewI18nResourceApi(client),
        Chat: api.NewChatApi(client),
        Chat2: api.NewChat2Api(client),
        Videos: api.NewVideosApi(client),
        Videos2: api.NewVideos2Api(client),
        Threads: api.NewThreadsApi(client),
        Threads2: api.NewThreads2Api(client),
        Responses: api.NewResponsesApi(client),
        Responses2: api.NewResponses2Api(client),
        Rerank: api.NewRerankApi(client),
        Rerank2: api.NewRerank2Api(client),
        Music: api.NewMusicApi(client),
        Music2: api.NewMusic2Api(client),
        Moderations: api.NewModerationsApi(client),
        Moderations2: api.NewModerations2Api(client),
        ChatCompletions: api.NewChatCompletionsApi(client),
        ChatCompletions2: api.NewChatCompletions2Api(client),
        KnowledgeBases: api.NewKnowledgeBasesApi(client),
        KnowledgeBases2: api.NewKnowledgeBases2Api(client),
        Images: api.NewImagesApi(client),
        Images2: api.NewImages2Api(client),
        Files: api.NewFilesApi(client),
        Files2: api.NewFiles2Api(client),
        Embeddings: api.NewEmbeddingsApi(client),
        Embeddings2: api.NewEmbeddings2Api(client),
        Context: api.NewContextApi(client),
        Context2: api.NewContext2Api(client),
        Batches: api.NewBatchesApi(client),
        Batches2: api.NewBatches2Api(client),
        Audio: api.NewAudioApi(client),
        Audio2: api.NewAudio2Api(client),
        Assistants: api.NewAssistantsApi(client),
        Assistants2: api.NewAssistants2Api(client),
        Models: api.NewModelsApi(client),
        Models2: api.NewModels2Api(client),
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
