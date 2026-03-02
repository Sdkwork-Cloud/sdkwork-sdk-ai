/** Batch creation request */
export interface BatchCreateRequest {
  /** 端点类型: /v1/chat/completions, /v1/embeddings, /v1/completions */
  endpoint: string;
  /** 元数据 */
  metadata?: Record<string, string>;
  /** 输入文件ID */
  input_file_id: string;
  /** 完成窗口时间(小时) */
  completion_window?: string;
}
