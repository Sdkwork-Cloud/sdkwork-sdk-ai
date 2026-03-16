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
  async chatWith(context_id: string | number, body: ChatWithContextRequest): Promise<ContextResponse> {
    return this.client.post<ContextResponse>(aiApiPath(`/context/${context_id}/chat/completions`), body);
  }

/** Create context */
  async createContext(body: ContextCreateRequest): Promise<ContextResponse> {
    return this.client.post<ContextResponse>(aiApiPath(`/context/create`), body);
  }

/** Get context */
  async getContext(context_id: string | number): Promise<ContextResponse> {
    return this.client.get<ContextResponse>(aiApiPath(`/context/${context_id}`));
  }

/** Delete context */
  async deleteContext(context_id: string | number): Promise<void> {
    return this.client.delete<void>(aiApiPath(`/context/${context_id}`));
  }
}

export function createContextApi(client: HttpClient): ContextApi {
  return new ContextApi(client);
}
