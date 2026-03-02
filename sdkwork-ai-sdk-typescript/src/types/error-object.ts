/** 错误对象 */
export interface ErrorObject {
  /** 错误代码 */
  code?: string;
  /** 错误消息 */
  message?: string;
  /** 行号 */
  line?: number;
  /** 参数 */
  param?: string;
}
