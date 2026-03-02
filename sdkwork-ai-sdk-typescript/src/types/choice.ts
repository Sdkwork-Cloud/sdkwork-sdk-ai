import type { Logprobs } from './logprobs';
import type { Message } from './message';

/** 选择项 */
export interface Choice {
  /** 索引 */
  index?: number;
  /** 消息内容 */
  message?: Message;
  /** 对数概率信息 */
  logprobs?: Logprobs;
  /** 停止生成的原因 */
  finish_reason?: string;
  /** 内容审核命中类型 */
  moderation_hit_type?: string;
}
