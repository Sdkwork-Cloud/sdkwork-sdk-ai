import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { CancelResponsePostResponse, CreateResponseRequest, CreateResponseResponse, DeleteResponseResponse, GetResponseResponse, ListResponseInputItemsResponse } from '../types';


export class ResponsesApi2 {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Cancel response */
  async cancelResponse(response_id: string | number): Promise<CancelResponsePostResponse> {
    return this.client.post<CancelResponsePostResponse>(aiApiPath(`/v1/responses/${response_id}/cancel`));
  }

/** Create response */
  async createResponse(body: CreateResponseRequest): Promise<CreateResponseResponse> {
    return this.client.post<CreateResponseResponse>(aiApiPath(`/v1/responses`), body);
  }

/** List response input items */
  async listResponseInputItems(response_id: string | number): Promise<ListResponseInputItemsResponse> {
    return this.client.get<ListResponseInputItemsResponse>(aiApiPath(`/v1/responses/${response_id}/input_items`));
  }

/** Get response */
  async getResponse(response_id: string | number): Promise<GetResponseResponse> {
    return this.client.get<GetResponseResponse>(aiApiPath(`/v1/responses/${response_id}`));
  }

/** Delete response */
  async deleteResponse(response_id: string | number): Promise<DeleteResponseResponse> {
    return this.client.delete<DeleteResponseResponse>(aiApiPath(`/v1/responses/${response_id}`));
  }
}

export function createResponsesApi2(client: HttpClient): ResponsesApi2 {
  return new ResponsesApi2(client);
}
