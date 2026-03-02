import type { RunResponse } from './run-response';

/** OpenAI run list response */
export interface RunListResponse {
  /** Object type */
  object?: string;
  /** Run list */
  data?: RunResponse[];
  /** Whether more data exists */
  has_more?: boolean;
  /** First item id */
  first_id?: string;
  /** Last item id */
  last_id?: string;
}
