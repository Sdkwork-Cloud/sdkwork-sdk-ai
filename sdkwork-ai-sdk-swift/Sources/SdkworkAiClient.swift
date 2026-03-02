import Foundation
import SDKworkCommon

public class SdkworkAiClient {
    private let httpClient: HttpClient
    public let chat: ChatApi
    public let videos: VideosApi
    public let threads: ThreadsApi
    public let responses: ResponsesApi
    public let rerank: RerankApi
    public let music: MusicApi
    public let moderations: ModerationsApi
    public let chatCompletions: ChatCompletionsApi
    public let knowledgeBases: KnowledgeBasesApi
    public let images: ImagesApi
    public let files: FilesApi
    public let embeddings: EmbeddingsApi
    public let context: ContextApi
    public let batches: BatchesApi
    public let audio: AudioApi
    public let assistants: AssistantsApi
    public let models: ModelsApi

    public init(baseURL: String) {
        self.httpClient = HttpClient(baseURL: baseURL)
        self.chat = ChatApi(client: httpClient)
        self.videos = VideosApi(client: httpClient)
        self.threads = ThreadsApi(client: httpClient)
        self.responses = ResponsesApi(client: httpClient)
        self.rerank = RerankApi(client: httpClient)
        self.music = MusicApi(client: httpClient)
        self.moderations = ModerationsApi(client: httpClient)
        self.chatCompletions = ChatCompletionsApi(client: httpClient)
        self.knowledgeBases = KnowledgeBasesApi(client: httpClient)
        self.images = ImagesApi(client: httpClient)
        self.files = FilesApi(client: httpClient)
        self.embeddings = EmbeddingsApi(client: httpClient)
        self.context = ContextApi(client: httpClient)
        self.batches = BatchesApi(client: httpClient)
        self.audio = AudioApi(client: httpClient)
        self.assistants = AssistantsApi(client: httpClient)
        self.models = ModelsApi(client: httpClient)
    }

    public init(config: SdkConfig) {
        self.httpClient = HttpClient(config: config)
        self.chat = ChatApi(client: httpClient)
        self.videos = VideosApi(client: httpClient)
        self.threads = ThreadsApi(client: httpClient)
        self.responses = ResponsesApi(client: httpClient)
        self.rerank = RerankApi(client: httpClient)
        self.music = MusicApi(client: httpClient)
        self.moderations = ModerationsApi(client: httpClient)
        self.chatCompletions = ChatCompletionsApi(client: httpClient)
        self.knowledgeBases = KnowledgeBasesApi(client: httpClient)
        self.images = ImagesApi(client: httpClient)
        self.files = FilesApi(client: httpClient)
        self.embeddings = EmbeddingsApi(client: httpClient)
        self.context = ContextApi(client: httpClient)
        self.batches = BatchesApi(client: httpClient)
        self.audio = AudioApi(client: httpClient)
        self.assistants = AssistantsApi(client: httpClient)
        self.models = ModelsApi(client: httpClient)
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
