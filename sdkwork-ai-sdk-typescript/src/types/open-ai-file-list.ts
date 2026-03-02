import type { OpenAiFileObject } from './open-ai-file-object';

/** OpenAI标准文件列表对象 */
export interface OpenAiFileList {
  /** 文件列表数据 */
  data?: OpenAiFileObject[];
  /** 对象类型 */
  object?: string;
  /** 第一条记录的ID */
  first_id?: string;
  /** 最后一条记录的ID */
  last_id?: string;
  /** 是否有更多数据 */
  has_more?: boolean;
}
