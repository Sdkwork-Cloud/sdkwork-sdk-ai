import type { Document } from './document';

/** Rerank request */
export interface RerankRequest {
  /** 查询文本 */
  query: string;
  /** 待重排的文档列表 */
  documents: Document[];
  /** 模型ID */
  model?: string;
  /** 返回文档数量 */
  top_n?: number;
  /** 是否返回原始文档 */
  return_documents?: boolean;
}
