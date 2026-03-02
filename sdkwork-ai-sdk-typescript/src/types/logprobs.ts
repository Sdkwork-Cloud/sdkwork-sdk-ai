import type { Content } from './content';

/** 对数概率 */
export interface Logprobs {
  /** 内容对数概率列表 */
  content?: Content[];
  /** 拒绝内容对数概率列表 */
  refusal?: Content[];
}
