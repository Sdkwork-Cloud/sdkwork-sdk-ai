import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatCompletionDeleteResponse, ChatCompletionList, ChatCompletionResponse, ChatMessageList, UpdateChatCompletionPostRequest } from '../types';


export class ChatCompletionsApi2 {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Get chat completion */
  async getChatCompletion(completionId: string | number): Promise<ChatCompletionResponse> {
    return this.client.get<ChatCompletionResponse>(aiApiPath(`/v1/management/chat/completions/${completionId}`));
  }

/** Update chat completion */
  async updateChatCompletion(completionId: string | number, body: UpdateChatCompletionPostRequest): Promise<ChatCompletionResponse> {
    return this.client.post<ChatCompletionResponse>(aiApiPath(`/v1/management/chat/completions/${completionId}`), body);
  }

/** Delete chat completion */
  async deleteChatCompletion(completionId: string | number): Promise<ChatCompletionDeleteResponse> {
    return this.client.delete<ChatCompletionDeleteResponse>(aiApiPath(`/v1/management/chat/completions/${completionId}`));
  }

/** Get chat messages */
  async getChatMessages(completionId: string | number, params?: QueryParams): Promise<ChatMessageList> {
    return this.client.get<ChatMessageList>(aiApiPath(`/v1/management/chat/completions/${completionId}/messages`), params);
  }

/** List chat completions */
  async listChatCompletions(params?: QueryParams): Promise<ChatCompletionList> {
    return this.client.get<ChatCompletionList>(aiApiPath(`/v1/management/chat/completions`), params);
  }
}

export function createChatCompletionsApi2(client: HttpClient): ChatCompletionsApi2 {
  return new ChatCompletionsApi2(client);
}

export { ChatCompletionsApi2 as ChatCompletionsApi, createChatCompletionsApi2 as createChatCompletionsApi };
