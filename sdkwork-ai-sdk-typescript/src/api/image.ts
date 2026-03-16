import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ImageGenerationRequest, ImageGenerationResponse } from '../types';


export class ImageApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create image variation */
  async createImageVariation(body?: FormData, params?: QueryParams): Promise<ImageGenerationResponse> {
    return this.client.post<ImageGenerationResponse>(aiApiPath(`/images/variations`), body, params);
  }

/** Create image */
  async createImage(body: ImageGenerationRequest): Promise<ImageGenerationResponse> {
    return this.client.post<ImageGenerationResponse>(aiApiPath(`/images`), body);
  }

/** Create image */
  async createImageGenerations(body: ImageGenerationRequest): Promise<ImageGenerationResponse> {
    return this.client.post<ImageGenerationResponse>(aiApiPath(`/images/generations`), body);
  }

/** Create image edit */
  async createImageEdit(body?: FormData, params?: QueryParams): Promise<ImageGenerationResponse> {
    return this.client.post<ImageGenerationResponse>(aiApiPath(`/images/edits`), body, params);
  }
}

export function createImageApi(client: HttpClient): ImageApi {
  return new ImageApi(client);
}
