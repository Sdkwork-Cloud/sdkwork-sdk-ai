package com.sdkwork.ai.api

import com.sdkwork.ai.http.HttpClient

/**
 * API modules for sdkwork-ai-sdk
 */
class Api(private val client: HttpClient) {
    val i18nResource: I18nResourceApi = I18nResourceApi(client)
    val chat: ChatApi = ChatApi(client)
    val chat2: Chat2Api = Chat2Api(client)
    val videos: VideosApi = VideosApi(client)
    val videos2: Videos2Api = Videos2Api(client)
    val threads: ThreadsApi = ThreadsApi(client)
    val threads2: Threads2Api = Threads2Api(client)
    val responses: ResponsesApi = ResponsesApi(client)
    val responses2: Responses2Api = Responses2Api(client)
    val rerank: RerankApi = RerankApi(client)
    val rerank2: Rerank2Api = Rerank2Api(client)
    val music: MusicApi = MusicApi(client)
    val music2: Music2Api = Music2Api(client)
    val moderations: ModerationsApi = ModerationsApi(client)
    val moderations2: Moderations2Api = Moderations2Api(client)
    val chatCompletions: ChatCompletionsApi = ChatCompletionsApi(client)
    val chatCompletions2: ChatCompletions2Api = ChatCompletions2Api(client)
    val knowledgeBases: KnowledgeBasesApi = KnowledgeBasesApi(client)
    val knowledgeBases2: KnowledgeBases2Api = KnowledgeBases2Api(client)
    val images: ImagesApi = ImagesApi(client)
    val images2: Images2Api = Images2Api(client)
    val files: FilesApi = FilesApi(client)
    val files2: Files2Api = Files2Api(client)
    val embeddings: EmbeddingsApi = EmbeddingsApi(client)
    val embeddings2: Embeddings2Api = Embeddings2Api(client)
    val context: ContextApi = ContextApi(client)
    val context2: Context2Api = Context2Api(client)
    val batches: BatchesApi = BatchesApi(client)
    val batches2: Batches2Api = Batches2Api(client)
    val audio: AudioApi = AudioApi(client)
    val audio2: Audio2Api = Audio2Api(client)
    val assistants: AssistantsApi = AssistantsApi(client)
    val assistants2: Assistants2Api = Assistants2Api(client)
    val models: ModelsApi = ModelsApi(client)
    val models2: Models2Api = Models2Api(client)
}
