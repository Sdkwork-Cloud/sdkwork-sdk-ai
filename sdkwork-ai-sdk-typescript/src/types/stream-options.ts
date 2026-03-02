/** 流式响应选项 */
export interface StreamOptions {
  /** 是否在输出结束前返回token用量 */
  include_usage?: boolean;
  /** 是否在每个chunk中返回累计token用量 */
  chunk_include_usage?: boolean;
}
