package com.sdkwork.ai;

import com.sdkwork.common.core.Types;
import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.api.OpenApi;
import com.sdkwork.ai.api.ChatApi;
import com.sdkwork.ai.api.VideoApi;
import com.sdkwork.ai.api.ThreadApi;
import com.sdkwork.ai.api.ResponseApi;
import com.sdkwork.ai.api.RerankApi;
import com.sdkwork.ai.api.MusicApi;
import com.sdkwork.ai.api.ModerationApi;
import com.sdkwork.ai.api.MessageApi;
import com.sdkwork.ai.api.KnowledgeBaseApi;
import com.sdkwork.ai.api.ImageApi;
import com.sdkwork.ai.api.FileApi;
import com.sdkwork.ai.api.EmbeddingApi;
import com.sdkwork.ai.api.ContextApi;
import com.sdkwork.ai.api.BatchApi;
import com.sdkwork.ai.api.AudioApi;
import com.sdkwork.ai.api.AssistantApi;
import com.sdkwork.ai.api.ModelApi;

public class SdkworkAiClient {
    private final HttpClient httpClient;
    private OpenApi open;
    private ChatApi chat;
    private VideoApi video;
    private ThreadApi thread;
    private ResponseApi response;
    private RerankApi rerank;
    private MusicApi music;
    private ModerationApi moderation;
    private MessageApi message;
    private KnowledgeBaseApi knowledgeBase;
    private ImageApi image;
    private FileApi file;
    private EmbeddingApi embedding;
    private ContextApi context;
    private BatchApi batch;
    private AudioApi audio;
    private AssistantApi assistant;
    private ModelApi model;

    public SdkworkAiClient(String baseUrl) {
        this.httpClient = new HttpClient(baseUrl);
        this.open = new OpenApi(httpClient);
        this.chat = new ChatApi(httpClient);
        this.video = new VideoApi(httpClient);
        this.thread = new ThreadApi(httpClient);
        this.response = new ResponseApi(httpClient);
        this.rerank = new RerankApi(httpClient);
        this.music = new MusicApi(httpClient);
        this.moderation = new ModerationApi(httpClient);
        this.message = new MessageApi(httpClient);
        this.knowledgeBase = new KnowledgeBaseApi(httpClient);
        this.image = new ImageApi(httpClient);
        this.file = new FileApi(httpClient);
        this.embedding = new EmbeddingApi(httpClient);
        this.context = new ContextApi(httpClient);
        this.batch = new BatchApi(httpClient);
        this.audio = new AudioApi(httpClient);
        this.assistant = new AssistantApi(httpClient);
        this.model = new ModelApi(httpClient);
    }

    public SdkworkAiClient(Types.SdkConfig config) {
        this.httpClient = new HttpClient(config);
        this.open = new OpenApi(httpClient);
        this.chat = new ChatApi(httpClient);
        this.video = new VideoApi(httpClient);
        this.thread = new ThreadApi(httpClient);
        this.response = new ResponseApi(httpClient);
        this.rerank = new RerankApi(httpClient);
        this.music = new MusicApi(httpClient);
        this.moderation = new ModerationApi(httpClient);
        this.message = new MessageApi(httpClient);
        this.knowledgeBase = new KnowledgeBaseApi(httpClient);
        this.image = new ImageApi(httpClient);
        this.file = new FileApi(httpClient);
        this.embedding = new EmbeddingApi(httpClient);
        this.context = new ContextApi(httpClient);
        this.batch = new BatchApi(httpClient);
        this.audio = new AudioApi(httpClient);
        this.assistant = new AssistantApi(httpClient);
        this.model = new ModelApi(httpClient);
    }

    public OpenApi getOpen() {
        return this.open;
    }

    public ChatApi getChat() {
        return this.chat;
    }

    public VideoApi getVideo() {
        return this.video;
    }

    public ThreadApi getThread() {
        return this.thread;
    }

    public ResponseApi getResponse() {
        return this.response;
    }

    public RerankApi getRerank() {
        return this.rerank;
    }

    public MusicApi getMusic() {
        return this.music;
    }

    public ModerationApi getModeration() {
        return this.moderation;
    }

    public MessageApi getMessage() {
        return this.message;
    }

    public KnowledgeBaseApi getKnowledgeBase() {
        return this.knowledgeBase;
    }

    public ImageApi getImage() {
        return this.image;
    }

    public FileApi getFile() {
        return this.file;
    }

    public EmbeddingApi getEmbedding() {
        return this.embedding;
    }

    public ContextApi getContext() {
        return this.context;
    }

    public BatchApi getBatch() {
        return this.batch;
    }

    public AudioApi getAudio() {
        return this.audio;
    }

    public AssistantApi getAssistant() {
        return this.assistant;
    }

    public ModelApi getModel() {
        return this.model;
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
