import type { Attachment } from './attachment';

/** Thread message request */
export interface ThreadMessageCreateRequest {
  /** Role of the message author */
  role?: string;
  /** Message content, supports string or structured content blocks */
  content?: unknown;
  /** Message attachments */
  attachments?: Attachment[];
  /** Metadata */
  metadata?: Record<string, string>;
}
