import Foundation
import SDKworkCommon

public class SdkworkAiClient {
    private let httpClient: HttpClient
    public let i18nResource: I18nResourceApi
    public let chat: ChatApi
    public let chat2: Chat2Api
    public let videos: VideosApi
    public let videos2: Videos2Api
    public let threads: ThreadsApi
    public let threads2: Threads2Api
    public let responses: ResponsesApi
    public let responses2: Responses2Api
    public let rerank: RerankApi
    public let rerank2: Rerank2Api
    public let music: MusicApi
    public let music2: Music2Api
    public let moderations: ModerationsApi
    public let moderations2: Moderations2Api
    public let chatCompletions: ChatCompletionsApi
    public let chatCompletions2: ChatCompletions2Api
    public let knowledgeBases: KnowledgeBasesApi
    public let knowledgeBases2: KnowledgeBases2Api
    public let images: ImagesApi
    public let images2: Images2Api
    public let files: FilesApi
    public let files2: Files2Api
    public let embeddings: EmbeddingsApi
    public let embeddings2: Embeddings2Api
    public let context: ContextApi
    public let context2: Context2Api
    public let batches: BatchesApi
    public let batches2: Batches2Api
    public let audio: AudioApi
    public let audio2: Audio2Api
    public let assistants: AssistantsApi
    public let assistants2: Assistants2Api
    public let models: ModelsApi
    public let models2: Models2Api

    public init(baseURL: String) {
        self.httpClient = HttpClient(baseURL: baseURL)
        self.i18nResource = I18nResourceApi(client: httpClient)
        self.chat = ChatApi(client: httpClient)
        self.chat2 = Chat2Api(client: httpClient)
        self.videos = VideosApi(client: httpClient)
        self.videos2 = Videos2Api(client: httpClient)
        self.threads = ThreadsApi(client: httpClient)
        self.threads2 = Threads2Api(client: httpClient)
        self.responses = ResponsesApi(client: httpClient)
        self.responses2 = Responses2Api(client: httpClient)
        self.rerank = RerankApi(client: httpClient)
        self.rerank2 = Rerank2Api(client: httpClient)
        self.music = MusicApi(client: httpClient)
        self.music2 = Music2Api(client: httpClient)
        self.moderations = ModerationsApi(client: httpClient)
        self.moderations2 = Moderations2Api(client: httpClient)
        self.chatCompletions = ChatCompletionsApi(client: httpClient)
        self.chatCompletions2 = ChatCompletions2Api(client: httpClient)
        self.knowledgeBases = KnowledgeBasesApi(client: httpClient)
        self.knowledgeBases2 = KnowledgeBases2Api(client: httpClient)
        self.images = ImagesApi(client: httpClient)
        self.images2 = Images2Api(client: httpClient)
        self.files = FilesApi(client: httpClient)
        self.files2 = Files2Api(client: httpClient)
        self.embeddings = EmbeddingsApi(client: httpClient)
        self.embeddings2 = Embeddings2Api(client: httpClient)
        self.context = ContextApi(client: httpClient)
        self.context2 = Context2Api(client: httpClient)
        self.batches = BatchesApi(client: httpClient)
        self.batches2 = Batches2Api(client: httpClient)
        self.audio = AudioApi(client: httpClient)
        self.audio2 = Audio2Api(client: httpClient)
        self.assistants = AssistantsApi(client: httpClient)
        self.assistants2 = Assistants2Api(client: httpClient)
        self.models = ModelsApi(client: httpClient)
        self.models2 = Models2Api(client: httpClient)
    }

    public init(config: SdkConfig) {
        self.httpClient = HttpClient(config: config)
        self.i18nResource = I18nResourceApi(client: httpClient)
        self.chat = ChatApi(client: httpClient)
        self.chat2 = Chat2Api(client: httpClient)
        self.videos = VideosApi(client: httpClient)
        self.videos2 = Videos2Api(client: httpClient)
        self.threads = ThreadsApi(client: httpClient)
        self.threads2 = Threads2Api(client: httpClient)
        self.responses = ResponsesApi(client: httpClient)
        self.responses2 = Responses2Api(client: httpClient)
        self.rerank = RerankApi(client: httpClient)
        self.rerank2 = Rerank2Api(client: httpClient)
        self.music = MusicApi(client: httpClient)
        self.music2 = Music2Api(client: httpClient)
        self.moderations = ModerationsApi(client: httpClient)
        self.moderations2 = Moderations2Api(client: httpClient)
        self.chatCompletions = ChatCompletionsApi(client: httpClient)
        self.chatCompletions2 = ChatCompletions2Api(client: httpClient)
        self.knowledgeBases = KnowledgeBasesApi(client: httpClient)
        self.knowledgeBases2 = KnowledgeBases2Api(client: httpClient)
        self.images = ImagesApi(client: httpClient)
        self.images2 = Images2Api(client: httpClient)
        self.files = FilesApi(client: httpClient)
        self.files2 = Files2Api(client: httpClient)
        self.embeddings = EmbeddingsApi(client: httpClient)
        self.embeddings2 = Embeddings2Api(client: httpClient)
        self.context = ContextApi(client: httpClient)
        self.context2 = Context2Api(client: httpClient)
        self.batches = BatchesApi(client: httpClient)
        self.batches2 = Batches2Api(client: httpClient)
        self.audio = AudioApi(client: httpClient)
        self.audio2 = Audio2Api(client: httpClient)
        self.assistants = AssistantsApi(client: httpClient)
        self.assistants2 = Assistants2Api(client: httpClient)
        self.models = ModelsApi(client: httpClient)
        self.models2 = Models2Api(client: httpClient)
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
