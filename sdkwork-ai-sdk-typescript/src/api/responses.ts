import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { CancelResponseResponse, CreateResponseRequest, CreateResponseResponse, DeleteResponseResponse, GetResponseResponse, ListResponseInputItemsResponse } from '../types';


export class ResponsesApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Cancel response */
  async cancelResponse(response_id: string | number): Promise<CancelResponseResponse> {
    return this.client.post<CancelResponseResponse>(aiApiPath(`/responses/${response_id}/cancel`));
  }

/** Create response */
  async createResponse(body: CreateResponseRequest): Promise<CreateResponseResponse> {
    return this.client.post<CreateResponseResponse>(aiApiPath(`/responses`), body);
  }

/** List response input items */
  async listResponseInputItems(response_id: string | number): Promise<ListResponseInputItemsResponse> {
    return this.client.get<ListResponseInputItemsResponse>(aiApiPath(`/responses/${response_id}/input_items`));
  }

/** Get response */
  async getResponse(response_id: string | number): Promise<GetResponseResponse> {
    return this.client.get<GetResponseResponse>(aiApiPath(`/responses/${response_id}`));
  }

/** Delete response */
  async deleteResponse(response_id: string | number): Promise<DeleteResponseResponse> {
    return this.client.delete<DeleteResponseResponse>(aiApiPath(`/responses/${response_id}`));
  }
}

export function createResponsesApi(client: HttpClient): ResponsesApi {
  return new ResponsesApi(client);
}
