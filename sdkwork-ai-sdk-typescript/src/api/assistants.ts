import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { AssistantCreateRequest, AssistantDeleteResponse, AssistantListResponse, AssistantResponse } from '../types';


export class AssistantsApi2 {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Get assistant */
  async getAssistant(assistant_id: string | number): Promise<AssistantResponse> {
    return this.client.get<AssistantResponse>(aiApiPath(`/assistants/${assistant_id}`));
  }

/** Update assistant */
  async updateAssistant(assistant_id: string | number, body: AssistantCreateRequest): Promise<AssistantResponse> {
    return this.client.post<AssistantResponse>(aiApiPath(`/assistants/${assistant_id}`), body);
  }

/** Delete assistant */
  async deleteAssistant(assistant_id: string | number): Promise<AssistantDeleteResponse> {
    return this.client.delete<AssistantDeleteResponse>(aiApiPath(`/assistants/${assistant_id}`));
  }

/** List assistants */
  async listAssistants(params?: QueryParams): Promise<AssistantListResponse> {
    return this.client.get<AssistantListResponse>(aiApiPath(`/assistants`), params);
  }

/** Create assistant */
  async createAssistant(body: AssistantCreateRequest): Promise<AssistantResponse> {
    return this.client.post<AssistantResponse>(aiApiPath(`/assistants`), body);
  }
}

export function createAssistantsApi2(client: HttpClient): AssistantsApi2 {
  return new AssistantsApi2(client);
}
