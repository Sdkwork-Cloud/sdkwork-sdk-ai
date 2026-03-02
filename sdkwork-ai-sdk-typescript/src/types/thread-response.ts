/** 线程响应 */
export interface ThreadResponse {
  /** 线程ID */
  id?: string;
  /** 对象类型 */
  object?: string;
  /** 元数据 */
  metadata?: Record<string, string>;
  /** 创建时间(Unix时间戳) */
  created_at?: number;
  /** 工具资源 */
  tool_resources?: Record<string, unknown>;
}
