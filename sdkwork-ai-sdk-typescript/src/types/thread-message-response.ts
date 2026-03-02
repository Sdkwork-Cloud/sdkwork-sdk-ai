import type { ContentBlock } from './content-block';

/** OpenAI thread message object */
export interface ThreadMessageResponse {
  /** Message id */
  id?: string;
  /** Object type */
  object?: string;
  /** Message role */
  role?: string;
  /** Message status */
  status?: string;
  /** Message content blocks */
  content?: ContentBlock[];
  /** Metadata */
  metadata?: Record<string, string>;
  /** Unix timestamp */
  created_at?: number;
  /** Thread id */
  thread_id?: string;
  /** Incomplete details */
  incomplete_details?: unknown;
  /** Completed timestamp */
  completed_at?: number;
  /** Incomplete timestamp */
  incomplete_at?: number;
  /** Assistant id */
  assistant_id?: string;
  /** Run id */
  run_id?: string;
  /** Attached file ids */
  file_ids?: string[];
}
