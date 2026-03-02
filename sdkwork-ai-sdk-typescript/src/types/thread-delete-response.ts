/** OpenAI thread delete response */
export interface ThreadDeleteResponse {
  /** Thread id */
  id?: string;
  /** Object type */
  object?: string;
  /** Delete success flag */
  deleted?: boolean;
}
