/** Embedding object */
export interface Embedding {
  /** The object type, which is always 'embedding' */
  object?: string;
  /** The embedding vector */
  embedding?: number[];
  /** The index of the embedding in the list of embeddings */
  index?: number;
}
