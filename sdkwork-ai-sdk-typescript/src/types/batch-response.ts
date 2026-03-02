import type { Errors } from './errors';
import type { RequestCounts } from './request-counts';

/** 批量任务响应 */
export interface BatchResponse {
  /** 批量任务ID */
  id?: string;
  /** 对象类型 */
  object?: string;
  /** 端点类型 */
  endpoint?: string;
  /** 错误信息 */
  errors?: Errors;
  /** 状态: validating, in_progress, finalizing, completed, expired, cancelling, cancelled, failed */
  status?: string;
  /** 元数据 */
  metadata?: Record<string, string>;
  /** 输入文件ID */
  input_file_id?: string;
  /** 输出文件ID */
  output_file_id?: string;
  /** 错误文件ID */
  error_file_id?: string;
  /** 创建时间 */
  created_at?: number;
  /** 完成窗口 */
  completion_window?: string;
  /** 过期时间 */
  expires_at?: number;
  /** 开始时间 */
  started_at?: number;
  /** 完成时间 */
  completed_at?: number;
  /** 失败时间 */
  failed_at?: number;
  /** 过期时间 */
  expired_at?: number;
  /** 取消时间 */
  cancelled_at?: number;
  /** 请求统计 */
  request_counts?: RequestCounts;
}
