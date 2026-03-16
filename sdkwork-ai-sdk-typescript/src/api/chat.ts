import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatCompletionDeleteResponse, ChatCompletionList, ChatCompletionRequest, ChatCompletionResponse, ChatMessageList, CreateChatCompletionResponse, PatchUpdateCompletionRequest, UpdateChatCompletionRequest, UpdateCompletionPatchRequest, UpdateCompletionPostRequest } from '../types';


export class ChatApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Get chat completion */
  async getCompletion(completion_id: string | number): Promise<ChatCompletionResponse> {
    return this.client.get<ChatCompletionResponse>(aiApiPath(`/chat/completions/${completion_id}`));
  }

/** Update chat completion */
  async createUpdateCompletion(completion_id: string | number, body: UpdateCompletionPostRequest): Promise<ChatCompletionResponse> {
    return this.client.post<ChatCompletionResponse>(aiApiPath(`/chat/completions/${completion_id}`), body);
  }

/** Delete chat completion */
  async deleteCompletion(completion_id: string | number): Promise<ChatCompletionDeleteResponse> {
    return this.client.delete<ChatCompletionDeleteResponse>(aiApiPath(`/chat/completions/${completion_id}`));
  }

/** Update chat completion */
  async patchUpdateCompletion(completion_id: string | number, body: UpdateCompletionPatchRequest): Promise<ChatCompletionResponse> {
    return this.client.patch<ChatCompletionResponse>(aiApiPath(`/v1/chat/completions/${completion_id}`), body);
  }

/** Update chat completion */
  async patchUpdateCompletionChat(completion_id: string | number, body: PatchUpdateCompletionRequest): Promise<ChatCompletionResponse> {
    return this.client.patch<ChatCompletionResponse>(aiApiPath(`/chat/completions/${completion_id}`), body);
  }

/** Get chat completion */
  async getChatCompletion(completion_id: string | number): Promise<ChatCompletionResponse> {
    return this.client.get<ChatCompletionResponse>(aiApiPath(`/management/chat/completions/${completion_id}`));
  }

/** Update chat completion */
  async updateChatCompletion(completion_id: string | number, body: UpdateChatCompletionRequest): Promise<ChatCompletionResponse> {
    return this.client.post<ChatCompletionResponse>(aiApiPath(`/management/chat/completions/${completion_id}`), body);
  }

/** Delete chat completion */
  async deleteChatCompletion(completion_id: string | number): Promise<ChatCompletionDeleteResponse> {
    return this.client.delete<ChatCompletionDeleteResponse>(aiApiPath(`/management/chat/completions/${completion_id}`));
  }

/** List chat completions */
  async listCompletions(params?: QueryParams): Promise<ChatCompletionList> {
    return this.client.get<ChatCompletionList>(aiApiPath(`/chat/completions`), params);
  }

/** Create chat completion */
  async createChatCompletion(body: ChatCompletionRequest): Promise<CreateChatCompletionResponse> {
    return this.client.post<CreateChatCompletionResponse>(aiApiPath(`/chat/completions`), body);
  }

/** Get chat messages */
  async getChatMessages(completion_id: string | number, params?: QueryParams): Promise<ChatMessageList> {
    return this.client.get<ChatMessageList>(aiApiPath(`/management/chat/completions/${completion_id}/messages`), params);
  }

/** List chat completions */
  async listChatCompletions(params?: QueryParams): Promise<ChatCompletionList> {
    return this.client.get<ChatCompletionList>(aiApiPath(`/management/chat/completions`), params);
  }

/** Get chat completion messages */
  async getMessages(completion_id: string | number, params?: QueryParams): Promise<ChatMessageList> {
    return this.client.get<ChatMessageList>(aiApiPath(`/chat/completions/${completion_id}/messages`), params);
  }
}

export function createChatApi(client: HttpClient): ChatApi {
  return new ChatApi(client);
}
