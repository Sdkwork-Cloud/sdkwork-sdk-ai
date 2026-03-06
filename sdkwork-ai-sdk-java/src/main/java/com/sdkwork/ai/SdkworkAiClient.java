package com.sdkwork.ai;

import com.sdkwork.common.core.Types;
import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.api.I18nResourceApi;
import com.sdkwork.ai.api.ChatApi;
import com.sdkwork.ai.api.Chat2Api;
import com.sdkwork.ai.api.VideosApi;
import com.sdkwork.ai.api.Videos2Api;
import com.sdkwork.ai.api.ThreadsApi;
import com.sdkwork.ai.api.Threads2Api;
import com.sdkwork.ai.api.ResponsesApi;
import com.sdkwork.ai.api.Responses2Api;
import com.sdkwork.ai.api.RerankApi;
import com.sdkwork.ai.api.Rerank2Api;
import com.sdkwork.ai.api.MusicApi;
import com.sdkwork.ai.api.Music2Api;
import com.sdkwork.ai.api.ModerationsApi;
import com.sdkwork.ai.api.Moderations2Api;
import com.sdkwork.ai.api.ChatCompletionsApi;
import com.sdkwork.ai.api.ChatCompletions2Api;
import com.sdkwork.ai.api.KnowledgeBasesApi;
import com.sdkwork.ai.api.KnowledgeBases2Api;
import com.sdkwork.ai.api.ImagesApi;
import com.sdkwork.ai.api.Images2Api;
import com.sdkwork.ai.api.FilesApi;
import com.sdkwork.ai.api.Files2Api;
import com.sdkwork.ai.api.EmbeddingsApi;
import com.sdkwork.ai.api.Embeddings2Api;
import com.sdkwork.ai.api.ContextApi;
import com.sdkwork.ai.api.Context2Api;
import com.sdkwork.ai.api.BatchesApi;
import com.sdkwork.ai.api.Batches2Api;
import com.sdkwork.ai.api.AudioApi;
import com.sdkwork.ai.api.Audio2Api;
import com.sdkwork.ai.api.AssistantsApi;
import com.sdkwork.ai.api.Assistants2Api;
import com.sdkwork.ai.api.ModelsApi;
import com.sdkwork.ai.api.Models2Api;

public class SdkworkAiClient {
    private final HttpClient httpClient;
    private I18nResourceApi i18nResource;
    private ChatApi chat;
    private Chat2Api chat2;
    private VideosApi videos;
    private Videos2Api videos2;
    private ThreadsApi threads;
    private Threads2Api threads2;
    private ResponsesApi responses;
    private Responses2Api responses2;
    private RerankApi rerank;
    private Rerank2Api rerank2;
    private MusicApi music;
    private Music2Api music2;
    private ModerationsApi moderations;
    private Moderations2Api moderations2;
    private ChatCompletionsApi chatCompletions;
    private ChatCompletions2Api chatCompletions2;
    private KnowledgeBasesApi knowledgeBases;
    private KnowledgeBases2Api knowledgeBases2;
    private ImagesApi images;
    private Images2Api images2;
    private FilesApi files;
    private Files2Api files2;
    private EmbeddingsApi embeddings;
    private Embeddings2Api embeddings2;
    private ContextApi context;
    private Context2Api context2;
    private BatchesApi batches;
    private Batches2Api batches2;
    private AudioApi audio;
    private Audio2Api audio2;
    private AssistantsApi assistants;
    private Assistants2Api assistants2;
    private ModelsApi models;
    private Models2Api models2;

    public SdkworkAiClient(String baseUrl) {
        this.httpClient = new HttpClient(baseUrl);
        this.i18nResource = new I18nResourceApi(httpClient);
        this.chat = new ChatApi(httpClient);
        this.chat2 = new Chat2Api(httpClient);
        this.videos = new VideosApi(httpClient);
        this.videos2 = new Videos2Api(httpClient);
        this.threads = new ThreadsApi(httpClient);
        this.threads2 = new Threads2Api(httpClient);
        this.responses = new ResponsesApi(httpClient);
        this.responses2 = new Responses2Api(httpClient);
        this.rerank = new RerankApi(httpClient);
        this.rerank2 = new Rerank2Api(httpClient);
        this.music = new MusicApi(httpClient);
        this.music2 = new Music2Api(httpClient);
        this.moderations = new ModerationsApi(httpClient);
        this.moderations2 = new Moderations2Api(httpClient);
        this.chatCompletions = new ChatCompletionsApi(httpClient);
        this.chatCompletions2 = new ChatCompletions2Api(httpClient);
        this.knowledgeBases = new KnowledgeBasesApi(httpClient);
        this.knowledgeBases2 = new KnowledgeBases2Api(httpClient);
        this.images = new ImagesApi(httpClient);
        this.images2 = new Images2Api(httpClient);
        this.files = new FilesApi(httpClient);
        this.files2 = new Files2Api(httpClient);
        this.embeddings = new EmbeddingsApi(httpClient);
        this.embeddings2 = new Embeddings2Api(httpClient);
        this.context = new ContextApi(httpClient);
        this.context2 = new Context2Api(httpClient);
        this.batches = new BatchesApi(httpClient);
        this.batches2 = new Batches2Api(httpClient);
        this.audio = new AudioApi(httpClient);
        this.audio2 = new Audio2Api(httpClient);
        this.assistants = new AssistantsApi(httpClient);
        this.assistants2 = new Assistants2Api(httpClient);
        this.models = new ModelsApi(httpClient);
        this.models2 = new Models2Api(httpClient);
    }

