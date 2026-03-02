import type { RunStepResponse } from './run-step-response';

/** OpenAI run step list response */
export interface RunStepListResponse {
  /** Object type */
  object?: string;
  /** Run step list */
  data?: RunStepResponse[];
  /** Whether more data exists */
  has_more?: boolean;
  /** First item id */
  first_id?: string;
  /** Last item id */
  last_id?: string;
}
