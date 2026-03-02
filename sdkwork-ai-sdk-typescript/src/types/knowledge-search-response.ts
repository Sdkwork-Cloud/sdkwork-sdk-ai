import type { SearchResult } from './search-result';

/** 知识检索响应 */
export interface KnowledgeSearchResponse {
  /** 检索结果列表 */
  results?: SearchResult[];
  /** 总数 */
  total?: number;
}
