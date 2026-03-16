import { HttpClient, createHttpClient } from './http/client';
import type { SdkworkAiConfig } from './types/common';
import type { AuthTokenManager } from '@sdkwork/sdk-common';

import { OpenApi, createOpenApi } from './api/open';
import { ChatApi, createChatApi } from './api/chat';
import { VideoApi, createVideoApi } from './api/video';
import { ThreadApi, createThreadApi } from './api/thread';
import { ResponseApi, createResponseApi } from './api/response';
import { RerankApi, createRerankApi } from './api/rerank';
import { MusicApi, createMusicApi } from './api/music';
import { ModerationApi, createModerationApi } from './api/moderation';
import { MessageApi, createMessageApi } from './api/message';
import { KnowledgeBaseApi, createKnowledgeBaseApi } from './api/knowledge-base';
import { ImageApi, createImageApi } from './api/image';
import { FileApi, createFileApi } from './api/file';
import { EmbeddingApi, createEmbeddingApi } from './api/embedding';
import { ContextApi, createContextApi } from './api/context';
import { BatchApi, createBatchApi } from './api/batch';
import { AudioApi, createAudioApi } from './api/audio';
import { AssistantApi, createAssistantApi } from './api/assistant';
import { ModelApi, createModelApi } from './api/model';

export class SdkworkAiClient {
  private httpClient: HttpClient;

  public readonly open: OpenApi;
  public readonly chat: ChatApi;
  public readonly video: VideoApi;
  public readonly thread: ThreadApi;
  public readonly response: ResponseApi;
  public readonly rerank: RerankApi;
  public readonly music: MusicApi;
  public readonly moderation: ModerationApi;
  public readonly message: MessageApi;
  public readonly knowledgeBase: KnowledgeBaseApi;
  public readonly image: ImageApi;
  public readonly file: FileApi;
  public readonly embedding: EmbeddingApi;
  public readonly context: ContextApi;
  public readonly batch: BatchApi;
  public readonly audio: AudioApi;
  public readonly assistant: AssistantApi;
  public readonly model: ModelApi;

  constructor(config: SdkworkAiConfig) {
    this.httpClient = createHttpClient(config);
    this.open = createOpenApi(this.httpClient);

    this.chat = createChatApi(this.httpClient);

    this.video = createVideoApi(this.httpClient);

    this.thread = createThreadApi(this.httpClient);

    this.response = createResponseApi(this.httpClient);

    this.rerank = createRerankApi(this.httpClient);

    this.music = createMusicApi(this.httpClient);

    this.moderation = createModerationApi(this.httpClient);

    this.message = createMessageApi(this.httpClient);

    this.knowledgeBase = createKnowledgeBaseApi(this.httpClient);

    this.image = createImageApi(this.httpClient);

    this.file = createFileApi(this.httpClient);

    this.embedding = createEmbeddingApi(this.httpClient);

    this.context = createContextApi(this.httpClient);

    this.batch = createBatchApi(this.httpClient);

    this.audio = createAudioApi(this.httpClient);

    this.assistant = createAssistantApi(this.httpClient);

    this.model = createModelApi(this.httpClient);
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
