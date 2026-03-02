import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatCompletionDeleteResponse, ChatCompletionList, ChatCompletionRequest, ChatCompletionResponse, ChatMessageList, CountClaudeTokensRequest, CountClaudeTokensResponse, CreateChatCompletionResponse, CreateClaudeMessageRequest, CreateClaudeMessageResponse, PatchUpdateCompletionRequest, UpdateCompletionRequest } from '../types';


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
  async updateCompletion(completion_id: string | number, body: UpdateCompletionRequest): Promise<ChatCompletionResponse> {
    return this.client.post<ChatCompletionResponse>(aiApiPath(`/chat/completions/${completion_id}`), body);
  }

/** Delete chat completion */
  async deleteCompletion(completion_id: string | number): Promise<ChatCompletionDeleteResponse> {
    return this.client.delete<ChatCompletionDeleteResponse>(aiApiPath(`/chat/completions/${completion_id}`));
  }

/** Update chat completion */
  async patchUpdateCompletion(completion_id: string | number, body: PatchUpdateCompletionRequest): Promise<ChatCompletionResponse> {
    return this.client.patch<ChatCompletionResponse>(aiApiPath(`/chat/completions/${completion_id}`), body);
  }

/** Count Claude tokens */
  async countClaudeTokens(body: CountClaudeTokensRequest): Promise<CountClaudeTokensResponse> {
    return this.client.post<CountClaudeTokensResponse>(aiApiPath(`/messages/count_tokens`), body);
  }

/** Create Claude message */
  async createClaudeMessage(body: CreateClaudeMessageRequest, headers?: Record<string, string>): Promise<CreateClaudeMessageResponse> {
    return this.client.post<CreateClaudeMessageResponse>(aiApiPath(`/messages`), body, undefined, headers);
  }

/** List chat completions */
  async listCompletions(params?: QueryParams): Promise<ChatCompletionList> {
    return this.client.get<ChatCompletionList>(aiApiPath(`/chat/completions`), params);
  }

/** Create chat completion */
  async createChatCompletion(body: ChatCompletionRequest): Promise<CreateChatCompletionResponse> {
    return this.client.post<CreateChatCompletionResponse>(aiApiPath(`/chat/completions`), body);
  }

/** Get chat completion messages */
  async getMessages(completion_id: string | number, params?: QueryParams): Promise<ChatMessageList> {
    return this.client.get<ChatMessageList>(aiApiPath(`/chat/completions/${completion_id}/messages`), params);
  }
}

export function createChatApi(client: HttpClient): ChatApi {
  return new ChatApi(client);
}
