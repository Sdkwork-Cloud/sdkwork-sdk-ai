/** 截断策略 */
export interface TruncationStrategy {
  /** 策略类型 */
  type?: string;
  /** 最后消息数 */
  last_messages?: number;
}
