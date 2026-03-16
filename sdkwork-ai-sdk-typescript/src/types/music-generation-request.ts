/** Music generation request */
export interface MusicGenerationRequest {
  /** 模型ID */
  model: string;
  /** 提示词 */
  prompt: string;
  /** 时长(秒) */
  duration?: number;
  /** 格式: mp3, wav, flac */
  format?: string;
  /** 生成数量 */
  n?: number;
  /** 风格 */
  style?: string;
  /** 元数据 */
  metadata?: Record<string, string>;
  /** 负面提示词 */
  negative_prompt?: string;
  /** 响应格式: url, b64_json */
  response_format?: string;
  /** 参考音频URL */
  reference_audio?: string;
}
