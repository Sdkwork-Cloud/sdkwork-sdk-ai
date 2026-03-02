/** Knowledge base creation request */
export interface KnowledgeBaseCreateRequest {
  /** 知识库名称 */
  name: string;
  /** 知识库描述 */
  description?: string;
  /** 额外配置 */
  extra?: Record<string, unknown>;
  /** 嵌入模型ID */
  embedding_model_id?: string;
  /** 索引类型 */
  index_type?: string;
}
