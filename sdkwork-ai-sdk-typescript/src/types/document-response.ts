/** 文档响应 */
export interface DocumentResponse {
  /** 文档标题 */
  title?: string;
  /** 文档类型 */
  type?: string;
  /** 文档状态 */
  status?: string;
  /** 文档元数据 */
  metadata?: Record<string, unknown>;
  /** 文档ID */
  document_id?: string;
  /** 知识库ID */
  knowledge_base_id?: string;
  /** 切片数量 */
  chunk_count?: number;
  /** 创建时间 */
  created_at?: number;
  /** 更新时间 */
  updated_at?: number;
}
