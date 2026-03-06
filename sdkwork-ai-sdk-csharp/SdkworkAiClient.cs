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
using Ai.Api;

namespace Ai
{
    public class SdkworkAiClient
    {
        private readonly HttpClient _httpClient;

        public I18nResourceApi I18nResource { get; }
        public ChatApi Chat { get; }
        public Chat2Api Chat2 { get; }
        public VideosApi Videos { get; }
        public Videos2Api Videos2 { get; }
        public ThreadsApi Threads { get; }
        public Threads2Api Threads2 { get; }
        public ResponsesApi Responses { get; }
        public Responses2Api Responses2 { get; }
        public RerankApi Rerank { get; }
        public Rerank2Api Rerank2 { get; }
        public MusicApi Music { get; }
        public Music2Api Music2 { get; }
        public ModerationsApi Moderations { get; }
        public Moderations2Api Moderations2 { get; }
        public ChatCompletionsApi ChatCompletions { get; }
        public ChatCompletions2Api ChatCompletions2 { get; }
        public KnowledgeBasesApi KnowledgeBases { get; }
        public KnowledgeBases2Api KnowledgeBases2 { get; }
        public ImagesApi Images { get; }
        public Images2Api Images2 { get; }
        public FilesApi Files { get; }
        public Files2Api Files2 { get; }
        public EmbeddingsApi Embeddings { get; }
        public Embeddings2Api Embeddings2 { get; }
        public ContextApi Context { get; }
        public Context2Api Context2 { get; }
        public BatchesApi Batches { get; }
        public Batches2Api Batches2 { get; }
        public AudioApi Audio { get; }
        public Audio2Api Audio2 { get; }
        public AssistantsApi Assistants { get; }
        public Assistants2Api Assistants2 { get; }
        public ModelsApi Models { get; }
        public Models2Api Models2 { get; }

        public SdkworkAiClient(string baseUrl)
        {
            _httpClient = new HttpClient(baseUrl);
            I18nResource = new I18nResourceApi(_httpClient);
            Chat = new ChatApi(_httpClient);
            Chat2 = new Chat2Api(_httpClient);
            Videos = new VideosApi(_httpClient);
            Videos2 = new Videos2Api(_httpClient);
            Threads = new ThreadsApi(_httpClient);
            Threads2 = new Threads2Api(_httpClient);
            Responses = new ResponsesApi(_httpClient);
            Responses2 = new Responses2Api(_httpClient);
            Rerank = new RerankApi(_httpClient);
            Rerank2 = new Rerank2Api(_httpClient);
            Music = new MusicApi(_httpClient);
            Music2 = new Music2Api(_httpClient);
            Moderations = new ModerationsApi(_httpClient);
            Moderations2 = new Moderations2Api(_httpClient);
            ChatCompletions = new ChatCompletionsApi(_httpClient);
            ChatCompletions2 = new ChatCompletions2Api(_httpClient);
            KnowledgeBases = new KnowledgeBasesApi(_httpClient);
            KnowledgeBases2 = new KnowledgeBases2Api(_httpClient);
            Images = new ImagesApi(_httpClient);
            Images2 = new Images2Api(_httpClient);
            Files = new FilesApi(_httpClient);
            Files2 = new Files2Api(_httpClient);
            Embeddings = new EmbeddingsApi(_httpClient);
            Embeddings2 = new Embeddings2Api(_httpClient);
            Context = new ContextApi(_httpClient);
            Context2 = new Context2Api(_httpClient);
            Batches = new BatchesApi(_httpClient);
            Batches2 = new Batches2Api(_httpClient);
            Audio = new AudioApi(_httpClient);
            Audio2 = new Audio2Api(_httpClient);
            Assistants = new AssistantsApi(_httpClient);
            Assistants2 = new Assistants2Api(_httpClient);
            Models = new ModelsApi(_httpClient);
            Models2 = new Models2Api(_httpClient);
        }

        public SdkworkAiClient(SdkConfig config)
        {
            _httpClient = new HttpClient(config);
            I18nResource = new I18nResourceApi(_httpClient);
            Chat = new ChatApi(_httpClient);
            Chat2 = new Chat2Api(_httpClient);
            Videos = new VideosApi(_httpClient);
            Videos2 = new Videos2Api(_httpClient);
            Threads = new ThreadsApi(_httpClient);
            Threads2 = new Threads2Api(_httpClient);
            Responses = new ResponsesApi(_httpClient);
            Responses2 = new Responses2Api(_httpClient);
            Rerank = new RerankApi(_httpClient);
            Rerank2 = new Rerank2Api(_httpClient);
            Music = new MusicApi(_httpClient);
            Music2 = new Music2Api(_httpClient);
            Moderations = new ModerationsApi(_httpClient);
            Moderations2 = new Moderations2Api(_httpClient);
            ChatCompletions = new ChatCompletionsApi(_httpClient);
            ChatCompletions2 = new ChatCompletions2Api(_httpClient);
            KnowledgeBases = new KnowledgeBasesApi(_httpClient);
            KnowledgeBases2 = new KnowledgeBases2Api(_httpClient);
            Images = new ImagesApi(_httpClient);
            Images2 = new Images2Api(_httpClient);
            Files = new FilesApi(_httpClient);
            Files2 = new Files2Api(_httpClient);
            Embeddings = new EmbeddingsApi(_httpClient);
            Embeddings2 = new Embeddings2Api(_httpClient);
            Context = new ContextApi(_httpClient);
            Context2 = new Context2Api(_httpClient);
            Batches = new BatchesApi(_httpClient);
            Batches2 = new Batches2Api(_httpClient);
            Audio = new AudioApi(_httpClient);
            Audio2 = new Audio2Api(_httpClient);
            Assistants = new AssistantsApi(_httpClient);
            Assistants2 = new Assistants2Api(_httpClient);
            Models = new ModelsApi(_httpClient);
            Models2 = new Models2Api(_httpClient);
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
