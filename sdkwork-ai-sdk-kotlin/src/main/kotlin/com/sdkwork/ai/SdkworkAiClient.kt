package com.sdkwork.ai

import com.sdkwork.common.core.SdkConfig
import com.sdkwork.ai.http.HttpClient
import com.sdkwork.ai.api.I18nResourceApi
import com.sdkwork.ai.api.ChatApi
import com.sdkwork.ai.api.Chat2Api
import com.sdkwork.ai.api.VideosApi
import com.sdkwork.ai.api.Videos2Api
import com.sdkwork.ai.api.ThreadsApi
import com.sdkwork.ai.api.Threads2Api
import com.sdkwork.ai.api.ResponsesApi
import com.sdkwork.ai.api.Responses2Api
import com.sdkwork.ai.api.RerankApi
import com.sdkwork.ai.api.Rerank2Api
import com.sdkwork.ai.api.MusicApi
import com.sdkwork.ai.api.Music2Api
import com.sdkwork.ai.api.ModerationsApi
import com.sdkwork.ai.api.Moderations2Api
import com.sdkwork.ai.api.ChatCompletionsApi
import com.sdkwork.ai.api.ChatCompletions2Api
import com.sdkwork.ai.api.KnowledgeBasesApi
import com.sdkwork.ai.api.KnowledgeBases2Api
import com.sdkwork.ai.api.ImagesApi
import com.sdkwork.ai.api.Images2Api
import com.sdkwork.ai.api.FilesApi
import com.sdkwork.ai.api.Files2Api
import com.sdkwork.ai.api.EmbeddingsApi
import com.sdkwork.ai.api.Embeddings2Api
import com.sdkwork.ai.api.ContextApi
import com.sdkwork.ai.api.Context2Api
import com.sdkwork.ai.api.BatchesApi
import com.sdkwork.ai.api.Batches2Api
import com.sdkwork.ai.api.AudioApi
import com.sdkwork.ai.api.Audio2Api
import com.sdkwork.ai.api.AssistantsApi
import com.sdkwork.ai.api.Assistants2Api
import com.sdkwork.ai.api.ModelsApi
import com.sdkwork.ai.api.Models2Api

class SdkworkAiClient {
    private val httpClient: HttpClient

    lateinit var i18nResource: I18nResourceApi
    lateinit var chat: ChatApi
    lateinit var chat2: Chat2Api
    lateinit var videos: VideosApi
    lateinit var videos2: Videos2Api
    lateinit var threads: ThreadsApi
    lateinit var threads2: Threads2Api
    lateinit var responses: ResponsesApi
    lateinit var responses2: Responses2Api
    lateinit var rerank: RerankApi
    lateinit var rerank2: Rerank2Api
    lateinit var music: MusicApi
    lateinit var music2: Music2Api
    lateinit var moderations: ModerationsApi
    lateinit var moderations2: Moderations2Api
    lateinit var chatCompletions: ChatCompletionsApi
    lateinit var chatCompletions2: ChatCompletions2Api
    lateinit var knowledgeBases: KnowledgeBasesApi
    lateinit var knowledgeBases2: KnowledgeBases2Api
    lateinit var images: ImagesApi
    lateinit var images2: Images2Api
    lateinit var files: FilesApi
    lateinit var files2: Files2Api
    lateinit var embeddings: EmbeddingsApi
    lateinit var embeddings2: Embeddings2Api
    lateinit var context: ContextApi
    lateinit var context2: Context2Api
    lateinit var batches: BatchesApi
    lateinit var batches2: Batches2Api
    lateinit var audio: AudioApi
    lateinit var audio2: Audio2Api
    lateinit var assistants: AssistantsApi
    lateinit var assistants2: Assistants2Api
    lateinit var models: ModelsApi
    lateinit var models2: Models2Api

    constructor(baseUrl: String) {
        this.httpClient = HttpClient(baseUrl)
        i18nResource = I18nResourceApi(httpClient)
        chat = ChatApi(httpClient)
        chat2 = Chat2Api(httpClient)
        videos = VideosApi(httpClient)
        videos2 = Videos2Api(httpClient)
        threads = ThreadsApi(httpClient)
        threads2 = Threads2Api(httpClient)
        responses = ResponsesApi(httpClient)
        responses2 = Responses2Api(httpClient)
        rerank = RerankApi(httpClient)
        rerank2 = Rerank2Api(httpClient)
        music = MusicApi(httpClient)
        music2 = Music2Api(httpClient)
        moderations = ModerationsApi(httpClient)
        moderations2 = Moderations2Api(httpClient)
        chatCompletions = ChatCompletionsApi(httpClient)
        chatCompletions2 = ChatCompletions2Api(httpClient)
        knowledgeBases = KnowledgeBasesApi(httpClient)
        knowledgeBases2 = KnowledgeBases2Api(httpClient)
        images = ImagesApi(httpClient)
        images2 = Images2Api(httpClient)
        files = FilesApi(httpClient)
        files2 = Files2Api(httpClient)
        embeddings = EmbeddingsApi(httpClient)
        embeddings2 = Embeddings2Api(httpClient)
        context = ContextApi(httpClient)
        context2 = Context2Api(httpClient)
        batches = BatchesApi(httpClient)
        batches2 = Batches2Api(httpClient)
        audio = AudioApi(httpClient)
        audio2 = Audio2Api(httpClient)
        assistants = AssistantsApi(httpClient)
        assistants2 = Assistants2Api(httpClient)
        models = ModelsApi(httpClient)
        models2 = Models2Api(httpClient)
    }

    constructor(config: SdkConfig) {
        this.httpClient = HttpClient(config)
        i18nResource = I18nResourceApi(httpClient)
        chat = ChatApi(httpClient)
        chat2 = Chat2Api(httpClient)
        videos = VideosApi(httpClient)
        videos2 = Videos2Api(httpClient)
        threads = ThreadsApi(httpClient)
        threads2 = Threads2Api(httpClient)
        responses = ResponsesApi(httpClient)
        responses2 = Responses2Api(httpClient)
        rerank = RerankApi(httpClient)
        rerank2 = Rerank2Api(httpClient)
        music = MusicApi(httpClient)
        music2 = Music2Api(httpClient)
        moderations = ModerationsApi(httpClient)
        moderations2 = Moderations2Api(httpClient)
        chatCompletions = ChatCompletionsApi(httpClient)
        chatCompletions2 = ChatCompletions2Api(httpClient)
        knowledgeBases = KnowledgeBasesApi(httpClient)
        knowledgeBases2 = KnowledgeBases2Api(httpClient)
        images = ImagesApi(httpClient)
        images2 = Images2Api(httpClient)
        files = FilesApi(httpClient)
        files2 = Files2Api(httpClient)
        embeddings = EmbeddingsApi(httpClient)
        embeddings2 = Embeddings2Api(httpClient)
        context = ContextApi(httpClient)
        context2 = Context2Api(httpClient)
        batches = BatchesApi(httpClient)
        batches2 = Batches2Api(httpClient)
        audio = AudioApi(httpClient)
        audio2 = Audio2Api(httpClient)
        assistants = AssistantsApi(httpClient)
        assistants2 = Assistants2Api(httpClient)
        models = ModelsApi(httpClient)
        models2 = Models2Api(httpClient)
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
