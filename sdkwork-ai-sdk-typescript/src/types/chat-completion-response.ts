import type { Choice } from './choice';
import type { Usage } from './usage';

/** 聊天完成响应 */
export interface ChatCompletionResponse {
  /** 请求唯一标识 */
  id?: string;
  /** 对象类型 */
  object?: string;
  /** 创建时间（Unix时间戳，秒） */
  created?: number;
  /** 使用的模型名称 */
  model?: string;
  /** 模型输出内容列表 */
  choices?: Choice[];
  /** token用量 */
  usage?: Usage;
  /** 系统指纹 */
  system_fingerprint?: string;
  /** 服务等级 */
  service_tier?: string;
}
