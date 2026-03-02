import type { ChatMessage } from './chat-message';

/** OpenAI标准聊天消息列表 */
export interface ChatMessageList {
  /** 对象类型 */
  object?: string;
  /** 消息列表 */
  data?: ChatMessage[];
  /** 是否有更多数据 */
  has_more?: boolean;
  /** 第一条记录ID */
  first_id?: string;
  /** 最后一条记录ID */
  last_id?: string;
}
