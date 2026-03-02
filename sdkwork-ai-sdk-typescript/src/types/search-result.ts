/** 检索结果 */
export interface SearchResult {
  /** 内容 */
  content?: string;
  /** 相似度分数 */
  score?: number;
  /** 元数据 */
  metadata?: Record<string, unknown>;
  /** 文档ID */
  document_id?: string;
  /** 切片ID */
  chunk_id?: string;
}
