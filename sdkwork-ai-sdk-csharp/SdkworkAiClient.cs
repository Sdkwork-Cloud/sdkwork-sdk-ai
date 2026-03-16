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

namespace Ai
{
    public class SdkworkAiClient
    {
        private readonly HttpClient _httpClient;

        public OpenApi Open { get; }
        public ChatApi Chat { get; }
        public VideoApi Video { get; }
        public ThreadApi Thread { get; }
        public ResponseApi Response { get; }
        public RerankApi Rerank { get; }
        public MusicApi Music { get; }
        public ModerationApi Moderation { get; }
        public MessageApi Message { get; }
        public KnowledgeBaseApi KnowledgeBase { get; }
        public ImageApi Image { get; }
        public FileApi File { get; }
        public EmbeddingApi Embedding { get; }
        public ContextApi Context { get; }
        public BatchApi Batch { get; }
        public AudioApi Audio { get; }
        public AssistantApi Assistant { get; }
        public ModelApi Model { get; }

        public SdkworkAiClient(string baseUrl)
        {
            _httpClient = new HttpClient(baseUrl);
            Open = new OpenApi(_httpClient);
            Chat = new ChatApi(_httpClient);
            Video = new VideoApi(_httpClient);
            Thread = new ThreadApi(_httpClient);
            Response = new ResponseApi(_httpClient);
            Rerank = new RerankApi(_httpClient);
            Music = new MusicApi(_httpClient);
            Moderation = new ModerationApi(_httpClient);
            Message = new MessageApi(_httpClient);
            KnowledgeBase = new KnowledgeBaseApi(_httpClient);
            Image = new ImageApi(_httpClient);
            File = new FileApi(_httpClient);
            Embedding = new EmbeddingApi(_httpClient);
            Context = new ContextApi(_httpClient);
            Batch = new BatchApi(_httpClient);
            Audio = new AudioApi(_httpClient);
            Assistant = new AssistantApi(_httpClient);
            Model = new ModelApi(_httpClient);
        }

        public SdkworkAiClient(SdkConfig config)
        {
            _httpClient = new HttpClient(config);
            Open = new OpenApi(_httpClient);
            Chat = new ChatApi(_httpClient);
            Video = new VideoApi(_httpClient);
            Thread = new ThreadApi(_httpClient);
            Response = new ResponseApi(_httpClient);
            Rerank = new RerankApi(_httpClient);
            Music = new MusicApi(_httpClient);
            Moderation = new ModerationApi(_httpClient);
            Message = new MessageApi(_httpClient);
            KnowledgeBase = new KnowledgeBaseApi(_httpClient);
            Image = new ImageApi(_httpClient);
            File = new FileApi(_httpClient);
            Embedding = new EmbeddingApi(_httpClient);
            Context = new ContextApi(_httpClient);
            Batch = new BatchApi(_httpClient);
            Audio = new AudioApi(_httpClient);
            Assistant = new AssistantApi(_httpClient);
            Model = new ModelApi(_httpClient);
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
