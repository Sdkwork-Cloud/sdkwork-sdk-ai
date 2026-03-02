/** 重排结果 */
export interface Result {
  /** 文档索引 */
  index?: number;
  /** 相关性分数 */
  score?: number;
  /** 文档内容 */
  document?: string;
}
