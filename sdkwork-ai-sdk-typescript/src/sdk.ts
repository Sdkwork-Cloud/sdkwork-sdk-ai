import { HttpClient, createHttpClient } from './http/client';
import type { SdkworkAiConfig } from './types/common';
import type { AuthTokenManager } from '@sdkwork/sdk-common';

import { I18nResourceApi, createI18nResourceApi } from './api/i-18n-resource-controller';
import { ChatApi, createChatApi } from './api/chat';
import { ChatApi2, createChatApi2 } from './api/chat';
import { VideosApi, createVideosApi } from './api/videos';
import { VideosApi2, createVideosApi2 } from './api/videos';
import { ThreadsApi, createThreadsApi } from './api/threads';
import { ThreadsApi2, createThreadsApi2 } from './api/threads';
import { ResponsesApi, createResponsesApi } from './api/responses';
import { ResponsesApi2, createResponsesApi2 } from './api/responses';
import { RerankApi, createRerankApi } from './api/rerank';
import { RerankApi2, createRerankApi2 } from './api/rerank';
import { MusicApi, createMusicApi } from './api/music';
import { MusicApi2, createMusicApi2 } from './api/music';
import { ModerationsApi, createModerationsApi } from './api/moderations';
import { ModerationsApi2, createModerationsApi2 } from './api/moderations';
import { ChatCompletionsApi, createChatCompletionsApi } from './api/chat-completions';
import { ChatCompletionsApi2, createChatCompletionsApi2 } from './api/chat-completions-management';
import { KnowledgeBasesApi, createKnowledgeBasesApi } from './api/knowledge-bases';
import { KnowledgeBasesApi2, createKnowledgeBasesApi2 } from './api/knowledge-bases';
import { ImagesApi, createImagesApi } from './api/images';
import { ImagesApi2, createImagesApi2 } from './api/images';
import { FilesApi, createFilesApi } from './api/files';
import { FilesApi2, createFilesApi2 } from './api/files';
import { EmbeddingsApi, createEmbeddingsApi } from './api/embeddings';
import { EmbeddingsApi2, createEmbeddingsApi2 } from './api/embeddings';
import { ContextApi, createContextApi } from './api/context';
import { ContextApi2, createContextApi2 } from './api/context';
import { BatchesApi, createBatchesApi } from './api/batches';
import { BatchesApi2, createBatchesApi2 } from './api/batches';
import { AudioApi, createAudioApi } from './api/audio';
import { AudioApi2, createAudioApi2 } from './api/audio';
import { AssistantsApi, createAssistantsApi } from './api/assistants';
import { AssistantsApi2, createAssistantsApi2 } from './api/assistants';
import { ModelsApi, createModelsApi } from './api/models';
import { ModelsApi2, createModelsApi2 } from './api/models';

export class SdkworkAiClient {
  private httpClient: HttpClient;

  public readonly i18nResource: I18nResourceApi;
  public readonly chat: ChatApi;
  public readonly chat2: ChatApi2;
  public readonly videos: VideosApi;
  public readonly videos2: VideosApi2;
  public readonly threads: ThreadsApi;
  public readonly threads2: ThreadsApi2;
  public readonly responses: ResponsesApi;
  public readonly responses2: ResponsesApi2;
  public readonly rerank: RerankApi;
  public readonly rerank2: RerankApi2;
  public readonly music: MusicApi;
  public readonly music2: MusicApi2;
  public readonly moderations: ModerationsApi;
  public readonly moderations2: ModerationsApi2;
  public readonly chatCompletions: ChatCompletionsApi;
  public readonly chatCompletions2: ChatCompletionsApi2;
  public readonly knowledgeBases: KnowledgeBasesApi;
  public readonly knowledgeBases2: KnowledgeBasesApi2;
  public readonly images: ImagesApi;
  public readonly images2: ImagesApi2;
  public readonly files: FilesApi;
  public readonly files2: FilesApi2;
  public readonly embeddings: EmbeddingsApi;
  public readonly embeddings2: EmbeddingsApi2;
  public readonly context: ContextApi;
  public readonly context2: ContextApi2;
  public readonly batches: BatchesApi;
  public readonly batches2: BatchesApi2;
  public readonly audio: AudioApi;
  public readonly audio2: AudioApi2;
  public readonly assistants: AssistantsApi;
  public readonly assistants2: AssistantsApi2;
  public readonly models: ModelsApi;
  public readonly models2: ModelsApi2;

  constructor(config: SdkworkAiConfig) {
    this.httpClient = createHttpClient(config);
    this.i18nResource = createI18nResourceApi(this.httpClient);

    this.chat = createChatApi(this.httpClient);

    this.chat2 = createChatApi2(this.httpClient);

    this.videos = createVideosApi(this.httpClient);

    this.videos2 = createVideosApi2(this.httpClient);

    this.threads = createThreadsApi(this.httpClient);

    this.threads2 = createThreadsApi2(this.httpClient);

    this.responses = createResponsesApi(this.httpClient);

    this.responses2 = createResponsesApi2(this.httpClient);

    this.rerank = createRerankApi(this.httpClient);

    this.rerank2 = createRerankApi2(this.httpClient);

    this.music = createMusicApi(this.httpClient);

    this.music2 = createMusicApi2(this.httpClient);

    this.moderations = createModerationsApi(this.httpClient);

    this.moderations2 = createModerationsApi2(this.httpClient);

    this.chatCompletions = createChatCompletionsApi(this.httpClient);

    this.chatCompletions2 = createChatCompletionsApi2(this.httpClient);

    this.knowledgeBases = createKnowledgeBasesApi(this.httpClient);

    this.knowledgeBases2 = createKnowledgeBasesApi2(this.httpClient);

    this.images = createImagesApi(this.httpClient);

    this.images2 = createImagesApi2(this.httpClient);

    this.files = createFilesApi(this.httpClient);

    this.files2 = createFilesApi2(this.httpClient);

    this.embeddings = createEmbeddingsApi(this.httpClient);

    this.embeddings2 = createEmbeddingsApi2(this.httpClient);

    this.context = createContextApi(this.httpClient);

    this.context2 = createContextApi2(this.httpClient);

    this.batches = createBatchesApi(this.httpClient);

    this.batches2 = createBatchesApi2(this.httpClient);

    this.audio = createAudioApi(this.httpClient);

    this.audio2 = createAudioApi2(this.httpClient);

    this.assistants = createAssistantsApi(this.httpClient);

    this.assistants2 = createAssistantsApi2(this.httpClient);

    this.models = createModelsApi(this.httpClient);

    this.models2 = createModelsApi2(this.httpClient);
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
