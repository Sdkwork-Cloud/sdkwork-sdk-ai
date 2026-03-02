import type { ToolCall } from './tool-call';

/** 消息 */
export interface Message {
  /** 角色 */
  role?: string;
  /** 消息内容 */
  content?: unknown;
  /** 拒绝消息 */
  refusal?: string;
  /** 注解列表 */
  annotations?: unknown[];
  /** 思维链内容 */
  reasoning_content?: string;
  /** 工具调用列表 */
  tool_calls?: ToolCall[];
}
