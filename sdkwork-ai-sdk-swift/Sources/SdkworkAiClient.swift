import Foundation
import SDKworkCommon

public class SdkworkAiClient {
    private let httpClient: HttpClient
    public let open: OpenApi
    public let chat: ChatApi
    public let video: VideoApi
    public let thread: ThreadApi
    public let response: ResponseApi
    public let rerank: RerankApi
    public let music: MusicApi
    public let moderation: ModerationApi
    public let message: MessageApi
    public let knowledgeBase: KnowledgeBaseApi
    public let image: ImageApi
    public let file: FileApi
    public let embedding: EmbeddingApi
    public let context: ContextApi
    public let batch: BatchApi
    public let audio: AudioApi
    public let assistant: AssistantApi
    public let model: ModelApi

    public init(baseURL: String) {
        self.httpClient = HttpClient(baseURL: baseURL)
        self.open = OpenApi(client: httpClient)
        self.chat = ChatApi(client: httpClient)
        self.video = VideoApi(client: httpClient)
        self.thread = ThreadApi(client: httpClient)
        self.response = ResponseApi(client: httpClient)
        self.rerank = RerankApi(client: httpClient)
        self.music = MusicApi(client: httpClient)
        self.moderation = ModerationApi(client: httpClient)
        self.message = MessageApi(client: httpClient)
        self.knowledgeBase = KnowledgeBaseApi(client: httpClient)
        self.image = ImageApi(client: httpClient)
        self.file = FileApi(client: httpClient)
        self.embedding = EmbeddingApi(client: httpClient)
        self.context = ContextApi(client: httpClient)
        self.batch = BatchApi(client: httpClient)
        self.audio = AudioApi(client: httpClient)
        self.assistant = AssistantApi(client: httpClient)
        self.model = ModelApi(client: httpClient)
    }

    public init(config: SdkConfig) {
        self.httpClient = HttpClient(config: config)
        self.open = OpenApi(client: httpClient)
        self.chat = ChatApi(client: httpClient)
        self.video = VideoApi(client: httpClient)
        self.thread = ThreadApi(client: httpClient)
        self.response = ResponseApi(client: httpClient)
        self.rerank = RerankApi(client: httpClient)
        self.music = MusicApi(client: httpClient)
        self.moderation = ModerationApi(client: httpClient)
        self.message = MessageApi(client: httpClient)
        self.knowledgeBase = KnowledgeBaseApi(client: httpClient)
        self.image = ImageApi(client: httpClient)
        self.file = FileApi(client: httpClient)
        self.embedding = EmbeddingApi(client: httpClient)
        self.context = ContextApi(client: httpClient)
        self.batch = BatchApi(client: httpClient)
        self.audio = AudioApi(client: httpClient)
        self.assistant = AssistantApi(client: httpClient)
        self.model = ModelApi(client: httpClient)
    }

    public func setApiKey(_ apiKey: String) -> SdkworkAiClient {
        httpClient.setApiKey(apiKey)
        return self
    }

    public func setAuthToken(_ token: String) -> SdkworkAiClient {
        httpClient.setAuthToken(token)
        return self
    }

    public func setAccessToken(_ token: String) -> SdkworkAiClient {
        httpClient.setAccessToken(token)
        return self
    }

    public func setHeader(_ key: String, value: String) -> SdkworkAiClient {
        httpClient.setHeader(key, value: value)
        return self
    }
}
