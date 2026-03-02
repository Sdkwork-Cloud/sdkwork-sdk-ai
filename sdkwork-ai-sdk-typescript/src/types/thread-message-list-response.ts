import type { ThreadMessageResponse } from './thread-message-response';

/** OpenAI thread message list response */
export interface ThreadMessageListResponse {
  /** Object type */
  object?: string;
  /** Message list */
  data?: ThreadMessageResponse[];
  /** Whether more data exists */
  has_more?: boolean;
  /** First item id */
  first_id?: string;
  /** Last item id */
  last_id?: string;
}
