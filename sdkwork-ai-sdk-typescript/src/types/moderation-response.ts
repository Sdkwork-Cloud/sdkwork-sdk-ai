import type { ModerationResult } from './moderation-result';

/** OpenAI标准审核响应 */
export interface ModerationResponse {
  /** The unique identifier for the moderation request */
  id?: string;
  /** The model used to generate the moderation results */
  model?: string;
  /** A list of moderation objects */
  results?: ModerationResult[];
}
