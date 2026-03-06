import Foundation

/// API modules for sdkwork-ai-sdk
public struct API {
    public static let i18nResource = I18nResourceApi.self
    public static let chat = ChatApi.self
    public static let chat2 = Chat2Api.self
    public static let videos = VideosApi.self
    public static let videos2 = Videos2Api.self
    public static let threads = ThreadsApi.self
    public static let threads2 = Threads2Api.self
    public static let responses = ResponsesApi.self
    public static let responses2 = Responses2Api.self
    public static let rerank = RerankApi.self
    public static let rerank2 = Rerank2Api.self
    public static let music = MusicApi.self
    public static let music2 = Music2Api.self
    public static let moderations = ModerationsApi.self
    public static let moderations2 = Moderations2Api.self
    public static let chatCompletions = ChatCompletionsApi.self
    public static let chatCompletions2 = ChatCompletions2Api.self
    public static let knowledgeBases = KnowledgeBasesApi.self
    public static let knowledgeBases2 = KnowledgeBases2Api.self
    public static let images = ImagesApi.self
    public static let images2 = Images2Api.self
    public static let files = FilesApi.self
    public static let files2 = Files2Api.self
    public static let embeddings = EmbeddingsApi.self
    public static let embeddings2 = Embeddings2Api.self
    public static let context = ContextApi.self
    public static let context2 = Context2Api.self
    public static let batches = BatchesApi.self
    public static let batches2 = Batches2Api.self
    public static let audio = AudioApi.self
    public static let audio2 = Audio2Api.self
    public static let assistants = AssistantsApi.self
    public static let assistants2 = Assistants2Api.self
    public static let models = ModelsApi.self
    public static let models2 = Models2Api.self
}
