using System;
using Ai.Http;
using SDKwork.Common.Core;
using Ai.Api;
using Ai.Api;
using Ai.Api;
using Ai.Api;
using Ai.Api;
using Ai.Api;
using Ai.Api;
using Ai.Api;
using Ai.Api;
using Ai.Api;
using Ai.Api;
using Ai.Api;
using Ai.Api;
using Ai.Api;
using Ai.Api;
using Ai.Api;
using Ai.Api;

namespace Ai
{
    public class SdkworkAiClient
    {
        private readonly HttpClient _httpClient;

        public ChatApi Chat { get; }
        public VideosApi Videos { get; }
        public ThreadsApi Threads { get; }
        public ResponsesApi Responses { get; }
        public RerankApi Rerank { get; }
        public MusicApi Music { get; }
        public ModerationsApi Moderations { get; }
        public ChatCompletionsApi ChatCompletions { get; }
        public KnowledgeBasesApi KnowledgeBases { get; }
        public ImagesApi Images { get; }
        public FilesApi Files { get; }
        public EmbeddingsApi Embeddings { get; }
        public ContextApi Context { get; }
        public BatchesApi Batches { get; }
        public AudioApi Audio { get; }
        public AssistantsApi Assistants { get; }
        public ModelsApi Models { get; }

        public SdkworkAiClient(string baseUrl)
        {
            _httpClient = new HttpClient(baseUrl);
            Chat = new ChatApi(_httpClient);
            Videos = new VideosApi(_httpClient);
            Threads = new ThreadsApi(_httpClient);
            Responses = new ResponsesApi(_httpClient);
            Rerank = new RerankApi(_httpClient);
            Music = new MusicApi(_httpClient);
            Moderations = new ModerationsApi(_httpClient);
            ChatCompletions = new ChatCompletionsApi(_httpClient);
            KnowledgeBases = new KnowledgeBasesApi(_httpClient);
            Images = new ImagesApi(_httpClient);
            Files = new FilesApi(_httpClient);
            Embeddings = new EmbeddingsApi(_httpClient);
            Context = new ContextApi(_httpClient);
            Batches = new BatchesApi(_httpClient);
            Audio = new AudioApi(_httpClient);
            Assistants = new AssistantsApi(_httpClient);
            Models = new ModelsApi(_httpClient);
        }

        public SdkworkAiClient(SdkConfig config)
        {
            _httpClient = new HttpClient(config);
            Chat = new ChatApi(_httpClient);
            Videos = new VideosApi(_httpClient);
            Threads = new ThreadsApi(_httpClient);
            Responses = new ResponsesApi(_httpClient);
            Rerank = new RerankApi(_httpClient);
            Music = new MusicApi(_httpClient);
            Moderations = new ModerationsApi(_httpClient);
            ChatCompletions = new ChatCompletionsApi(_httpClient);
            KnowledgeBases = new KnowledgeBasesApi(_httpClient);
            Images = new ImagesApi(_httpClient);
            Files = new FilesApi(_httpClient);
            Embeddings = new EmbeddingsApi(_httpClient);
            Context = new ContextApi(_httpClient);
            Batches = new BatchesApi(_httpClient);
            Audio = new AudioApi(_httpClient);
            Assistants = new AssistantsApi(_httpClient);
            Models = new ModelsApi(_httpClient);
        }

        public SdkworkAiClient SetApiKey(string apiKey)
        {
            _httpClient.SetApiKey(apiKey);
            return this;
        }

        public SdkworkAiClient SetAuthToken(string token)
        {
            _httpClient.SetAuthToken(token);
            return this;
        }

        public SdkworkAiClient SetAccessToken(string token)
        {
            _httpClient.SetAccessToken(token);
            return this;
        }

        public SdkworkAiClient SetHeader(string key, string value)
        {
            _httpClient.SetHeader(key, value);
            return this;
        }
    }
}
