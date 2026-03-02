package com.sdkwork.ai

import com.sdkwork.common.core.SdkConfig
import com.sdkwork.ai.http.HttpClient
import com.sdkwork.ai.api.ChatApi
import com.sdkwork.ai.api.VideosApi
import com.sdkwork.ai.api.ThreadsApi
import com.sdkwork.ai.api.ResponsesApi
import com.sdkwork.ai.api.RerankApi
import com.sdkwork.ai.api.MusicApi
import com.sdkwork.ai.api.ModerationsApi
import com.sdkwork.ai.api.ChatCompletionsApi
import com.sdkwork.ai.api.KnowledgeBasesApi
import com.sdkwork.ai.api.ImagesApi
import com.sdkwork.ai.api.FilesApi
import com.sdkwork.ai.api.EmbeddingsApi
import com.sdkwork.ai.api.ContextApi
import com.sdkwork.ai.api.BatchesApi
import com.sdkwork.ai.api.AudioApi
import com.sdkwork.ai.api.AssistantsApi
import com.sdkwork.ai.api.ModelsApi

class SdkworkAiClient {
    private val httpClient: HttpClient

    lateinit var chat: ChatApi
    lateinit var videos: VideosApi
    lateinit var threads: ThreadsApi
    lateinit var responses: ResponsesApi
    lateinit var rerank: RerankApi
    lateinit var music: MusicApi
    lateinit var moderations: ModerationsApi
    lateinit var chatCompletions: ChatCompletionsApi
    lateinit var knowledgeBases: KnowledgeBasesApi
    lateinit var images: ImagesApi
    lateinit var files: FilesApi
    lateinit var embeddings: EmbeddingsApi
    lateinit var context: ContextApi
    lateinit var batches: BatchesApi
    lateinit var audio: AudioApi
    lateinit var assistants: AssistantsApi
    lateinit var models: ModelsApi

    constructor(baseUrl: String) {
        this.httpClient = HttpClient(baseUrl)
        chat = ChatApi(httpClient)
        videos = VideosApi(httpClient)
        threads = ThreadsApi(httpClient)
        responses = ResponsesApi(httpClient)
        rerank = RerankApi(httpClient)
        music = MusicApi(httpClient)
        moderations = ModerationsApi(httpClient)
        chatCompletions = ChatCompletionsApi(httpClient)
        knowledgeBases = KnowledgeBasesApi(httpClient)
        images = ImagesApi(httpClient)
        files = FilesApi(httpClient)
        embeddings = EmbeddingsApi(httpClient)
        context = ContextApi(httpClient)
        batches = BatchesApi(httpClient)
        audio = AudioApi(httpClient)
        assistants = AssistantsApi(httpClient)
        models = ModelsApi(httpClient)
    }

    constructor(config: SdkConfig) {
        this.httpClient = HttpClient(config)
        chat = ChatApi(httpClient)
        videos = VideosApi(httpClient)
        threads = ThreadsApi(httpClient)
        responses = ResponsesApi(httpClient)
        rerank = RerankApi(httpClient)
        music = MusicApi(httpClient)
        moderations = ModerationsApi(httpClient)
        chatCompletions = ChatCompletionsApi(httpClient)
        knowledgeBases = KnowledgeBasesApi(httpClient)
        images = ImagesApi(httpClient)
        files = FilesApi(httpClient)
        embeddings = EmbeddingsApi(httpClient)
        context = ContextApi(httpClient)
        batches = BatchesApi(httpClient)
        audio = AudioApi(httpClient)
        assistants = AssistantsApi(httpClient)
        models = ModelsApi(httpClient)
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
