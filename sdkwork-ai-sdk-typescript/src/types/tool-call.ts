import type { FunctionCall } from './function-call';

/** 工具调用 */
export interface ToolCall {
  /** 工具调用ID */
  id?: string;
  /** 工具类型 */
  type?: string;
  /** 函数调用 */
  function?: FunctionCall;
}
