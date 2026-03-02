import type { BatchResponse } from './batch-response';

/** OpenAI batch list response */
export interface BatchListResponse {
  /** Object type */
  object?: string;
  /** Batch list */
  data?: BatchResponse[];
  /** Whether more data exists */
  has_more?: boolean;
  /** First item id */
  first_id?: string;
  /** Last item id */
  last_id?: string;
}
