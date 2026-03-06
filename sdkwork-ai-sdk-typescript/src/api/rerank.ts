import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { RerankRequest, RerankResponse } from '../types';


export class RerankApi2 {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Rerank documents */
  async rerank(body: RerankRequest): Promise<RerankResponse> {
    return this.client.post<RerankResponse>(aiApiPath(`/v1/rerank`), body);
  }
}

export function createRerankApi2(client: HttpClient): RerankApi2 {
  return new RerankApi2(client);
}
