import type { Result } from './result';
import type { Usage } from './usage';

/** 重排响应 */
export interface RerankResponse {
  /** 请求ID */
  id?: string;
  /** 对象类型 */
  object?: string;
  /** 使用的模型 */
  model?: string;
  /** 重排结果列表 */
  results?: Result[];
  /** token用量 */
  usage?: Usage;
}
