import type { ContextMessage } from './context-message';
import type { TruncationStrategy } from './truncation-strategy';

/** Context creation request */
export interface ContextCreateRequest {
  /** 模型ID或接入点ID */
  model: string;
  /** 消息列表 */
  messages: ContextMessage[];
  /** 缓存类型: session 或 common_prefix */
  mode?: string;
  /** 过期时长(秒)，范围[3600, 604800] */
  ttl?: number;
  /** 截断策略配置 */
  truncationStrategy?: TruncationStrategy;
}
