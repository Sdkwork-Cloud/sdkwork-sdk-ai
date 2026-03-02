import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatCompletionDeleteResponse, ChatCompletionList, ChatCompletionResponse, ChatMessageList, UpdateChatCompletionRequest } from '../types';


export class ChatCompletionsApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Get chat completion */
  async getChatCompletion(completionId: string | number): Promise<ChatCompletionResponse> {
    return this.client.get<ChatCompletionResponse>(aiApiPath(`/management/chat/completions/${completionId}`));
  }

/** Update chat completion */
  async updateChatCompletion(completionId: string | number, body: UpdateChatCompletionRequest): Promise<ChatCompletionResponse> {
    return this.client.post<ChatCompletionResponse>(aiApiPath(`/management/chat/completions/${completionId}`), body);
  }

/** Delete chat completion */
  async deleteChatCompletion(completionId: string | number): Promise<ChatCompletionDeleteResponse> {
    return this.client.delete<ChatCompletionDeleteResponse>(aiApiPath(`/management/chat/completions/${completionId}`));
  }

/** Get chat messages */
  async getChatMessages(completionId: string | number, params?: QueryParams): Promise<ChatMessageList> {
    return this.client.get<ChatMessageList>(aiApiPath(`/management/chat/completions/${completionId}/messages`), params);
  }

/** List chat completions */
  async listChatCompletions(params?: QueryParams): Promise<ChatCompletionList> {
    return this.client.get<ChatCompletionList>(aiApiPath(`/management/chat/completions`), params);
  }
}

export function createChatCompletionsApi(client: HttpClient): ChatCompletionsApi {
  return new ChatCompletionsApi(client);
}
