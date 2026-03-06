import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatWithContextPostRequest, ContextCreateRequest, ContextResponse } from '../types';


export class ContextApi2 {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Chat with context */
  async chatWith(contextId: string | number, body: ChatWithContextPostRequest): Promise<ContextResponse> {
    return this.client.post<ContextResponse>(aiApiPath(`/v1/context/${contextId}/chat/completions`), body);
  }

/** Create context */
  async createContext(body: ContextCreateRequest): Promise<ContextResponse> {
    return this.client.post<ContextResponse>(aiApiPath(`/v1/context/create`), body);
  }

/** Get context */
  async getContext(contextId: string | number): Promise<ContextResponse> {
    return this.client.get<ContextResponse>(aiApiPath(`/v1/context/${contextId}`));
  }

/** Delete context */
  async deleteContext(contextId: string | number): Promise<void> {
    return this.client.delete<void>(aiApiPath(`/v1/context/${contextId}`));
  }
}

export function createContextApi2(client: HttpClient): ContextApi2 {
  return new ContextApi2(client);
}
