import type { CompletionTokensDetails } from './completion-tokens-details';
import type { PromptTokensDetails } from './prompt-tokens-details';

/** token用量 */
export interface Usage {
  /** 输入token数量 */
  prompt_tokens?: number;
  /** 输出token数量 */
  completion_tokens?: number;
  /** 总token数量 */
  total_tokens?: number;
  /** 输入token详情 */
  prompt_tokens_details?: PromptTokensDetails;
  /** 输出token详情 */
  completion_tokens_details?: CompletionTokensDetails;
}
