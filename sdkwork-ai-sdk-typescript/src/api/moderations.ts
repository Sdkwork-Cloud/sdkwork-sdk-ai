import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ModerationRequest, ModerationResponse } from '../types';


export class ModerationsApi2 {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create moderation */
  async createModeration(body: ModerationRequest): Promise<ModerationResponse> {
    return this.client.post<ModerationResponse>(aiApiPath(`/moderations`), body);
  }
}

export function createModerationsApi2(client: HttpClient): ModerationsApi2 {
  return new ModerationsApi2(client);
}

export { ModerationsApi2 as ModerationsApi, createModerationsApi2 as createModerationsApi };

