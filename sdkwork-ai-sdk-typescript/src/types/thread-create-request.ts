import type { Message } from './message';

/** Thread creation request */
export interface ThreadCreateRequest {
  /** 消息列表 */
  messages?: Message[];
  /** 元数据 */
  metadata?: Record<string, string>;
  /** 工具资源 */
  tool_resources?: Record<string, unknown>;
}
