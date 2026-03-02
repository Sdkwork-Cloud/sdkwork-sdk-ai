import type { LastError } from './last-error';
import type { RequiredAction } from './required-action';
import type { Usage } from './usage';

/** 运行响应 */
export interface RunResponse {
  /** 运行ID */
  id?: string;
  /** 对象类型 */
  object?: string;
  /** 状态: queued, in_progress, requires_action, cancelling, cancelled, failed, completed, expired */
  status?: string;
  /** 模型ID */
  model?: string;
  /** 指令 */
  instructions?: string;
  /** 工具列表 */
  tools?: unknown[];
  /** 元数据 */
  metadata?: Record<string, string>;
  /** Token用量 */
  usage?: Usage;
  /** 温度参数 */
  temperature?: number;
  /** 创建时间(Unix时间戳) */
  created_at?: number;
  /** 线程ID */
  thread_id?: string;
  /** 助手ID */
  assistant_id?: string;
  /** 所需操作 */
  required_action?: RequiredAction;
  /** 最后错误 */
  last_error?: LastError;
  /** 过期时间 */
  expires_at?: number;
  /** 开始时间 */
  started_at?: number;
  /** 取消时间 */
  cancelled_at?: number;
  /** 失败时间 */
  failed_at?: number;
  /** 完成时间 */
  completed_at?: number;
  /** 工具资源 */
  tool_resources?: Record<string, unknown>;
  /** Top P参数 */
  top_p?: number;
  /** 最大完成token数 */
  max_prompt_tokens?: number;
  /** 最大token数 */
  max_completion_tokens?: number;
  /** 截断策略 */
  truncation_strategy?: unknown;
}
