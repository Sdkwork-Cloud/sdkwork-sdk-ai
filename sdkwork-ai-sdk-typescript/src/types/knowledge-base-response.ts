/** 知识库响应 */
export interface KnowledgeBaseResponse {
  /** 知识库名称 */
  name?: string;
  /** 知识库描述 */
  description?: string;
  /** 状态 */
  status?: string;
  /** 知识库ID */
  knowledge_base_id?: string;
  /** 嵌入模型ID */
  embedding_model_id?: string;
  /** 索引类型 */
  index_type?: string;
  /** 创建时间 */
  created_at?: number;
  /** 更新时间 */
  updated_at?: number;
  /** 文档数量 */
  doc_count?: number;
}
