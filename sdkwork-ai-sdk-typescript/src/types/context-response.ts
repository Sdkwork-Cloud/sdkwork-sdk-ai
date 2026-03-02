import type { TruncationStrategy } from './truncation-strategy';
import type { Usage } from './usage';

/** 上下文缓存响应 */
export interface ContextResponse {
  /** 上下文缓存ID */
  id?: string;
  /** 对象类型 */
  object?: string;
  /** 创建时间(Unix时间戳) */
  created?: number;
  /** 模型ID */
  model?: string;
  /** 缓存类型: session 或 common_prefix */
  mode?: string;
  /** 过期时长(秒) */
  ttl?: number;
  /** 截断策略 */
  truncationStrategy?: TruncationStrategy;
  /** Token用量 */
  usage?: Usage;
}
