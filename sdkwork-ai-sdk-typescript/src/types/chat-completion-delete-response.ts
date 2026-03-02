/** OpenAI标准聊天完成删除响应 */
export interface ChatCompletionDeleteResponse {
  /** 聊天完成ID */
  id?: string;
  /** 对象类型 */
  object?: string;
  /** 是否已删除 */
  deleted?: boolean;
}
