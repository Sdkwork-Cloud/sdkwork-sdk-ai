import type { ResponseFormat } from './response-format';
import type { Tool } from './tool';

/** Assistant creation request */
export interface AssistantCreateRequest {
  /** 模型ID */
  model: string;
  /** 助手名称 */
  name?: string;
  /** 助手描述 */
  description?: string;
  /** 系统指令 */
  instructions?: string;
  /** 工具列表 */
  tools?: Tool[];
  /** 元数据 */
  metadata?: Record<string, string>;
  /** 温度参数 */
  temperature?: number;
  /** 工具资源 */
  tool_resources?: Record<string, unknown>;
  /** 响应格式 */
  response_format?: ResponseFormat;
  /** Top P参数 */
  top_p?: number;
}
