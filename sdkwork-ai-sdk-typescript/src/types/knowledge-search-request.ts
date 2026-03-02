import type { Filter } from './filter';

/** Search request */
export interface KnowledgeSearchRequest {
  /** 查询文本 */
  query: string;
  /** 过滤条件 */
  filters?: Filter[];
  /** 知识库ID */
  knowledge_base_id: string;
  /** 返回结果数量 */
  top_k?: number;
  /** 相似度阈值 */
  score_threshold?: number;
}
