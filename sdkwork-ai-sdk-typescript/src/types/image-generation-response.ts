import type { ImageData } from './image-data';

export interface ImageGenerationResponse {
  created?: number;
  data?: ImageData[];
}
