namespace Ai.Api
{
    /// <summary>
    /// API modules for sdkwork-ai-sdk
    /// </summary>
    public static class Api
    {
        public static OpenApi Open { get; set; }
        public static ChatApi Chat { get; set; }
        public static VideoApi Video { get; set; }
        public static ThreadApi Thread { get; set; }
        public static ResponseApi Response { get; set; }
        public static RerankApi Rerank { get; set; }
        public static MusicApi Music { get; set; }
        public static ModerationApi Moderation { get; set; }
        public static MessageApi Message { get; set; }
        public static KnowledgeBaseApi KnowledgeBase { get; set; }
        public static ImageApi Image { get; set; }
        public static FileApi File { get; set; }
        public static EmbeddingApi Embedding { get; set; }
        public static ContextApi Context { get; set; }
        public static BatchApi Batch { get; set; }
        public static AudioApi Audio { get; set; }
        public static AssistantApi Assistant { get; set; }
        public static ModelApi Model { get; set; }
    }
}
