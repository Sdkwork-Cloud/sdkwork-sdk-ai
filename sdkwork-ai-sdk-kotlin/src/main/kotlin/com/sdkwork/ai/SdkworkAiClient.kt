package com.sdkwork.ai

import com.sdkwork.common.core.SdkConfig
import com.sdkwork.ai.http.HttpClient
import com.sdkwork.ai.api.OpenApi
import com.sdkwork.ai.api.ChatApi
import com.sdkwork.ai.api.VideoApi
import com.sdkwork.ai.api.ThreadApi
import com.sdkwork.ai.api.ResponseApi
import com.sdkwork.ai.api.RerankApi
import com.sdkwork.ai.api.MusicApi
import com.sdkwork.ai.api.ModerationApi
import com.sdkwork.ai.api.MessageApi
import com.sdkwork.ai.api.KnowledgeBaseApi
import com.sdkwork.ai.api.ImageApi
import com.sdkwork.ai.api.FileApi
import com.sdkwork.ai.api.EmbeddingApi
import com.sdkwork.ai.api.ContextApi
import com.sdkwork.ai.api.BatchApi
import com.sdkwork.ai.api.AudioApi
import com.sdkwork.ai.api.AssistantApi
import com.sdkwork.ai.api.ModelApi

class SdkworkAiClient {
    private val httpClient: HttpClient

    lateinit var open: OpenApi
    lateinit var chat: ChatApi
    lateinit var video: VideoApi
    lateinit var thread: ThreadApi
    lateinit var response: ResponseApi
    lateinit var rerank: RerankApi
    lateinit var music: MusicApi
    lateinit var moderation: ModerationApi
    lateinit var message: MessageApi
    lateinit var knowledgeBase: KnowledgeBaseApi
    lateinit var image: ImageApi
    lateinit var file: FileApi
    lateinit var embedding: EmbeddingApi
    lateinit var context: ContextApi
    lateinit var batch: BatchApi
    lateinit var audio: AudioApi
    lateinit var assistant: AssistantApi
    lateinit var model: ModelApi

    constructor(baseUrl: String) {
        this.httpClient = HttpClient(baseUrl)
        open = OpenApi(httpClient)
        chat = ChatApi(httpClient)
        video = VideoApi(httpClient)
        thread = ThreadApi(httpClient)
        response = ResponseApi(httpClient)
        rerank = RerankApi(httpClient)
        music = MusicApi(httpClient)
        moderation = ModerationApi(httpClient)
        message = MessageApi(httpClient)
        knowledgeBase = KnowledgeBaseApi(httpClient)
        image = ImageApi(httpClient)
        file = FileApi(httpClient)
        embedding = EmbeddingApi(httpClient)
        context = ContextApi(httpClient)
        batch = BatchApi(httpClient)
        audio = AudioApi(httpClient)
        assistant = AssistantApi(httpClient)
        model = ModelApi(httpClient)
    }

    constructor(config: SdkConfig) {
        this.httpClient = HttpClient(config)
        open = OpenApi(httpClient)
        chat = ChatApi(httpClient)
        video = VideoApi(httpClient)
        thread = ThreadApi(httpClient)
        response = ResponseApi(httpClient)
        rerank = RerankApi(httpClient)
        music = MusicApi(httpClient)
        moderation = ModerationApi(httpClient)
        message = MessageApi(httpClient)
        knowledgeBase = KnowledgeBaseApi(httpClient)
        image = ImageApi(httpClient)
        file = FileApi(httpClient)
        embedding = EmbeddingApi(httpClient)
        context = ContextApi(httpClient)
        batch = BatchApi(httpClient)
        audio = AudioApi(httpClient)
        assistant = AssistantApi(httpClient)
        model = ModelApi(httpClient)
    }

    fun setApiKey(apiKey: String): SdkworkAiClient {
        httpClient.setApiKey(apiKey)
        return this
    }

    fun setAuthToken(token: String): SdkworkAiClient {
        httpClient.setAuthToken(token)
        return this
    }

    fun setAccessToken(token: String): SdkworkAiClient {
        httpClient.setAccessToken(token)
        return this
    }

    fun setHeader(key: String, value: String): SdkworkAiClient {
        httpClient.setHeader(key, value)
        return this
    }
}
