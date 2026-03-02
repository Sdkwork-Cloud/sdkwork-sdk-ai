/** 最可能的token */
export interface TopLogprob {
  /** token */
  token?: string;
  /** 对数概率 */
  logprob?: number;
  /** UTF-8字节值 */
  bytes?: number[];
}
