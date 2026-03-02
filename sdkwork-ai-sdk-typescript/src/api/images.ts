import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ImageGenerationRequest, ImageGenerationResponse } from '../types';


export class ImagesApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create image variation */
  async createImageVariation(body: ImageGenerationRequest): Promise<ImageGenerationResponse> {
    return this.client.post<ImageGenerationResponse>(aiApiPath(`/images/variations`), body);
  }

/** Create image */
  async createImage(body: ImageGenerationRequest): Promise<ImageGenerationResponse> {
    return this.client.post<ImageGenerationResponse>(aiApiPath(`/images/generations`), body);
  }

/** Create image edit */
  async createImageEdit(body: ImageGenerationRequest): Promise<ImageGenerationResponse> {
    return this.client.post<ImageGenerationResponse>(aiApiPath(`/images/edits`), body);
  }
}

export function createImagesApi(client: HttpClient): ImagesApi {
  return new ImagesApi(client);
}
