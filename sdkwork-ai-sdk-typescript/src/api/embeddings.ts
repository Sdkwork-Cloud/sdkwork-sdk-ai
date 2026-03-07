import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { EmbeddingRequest, EmbeddingResponse } from '../types';


export class EmbeddingsApi2 {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create embeddings */
  async createEmbedding(body: EmbeddingRequest): Promise<EmbeddingResponse> {
    return this.client.post<EmbeddingResponse>(aiApiPath(`/embeddings`), body);
  }
}

export function createEmbeddingsApi2(client: HttpClient): EmbeddingsApi2 {
  return new EmbeddingsApi2(client);
}

export { EmbeddingsApi2 as EmbeddingsApi, createEmbeddingsApi2 as createEmbeddingsApi };
