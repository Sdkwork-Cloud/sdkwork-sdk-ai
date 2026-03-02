import type { ToolCall } from './tool-call';

/** 上下文消息 */
export interface ContextMessage {
  /** 角色: system, user, assistant */
  role?: string;
  /** 消息内容 */
  content?: string;
  /** 发送者名称 */
  name?: string;
  /** 工具调用信息 */
  toolCalls?: ToolCall[];
}
