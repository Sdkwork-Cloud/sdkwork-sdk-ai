import type { TruncationStrategy } from './truncation-strategy';

/** Run creation request */
export interface RunCreateRequest {
  /** 模型ID */
  model?: string;
  /** 系统指令 */
  instructions?: string;
  /** 工具列表 */
  tools?: unknown[];
  /** 元数据 */
  metadata?: Record<string, string>;
  /** 温度参数 */
  temperature?: number;
  /** 是否流式输出 */
  stream?: boolean;
  /** 助手ID */
  assistant_id: string;
  /** 附加指令 */
  additional_instructions?: string;
  /** 附加消息 */
  additional_messages?: Record<string, unknown>[];
  /** 工具资源 */
  tool_resources?: Record<string, unknown>;
  /** Top P参数 */
  top_p?: number;
  /** 最大完成token数 */
  max_prompt_tokens?: number;
  /** 最大token数 */
  max_completion_tokens?: number;
  /** 截断策略 */
  truncation_strategy?: TruncationStrategy;
}
