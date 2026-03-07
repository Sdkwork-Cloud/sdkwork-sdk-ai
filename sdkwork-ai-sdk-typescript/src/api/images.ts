import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ImageGenerationRequest, ImageGenerationResponse } from '../types';


export class ImagesApi2 {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create image variation */
  async createImageVariation(body?: FormData, params?: QueryParams): Promise<ImageGenerationResponse> {
    return this.client.post<ImageGenerationResponse>(aiApiPath(`/v1/images/variations`), body, params);
  }

/** Create image */
  async createImage(body: ImageGenerationRequest): Promise<ImageGenerationResponse> {
    return this.client.post<ImageGenerationResponse>(aiApiPath(`/v1/images/generations`), body);
  }

/** Create image edit */
  async createImageEdit(body?: FormData, params?: QueryParams): Promise<ImageGenerationResponse> {
    return this.client.post<ImageGenerationResponse>(aiApiPath(`/v1/images/edits`), body, params);
  }
}

export function createImagesApi2(client: HttpClient): ImagesApi2 {
  return new ImagesApi2(client);
}

export { ImagesApi2 as ImagesApi, createImagesApi2 as createImagesApi };
