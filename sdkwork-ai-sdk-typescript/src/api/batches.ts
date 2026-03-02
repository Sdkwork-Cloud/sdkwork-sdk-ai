import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { BatchCreateRequest, BatchListResponse, BatchResponse } from '../types';


export class BatchesApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Cancel batch */
  async cancelBatch(batch_id: string | number): Promise<BatchResponse> {
    return this.client.post<BatchResponse>(aiApiPath(`/batches/${batch_id}/cancel`));
  }

/** List batches */
  async listBatches(params?: QueryParams): Promise<BatchListResponse> {
    return this.client.get<BatchListResponse>(aiApiPath(`/batches`), params);
  }

/** Create batch */
  async createBatch(body: BatchCreateRequest): Promise<BatchResponse> {
    return this.client.post<BatchResponse>(aiApiPath(`/batches`), body);
  }

/** Get batch */
  async getBatch(batch_id: string | number): Promise<BatchResponse> {
    return this.client.get<BatchResponse>(aiApiPath(`/batches/${batch_id}`));
  }
}

export function createBatchesApi(client: HttpClient): BatchesApi {
  return new BatchesApi(client);
}
