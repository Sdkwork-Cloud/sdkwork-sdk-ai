package com.sdkwork.ai.api

import com.sdkwork.ai.http.HttpClient

/**
 * API modules for sdkwork-ai-sdk
 */
class Api(private val client: HttpClient) {
    val open: OpenApi = OpenApi(client)
    val chat: ChatApi = ChatApi(client)
    val video: VideoApi = VideoApi(client)
    val thread: ThreadApi = ThreadApi(client)
    val response: ResponseApi = ResponseApi(client)
    val rerank: RerankApi = RerankApi(client)
    val music: MusicApi = MusicApi(client)
    val moderation: ModerationApi = ModerationApi(client)
    val message: MessageApi = MessageApi(client)
    val knowledgeBase: KnowledgeBaseApi = KnowledgeBaseApi(client)
    val image: ImageApi = ImageApi(client)
    val file: FileApi = FileApi(client)
    val embedding: EmbeddingApi = EmbeddingApi(client)
    val context: ContextApi = ContextApi(client)
    val batch: BatchApi = BatchApi(client)
    val audio: AudioApi = AudioApi(client)
    val assistant: AssistantApi = AssistantApi(client)
    val model: ModelApi = ModelApi(client)
}
