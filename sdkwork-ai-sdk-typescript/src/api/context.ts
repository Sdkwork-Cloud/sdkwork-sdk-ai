import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatWithContextRequest, ContextCreateRequest, ContextResponse } from '../types';


export class ContextApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Chat with context */
  async chatWith(contextId: string | number, body: ChatWithContextRequest): Promise<ContextResponse> {
    return this.client.post<ContextResponse>(aiApiPath(`/context/${contextId}/chat/completions`), body);
  }

/** Create context */
  async createContext(body: ContextCreateRequest): Promise<ContextResponse> {
    return this.client.post<ContextResponse>(aiApiPath(`/context/create`), body);
  }

/** Get context */
  async getContext(contextId: string | number): Promise<ContextResponse> {
    return this.client.get<ContextResponse>(aiApiPath(`/context/${contextId}`));
  }

/** Delete context */
  async deleteContext(contextId: string | number): Promise<void> {
    return this.client.delete<void>(aiApiPath(`/context/${contextId}`));
  }
}

export function createContextApi(client: HttpClient): ContextApi {
  return new ContextApi(client);
}
