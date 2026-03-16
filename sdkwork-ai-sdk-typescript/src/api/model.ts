import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { OpenAiModel, OpenAiModelDeleteResponse, OpenAiModelList } from '../types';


export class ModelApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Retrieve model */
  async retrieve(model: string | number): Promise<OpenAiModel> {
    return this.client.get<OpenAiModel>(aiApiPath(`/models/${model}`));
  }

/** Delete model */
  async deleteModel(model: string | number): Promise<OpenAiModelDeleteResponse> {
    return this.client.delete<OpenAiModelDeleteResponse>(aiApiPath(`/models/${model}`));
  }

/** List models */
  async listModels(): Promise<OpenAiModelList> {
    return this.client.get<OpenAiModelList>(aiApiPath(`/models`));
  }
}

export function createModelApi(client: HttpClient): ModelApi {
  return new ModelApi(client);
}
