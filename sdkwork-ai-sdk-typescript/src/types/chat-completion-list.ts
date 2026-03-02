import type { ChatCompletionResponse } from './chat-completion-response';

/** OpenAI标准聊天完成列表 */
export interface ChatCompletionList {
  /** 对象类型 */
  object?: string;
  /** 聊天完成列表 */
  data?: ChatCompletionResponse[];
  /** 是否有更多数据 */
  has_more?: boolean;
  /** 第一条记录ID */
  first_id?: string;
  /** 最后一条记录ID */
  last_id?: string;
}
