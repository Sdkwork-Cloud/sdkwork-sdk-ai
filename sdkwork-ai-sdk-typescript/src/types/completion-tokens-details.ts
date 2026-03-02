/** 输出token详情 */
export interface CompletionTokensDetails {
  /** 思维链token数量 */
  reasoning_tokens?: number;
  /** 音频token数量 */
  audio_tokens?: number;
  /** 接受预测token数量 */
  accepted_prediction_tokens?: number;
  /** 拒绝预测token数量 */
  rejected_prediction_tokens?: number;
}
