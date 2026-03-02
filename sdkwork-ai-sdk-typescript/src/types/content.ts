import type { TopLogprob } from './top-logprob';

/** 内容对数概率 */
export interface Content {
  /** token */
  token?: string;
  /** 对数概率 */
  logprob?: number;
  /** UTF-8字节值 */
  bytes?: number[];
  /** 最可能的token列表 */
  top_logprobs?: TopLogprob[];
}
