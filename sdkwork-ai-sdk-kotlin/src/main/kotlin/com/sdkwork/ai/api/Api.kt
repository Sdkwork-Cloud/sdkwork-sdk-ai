package com.sdkwork.ai.api

import com.sdkwork.ai.http.HttpClient

/**
 * API modules for sdkwork-ai-sdk
 */
class Api(private val client: HttpClient) {
    val chat: ChatApi = ChatApi(client)
    val videos: VideosApi = VideosApi(client)
    val threads: ThreadsApi = ThreadsApi(client)
    val responses: ResponsesApi = ResponsesApi(client)
    val rerank: RerankApi = RerankApi(client)
    val music: MusicApi = MusicApi(client)
    val moderations: ModerationsApi = ModerationsApi(client)
    val chatCompletions: ChatCompletionsApi = ChatCompletionsApi(client)
    val knowledgeBases: KnowledgeBasesApi = KnowledgeBasesApi(client)
    val images: ImagesApi = ImagesApi(client)
    val files: FilesApi = FilesApi(client)
    val embeddings: EmbeddingsApi = EmbeddingsApi(client)
    val context: ContextApi = ContextApi(client)
    val batches: BatchesApi = BatchesApi(client)
    val audio: AudioApi = AudioApi(client)
    val assistants: AssistantsApi = AssistantsApi(client)
    val models: ModelsApi = ModelsApi(client)
}
