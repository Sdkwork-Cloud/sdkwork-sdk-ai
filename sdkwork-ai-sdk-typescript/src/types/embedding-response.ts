import type { Embedding } from './embedding';
import type { Usage } from './usage';

/** OpenAI标准嵌入响应 */
export interface EmbeddingResponse {
  /** The object type, which is always 'list' */
  object?: string;
  /** The list of embeddings */
  data?: Embedding[];
  /** The model used for generating embeddings */
  model?: string;
  /** Usage statistics for the request */
  usage?: Usage;
}
