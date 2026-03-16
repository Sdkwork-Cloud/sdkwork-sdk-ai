import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { CountClaudeTokensPostRequest, CountClaudeTokensPostResponse, CreateClaudeMessageRequest, CreateClaudeMessageResponse } from '../types';


export class MessageApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Count Claude tokens */
  async countClaudeTokens(body: CountClaudeTokensPostRequest): Promise<CountClaudeTokensPostResponse> {
    return this.client.post<CountClaudeTokensPostResponse>(aiApiPath(`/messages/count_tokens`), body);
  }

/** Create Claude message */
  async createClaude(body: CreateClaudeMessageRequest, headers?: Record<string, string>): Promise<CreateClaudeMessageResponse> {
    return this.client.post<CreateClaudeMessageResponse>(aiApiPath(`/messages`), body, undefined, headers);
  }
}

export function createMessageApi(client: HttpClient): MessageApi {
  return new MessageApi(client);
}