    public SdkworkAiClient(Types.SdkConfig config) {
        this.httpClient = new HttpClient(config);
        this.i18nResource = new I18nResourceApi(httpClient);
        this.chat = new ChatApi(httpClient);
        this.chat2 = new Chat2Api(httpClient);
        this.videos = new VideosApi(httpClient);
        this.videos2 = new Videos2Api(httpClient);
        this.threads = new ThreadsApi(httpClient);
        this.threads2 = new Threads2Api(httpClient);
        this.responses = new ResponsesApi(httpClient);
        this.responses2 = new Responses2Api(httpClient);
        this.rerank = new RerankApi(httpClient);
        this.rerank2 = new Rerank2Api(httpClient);
        this.music = new MusicApi(httpClient);
        this.music2 = new Music2Api(httpClient);
        this.moderations = new ModerationsApi(httpClient);
        this.moderations2 = new Moderations2Api(httpClient);
        this.chatCompletions = new ChatCompletionsApi(httpClient);
        this.chatCompletions2 = new ChatCompletions2Api(httpClient);
        this.knowledgeBases = new KnowledgeBasesApi(httpClient);
        this.knowledgeBases2 = new KnowledgeBases2Api(httpClient);
        this.images = new ImagesApi(httpClient);
        this.images2 = new Images2Api(httpClient);
        this.files = new FilesApi(httpClient);
        this.files2 = new Files2Api(httpClient);
        this.embeddings = new EmbeddingsApi(httpClient);
        this.embeddings2 = new Embeddings2Api(httpClient);
        this.context = new ContextApi(httpClient);
        this.context2 = new Context2Api(httpClient);
        this.batches = new BatchesApi(httpClient);
        this.batches2 = new Batches2Api(httpClient);
        this.audio = new AudioApi(httpClient);
        this.audio2 = new Audio2Api(httpClient);
        this.assistants = new AssistantsApi(httpClient);
        this.assistants2 = new Assistants2Api(httpClient);
        this.models = new ModelsApi(httpClient);
        this.models2 = new Models2Api(httpClient);
    }

    public I18nResourceApi getI18nResource() {
        return this.i18nResource;
    }

    public ChatApi getChat() {
        return this.chat;
    }

    public Chat2Api getChat2() {
        return this.chat2;
    }

    public VideosApi getVideos() {
        return this.videos;
    }

    public Videos2Api getVideos2() {
        return this.videos2;
    }

    public ThreadsApi getThreads() {
        return this.threads;
    }

    public Threads2Api getThreads2() {
        return this.threads2;
    }

    public ResponsesApi getResponses() {
        return this.responses;
    }

    public Responses2Api getResponses2() {
        return this.responses2;
    }

    public RerankApi getRerank() {
        return this.rerank;
    }

    public Rerank2Api getRerank2() {
        return this.rerank2;
    }

    public MusicApi getMusic() {
        return this.music;
    }

    public Music2Api getMusic2() {
        return this.music2;
    }

    public ModerationsApi getModerations() {
        return this.moderations;
    }

    public Moderations2Api getModerations2() {
        return this.moderations2;
    }

    public ChatCompletionsApi getChatCompletions() {
        return this.chatCompletions;
    }

    public ChatCompletions2Api getChatCompletions2() {
        return this.chatCompletions2;
    }

    public KnowledgeBasesApi getKnowledgeBases() {
        return this.knowledgeBases;
    }

    public KnowledgeBases2Api getKnowledgeBases2() {
        return this.knowledgeBases2;
    }

    public ImagesApi getImages() {
        return this.images;
    }

    public Images2Api getImages2() {
        return this.images2;
    }

    public FilesApi getFiles() {
        return this.files;
    }

    public Files2Api getFiles2() {
        return this.files2;
    }

    public EmbeddingsApi getEmbeddings() {
        return this.embeddings;
    }

    public Embeddings2Api getEmbeddings2() {
        return this.embeddings2;
    }

    public ContextApi getContext() {
        return this.context;
    }

    public Context2Api getContext2() {
        return this.context2;
    }

    public BatchesApi getBatches() {
        return this.batches;
    }

    public Batches2Api getBatches2() {
        return this.batches2;
    }

    public AudioApi getAudio() {
        return this.audio;
    }

    public Audio2Api getAudio2() {
        return this.audio2;
    }

    public AssistantsApi getAssistants() {
        return this.assistants;
    }

    public Assistants2Api getAssistants2() {
        return this.assistants2;
    }

    public ModelsApi getModels() {
        return this.models;
    }

    public Models2Api getModels2() {
        return this.models2;
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
