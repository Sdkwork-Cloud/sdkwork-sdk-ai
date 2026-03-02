import Foundation

/// API modules for sdkwork-ai-sdk
public struct API {
    public static let chat = ChatApi.self
    public static let videos = VideosApi.self
    public static let threads = ThreadsApi.self
    public static let responses = ResponsesApi.self
    public static let rerank = RerankApi.self
    public static let music = MusicApi.self
    public static let moderations = ModerationsApi.self
    public static let chatCompletions = ChatCompletionsApi.self
    public static let knowledgeBases = KnowledgeBasesApi.self
    public static let images = ImagesApi.self
    public static let files = FilesApi.self
    public static let embeddings = EmbeddingsApi.self
    public static let context = ContextApi.self
    public static let batches = BatchesApi.self
    public static let audio = AudioApi.self
    public static let assistants = AssistantsApi.self
    public static let models = ModelsApi.self
}
