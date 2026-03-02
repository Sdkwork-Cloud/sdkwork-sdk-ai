import type { AssistantResponse } from './assistant-response';

/** OpenAI assistant list response */
export interface AssistantListResponse {
  /** Object type */
  object?: string;
  /** Assistant list */
  data?: AssistantResponse[];
  /** Whether more data exists */
  has_more?: boolean;
  /** First item id */
  first_id?: string;
  /** Last item id */
  last_id?: string;
}
