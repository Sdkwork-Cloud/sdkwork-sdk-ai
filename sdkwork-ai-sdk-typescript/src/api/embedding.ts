import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { EmbeddingRequest, EmbeddingResponse } from '../types';


export class EmbeddingApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create embeddings */
  async createEmbedding(body: EmbeddingRequest): Promise<EmbeddingResponse> {
    return this.client.post<EmbeddingResponse>(aiApiPath(`/embeddings`), body);
  }
}

export function createEmbeddingApi(client: HttpClient): EmbeddingApi {
  return new EmbeddingApi(client);
}
