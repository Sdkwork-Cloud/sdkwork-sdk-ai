/** 助手响应 */
export interface AssistantResponse {
  /** 助手ID */
  id?: string;
  /** 对象类型 */
  object?: string;
  /** 模型ID */
  model?: string;
  /** 助手名称 */
  name?: string;
  /** 助手描述 */
  description?: string;
  /** 系统指令 */
  instructions?: string;
  /** 工具列表 */
  tools?: unknown[];
  /** 元数据 */
  metadata?: Record<string, string>;
  /** 温度参数 */
  temperature?: number;
  /** 创建时间(Unix时间戳) */
  created_at?: number;
  /** 工具资源 */
  tool_resources?: Record<string, unknown>;
  /** 响应格式 */
  response_format?: unknown;
  /** Top P参数 */
  top_p?: number;
}
