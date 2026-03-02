/** Image edit request */
export interface ImageGenerationRequest {
  model?: string;
  prompt?: string;
  n?: number;
  quality?: string;
  size?: string;
  style?: string;
  user?: string;
  image?: string[];
  extra?: Record<string, unknown>;
  response_format?: string;
}
