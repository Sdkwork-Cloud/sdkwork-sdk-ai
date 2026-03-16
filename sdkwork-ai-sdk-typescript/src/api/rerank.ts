import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { RerankRequest, RerankResponse } from '../types';


export class RerankApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Rerank documents */
  async rerank(body: RerankRequest): Promise<RerankResponse> {
    return this.client.post<RerankResponse>(aiApiPath(`/rerank`), body);
  }
}

export function createRerankApi(client: HttpClient): RerankApi {
  return new RerankApi(client);
}
