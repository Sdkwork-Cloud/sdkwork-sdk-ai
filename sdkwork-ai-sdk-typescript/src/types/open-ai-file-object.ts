/** OpenAI标准文件对象 */
export interface OpenAiFileObject {
  /** 文件ID */
  id?: string;
  /** 对象类型 */
  object?: string;
  /** 文件大小（字节） */
  bytes?: number;
  /** 文件名 */
  filename?: string;
  /** 文件用途 */
  purpose?: 'assistants' | 'assistants_output' | 'batch' | 'batch_output' | 'fine-tune' | 'fine-tune-results' | 'vision' | 'user_data' | 'evals';
  /** 文件状态 */
  status?: 'uploaded' | 'processed' | 'error';
  /** 是否已删除 */
  deleted?: boolean;
  /** 创建时间（Unix时间戳，秒） */
  created_at?: number;
  /** 过期时间（Unix时间戳，秒） */
  expires_at?: number;
  /** 状态详情 */
  status_details?: string;
}
