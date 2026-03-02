import type { ToolCall } from './tool-call';

/** 提交工具输出 */
export interface SubmitToolOutputs {
  /** 工具调用列表 */
  tool_calls?: ToolCall[];
}
