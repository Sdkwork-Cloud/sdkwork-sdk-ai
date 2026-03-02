/** 过滤条件 */
export interface Filter {
  /** 字段名 */
  field?: string;
  /** 操作符 */
  op?: string;
  /** 值 */
  value?: unknown;
}
