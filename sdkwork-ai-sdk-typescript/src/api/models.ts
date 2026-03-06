import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { OpenAiModel, OpenAiModelDeleteResponse, OpenAiModelList } from '../types';


export class ModelsApi2 {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Retrieve model */
  async retrieveModel(model: string | number): Promise<OpenAiModel> {
    return this.client.get<OpenAiModel>(aiApiPath(`/v1/models/${model}`));
  }

/** Delete model */
  async deleteModel(model: string | number): Promise<OpenAiModelDeleteResponse> {
    return this.client.delete<OpenAiModelDeleteResponse>(aiApiPath(`/v1/models/${model}`));
  }

/** List models */
  async listModels(): Promise<OpenAiModelList> {
    return this.client.get<OpenAiModelList>(aiApiPath(`/v1/models`));
  }
}

export function createModelsApi2(client: HttpClient): ModelsApi2 {
  return new ModelsApi2(client);
}
