import type { KnowledgeBaseResponse } from './knowledge-base-response';

/** 知识库列表响应 */
export interface KnowledgeBaseListResponse {
  /** 知识库列表 */
  data?: KnowledgeBaseResponse[];
  /** 总数 */
  total?: number;
  /** 是否有更多 */
  has_more?: boolean;
}
