import type { SubmitToolOutputs } from './submit-tool-outputs';

/** 所需操作 */
export interface RequiredAction {
  /** 操作类型 */
  type?: string;
  /** 提交工具输出 */
  submit_tool_outputs?: SubmitToolOutputs;
}
