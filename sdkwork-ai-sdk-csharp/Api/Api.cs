namespace Ai.Api
{
    /// <summary>
    /// API modules for sdkwork-ai-sdk
    /// </summary>
    public static class Api
    {
        public static ChatApi Chat { get; set; }
        public static VideosApi Videos { get; set; }
        public static ThreadsApi Threads { get; set; }
        public static ResponsesApi Responses { get; set; }
        public static RerankApi Rerank { get; set; }
        public static MusicApi Music { get; set; }
        public static ModerationsApi Moderations { get; set; }
        public static ChatCompletionsApi ChatCompletions { get; set; }
        public static KnowledgeBasesApi KnowledgeBases { get; set; }
        public static ImagesApi Images { get; set; }
        public static FilesApi Files { get; set; }
        public static EmbeddingsApi Embeddings { get; set; }
        public static ContextApi Context { get; set; }
        public static BatchesApi Batches { get; set; }
        public static AudioApi Audio { get; set; }
        public static AssistantsApi Assistants { get; set; }
        public static ModelsApi Models { get; set; }
    }
}
