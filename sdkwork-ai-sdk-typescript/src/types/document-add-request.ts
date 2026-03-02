import type { ChunkConfig } from './chunk-config';

/** Document add request */
export interface DocumentAddRequest {
  /** 文档内容 */
  content: string;
  /** 文档标题 */
  title?: string;
  /** 文档类型 */
  type?: string;
  /** 文档元数据 */
  metadata?: Record<string, unknown>;
  /** 切片配置 */
  chunkConfig?: ChunkConfig;
  /** 知识库ID */
  knowledge_base_id: string;
}
