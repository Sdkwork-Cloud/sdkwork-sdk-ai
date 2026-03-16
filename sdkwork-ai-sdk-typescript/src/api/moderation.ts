import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ModerationRequest, ModerationResponse } from '../types';


export class ModerationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create moderation */
  async createModeration(body: ModerationRequest): Promise<ModerationResponse> {
    return this.client.post<ModerationResponse>(aiApiPath(`/moderations`), body);
  }
}

export function createModerationApi(client: HttpClient): ModerationApi {
  return new ModerationApi(client);
}
