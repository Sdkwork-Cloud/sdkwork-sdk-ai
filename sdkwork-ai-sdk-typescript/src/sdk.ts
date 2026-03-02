import { HttpClient, createHttpClient } from './http/client';
import type { SdkworkAiConfig } from './types/common';
import type { AuthTokenManager } from '@sdkwork/sdk-common';

import { ChatApi, createChatApi } from './api/chat';
import { VideosApi, createVideosApi } from './api/videos';
import { ThreadsApi, createThreadsApi } from './api/threads';
import { ResponsesApi, createResponsesApi } from './api/responses';
import { RerankApi, createRerankApi } from './api/rerank';
import { MusicApi, createMusicApi } from './api/music';
import { ModerationsApi, createModerationsApi } from './api/moderations';
import { ChatCompletionsApi, createChatCompletionsApi } from './api/chat-completions';
import { KnowledgeBasesApi, createKnowledgeBasesApi } from './api/knowledge-bases';
import { ImagesApi, createImagesApi } from './api/images';
import { FilesApi, createFilesApi } from './api/files';
import { EmbeddingsApi, createEmbeddingsApi } from './api/embeddings';
import { ContextApi, createContextApi } from './api/context';
import { BatchesApi, createBatchesApi } from './api/batches';
import { AudioApi, createAudioApi } from './api/audio';
import { AssistantsApi, createAssistantsApi } from './api/assistants';
import { ModelsApi, createModelsApi } from './api/models';

export class SdkworkAiClient {
  private httpClient: HttpClient;

  public readonly chat: ChatApi;
  public readonly videos: VideosApi;
  public readonly threads: ThreadsApi;
  public readonly responses: ResponsesApi;
  public readonly rerank: RerankApi;
  public readonly music: MusicApi;
  public readonly moderations: ModerationsApi;
  public readonly chatCompletions: ChatCompletionsApi;
  public readonly knowledgeBases: KnowledgeBasesApi;
  public readonly images: ImagesApi;
  public readonly files: FilesApi;
  public readonly embeddings: EmbeddingsApi;
  public readonly context: ContextApi;
  public readonly batches: BatchesApi;
  public readonly audio: AudioApi;
  public readonly assistants: AssistantsApi;
  public readonly models: ModelsApi;

  constructor(config: SdkworkAiConfig) {
    this.httpClient = createHttpClient(config);
    this.chat = createChatApi(this.httpClient);

    this.videos = createVideosApi(this.httpClient);

    this.threads = createThreadsApi(this.httpClient);

    this.responses = createResponsesApi(this.httpClient);

    this.rerank = createRerankApi(this.httpClient);

    this.music = createMusicApi(this.httpClient);

    this.moderations = createModerationsApi(this.httpClient);

    this.chatCompletions = createChatCompletionsApi(this.httpClient);

    this.knowledgeBases = createKnowledgeBasesApi(this.httpClient);

    this.images = createImagesApi(this.httpClient);

    this.files = createFilesApi(this.httpClient);

    this.embeddings = createEmbeddingsApi(this.httpClient);

    this.context = createContextApi(this.httpClient);

    this.batches = createBatchesApi(this.httpClient);

    this.audio = createAudioApi(this.httpClient);

    this.assistants = createAssistantsApi(this.httpClient);

    this.models = createModelsApi(this.httpClient);
  }

  setApiKey(apiKey: string): this {
    this.httpClient.setApiKey(apiKey);
    return this;
  }

  setAuthToken(token: string): this {
    this.httpClient.setAuthToken(token);
    return this;
  }

  setAccessToken(token: string): this {
    this.httpClient.setAccessToken(token);
    return this;
  }

  setTokenManager(manager: AuthTokenManager): this {
    this.httpClient.setTokenManager(manager);
    return this;
  }

  get http(): HttpClient {
    return this.httpClient;
  }
}

export function createClient(config: SdkworkAiConfig): SdkworkAiClient {
  return new SdkworkAiClient(config);
}

export default SdkworkAiClient;
