import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { CancelResponseResponse, CreateResponsePostRequest, CreateResponsePostResponse, DeleteResponseDeleteResponse, GetResponseGetResponse, ListResponseInputItemsGetResponse } from '../types';


export class ResponseApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Cancel response */
  async cancel(response_id: string | number): Promise<CancelResponseResponse> {
    return this.client.post<CancelResponseResponse>(aiApiPath(`/responses/${response_id}/cancel`));
  }

/** Create response */
  async createResponse(body: CreateResponsePostRequest): Promise<CreateResponsePostResponse> {
    return this.client.post<CreateResponsePostResponse>(aiApiPath(`/responses`), body);
  }

/** List response input items */
  async listResponseInputItems(response_id: string | number): Promise<ListResponseInputItemsGetResponse> {
    return this.client.get<ListResponseInputItemsGetResponse>(aiApiPath(`/responses/${response_id}/input_items`));
  }

/** Get response */
  async getResponse(response_id: string | number): Promise<GetResponseGetResponse> {
    return this.client.get<GetResponseGetResponse>(aiApiPath(`/responses/${response_id}`));
  }

/** Delete response */
  async deleteResponse(response_id: string | number): Promise<DeleteResponseDeleteResponse> {
    return this.client.delete<DeleteResponseDeleteResponse>(aiApiPath(`/responses/${response_id}`));
  }
}

export function createResponseApi(client: HttpClient): ResponseApi {
  return new ResponseApi(client);
}
