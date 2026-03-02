import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { EmbeddingRequest, EmbeddingResponse } from '../types';


export class EmbeddingsApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create embeddings */
  async createEmbedding(body: EmbeddingRequest): Promise<EmbeddingResponse> {
    return this.client.post<EmbeddingResponse>(aiApiPath(`/embeddings`), body);
  }
}

export function createEmbeddingsApi(client: HttpClient): EmbeddingsApi {
  return new EmbeddingsApi(client);
}
