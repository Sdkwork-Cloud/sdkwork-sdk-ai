import Foundation

/// API modules for sdkwork-ai-sdk
public struct API {
    public static let open = OpenApi.self
    public static let chat = ChatApi.self
    public static let video = VideoApi.self
    public static let thread = ThreadApi.self
    public static let response = ResponseApi.self
    public static let rerank = RerankApi.self
    public static let music = MusicApi.self
    public static let moderation = ModerationApi.self
    public static let message = MessageApi.self
    public static let knowledgeBase = KnowledgeBaseApi.self
    public static let image = ImageApi.self
    public static let file = FileApi.self
    public static let embedding = EmbeddingApi.self
    public static let context = ContextApi.self
    public static let batch = BatchApi.self
    public static let audio = AudioApi.self
    public static let assistant = AssistantApi.self
    public static let model = ModelApi.self
}
