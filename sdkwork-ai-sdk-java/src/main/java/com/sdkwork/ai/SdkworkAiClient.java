package com.sdkwork.ai;

import com.sdkwork.common.core.Types;
import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.api.ChatApi;
import com.sdkwork.ai.api.VideosApi;
import com.sdkwork.ai.api.ThreadsApi;
import com.sdkwork.ai.api.ResponsesApi;
import com.sdkwork.ai.api.RerankApi;
import com.sdkwork.ai.api.MusicApi;
import com.sdkwork.ai.api.ModerationsApi;
import com.sdkwork.ai.api.ChatCompletionsApi;
import com.sdkwork.ai.api.KnowledgeBasesApi;
import com.sdkwork.ai.api.ImagesApi;
import com.sdkwork.ai.api.FilesApi;
import com.sdkwork.ai.api.EmbeddingsApi;
import com.sdkwork.ai.api.ContextApi;
import com.sdkwork.ai.api.BatchesApi;
import com.sdkwork.ai.api.AudioApi;
import com.sdkwork.ai.api.AssistantsApi;
import com.sdkwork.ai.api.ModelsApi;

public class SdkworkAiClient {
    private final HttpClient httpClient;
    private ChatApi chat;
    private VideosApi videos;
    private ThreadsApi threads;
    private ResponsesApi responses;
    private RerankApi rerank;
    private MusicApi music;
    private ModerationsApi moderations;
    private ChatCompletionsApi chatCompletions;
    private KnowledgeBasesApi knowledgeBases;
    private ImagesApi images;
    private FilesApi files;
    private EmbeddingsApi embeddings;
    private ContextApi context;
    private BatchesApi batches;
    private AudioApi audio;
    private AssistantsApi assistants;
    private ModelsApi models;

    public SdkworkAiClient(String baseUrl) {
        this.httpClient = new HttpClient(baseUrl);
        this.chat = new ChatApi(httpClient);
        this.videos = new VideosApi(httpClient);
        this.threads = new ThreadsApi(httpClient);
        this.responses = new ResponsesApi(httpClient);
        this.rerank = new RerankApi(httpClient);
        this.music = new MusicApi(httpClient);
        this.moderations = new ModerationsApi(httpClient);
        this.chatCompletions = new ChatCompletionsApi(httpClient);
        this.knowledgeBases = new KnowledgeBasesApi(httpClient);
        this.images = new ImagesApi(httpClient);
        this.files = new FilesApi(httpClient);
        this.embeddings = new EmbeddingsApi(httpClient);
        this.context = new ContextApi(httpClient);
        this.batches = new BatchesApi(httpClient);
        this.audio = new AudioApi(httpClient);
        this.assistants = new AssistantsApi(httpClient);
        this.models = new ModelsApi(httpClient);
    }

    public SdkworkAiClient(Types.SdkConfig config) {
        this.httpClient = new HttpClient(config);
        this.chat = new ChatApi(httpClient);
        this.videos = new VideosApi(httpClient);
        this.threads = new ThreadsApi(httpClient);
        this.responses = new ResponsesApi(httpClient);
        this.rerank = new RerankApi(httpClient);
        this.music = new MusicApi(httpClient);
        this.moderations = new ModerationsApi(httpClient);
        this.chatCompletions = new ChatCompletionsApi(httpClient);
        this.knowledgeBases = new KnowledgeBasesApi(httpClient);
        this.images = new ImagesApi(httpClient);
        this.files = new FilesApi(httpClient);
        this.embeddings = new EmbeddingsApi(httpClient);
        this.context = new ContextApi(httpClient);
        this.batches = new BatchesApi(httpClient);
        this.audio = new AudioApi(httpClient);
        this.assistants = new AssistantsApi(httpClient);
        this.models = new ModelsApi(httpClient);
    }

    public ChatApi getChat() {
        return this.chat;
    }

    public VideosApi getVideos() {
        return this.videos;
    }

    public ThreadsApi getThreads() {
        return this.threads;
    }

    public ResponsesApi getResponses() {
        return this.responses;
    }

    public RerankApi getRerank() {
        return this.rerank;
    }

    public MusicApi getMusic() {
        return this.music;
    }

    public ModerationsApi getModerations() {
        return this.moderations;
    }

    public ChatCompletionsApi getChatCompletions() {
        return this.chatCompletions;
    }

    public KnowledgeBasesApi getKnowledgeBases() {
        return this.knowledgeBases;
    }

    public ImagesApi getImages() {
        return this.images;
    }

    public FilesApi getFiles() {
        return this.files;
    }

    public EmbeddingsApi getEmbeddings() {
        return this.embeddings;
    }

    public ContextApi getContext() {
        return this.context;
    }

    public BatchesApi getBatches() {
        return this.batches;
    }

    public AudioApi getAudio() {
        return this.audio;
    }

    public AssistantsApi getAssistants() {
        return this.assistants;
    }

    public ModelsApi getModels() {
        return this.models;
    }

    public SdkworkAiClient setApiKey(String apiKey) {
        httpClient.setApiKey(apiKey);
        return this;
    }

    public SdkworkAiClient setAuthToken(String token) {
        httpClient.setAuthToken(token);
        return this;
    }

    public SdkworkAiClient setAccessToken(String token) {
        httpClient.setAccessToken(token);
        return this;
    }

    public SdkworkAiClient setHeader(String key, String value) {
        httpClient.setHeader(key, value);
        return this;
    }

    public HttpClient getHttpClient() {
        return httpClient;
    }
}
