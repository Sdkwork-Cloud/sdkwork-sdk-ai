/** Embedding request */
export interface EmbeddingRequest {
  model?: string;
  input?: unknown;
  dimensions?: number;
  user?: string;
  encoding_format?: string;
}
