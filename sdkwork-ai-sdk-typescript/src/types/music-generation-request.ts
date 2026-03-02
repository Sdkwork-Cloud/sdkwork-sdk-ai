/** Music generation request */
export interface MusicGenerationRequest {
  /** 模型ID */
  model: string;
  /** 提示词 */
  prompt: string;
  /** 负面提示词 */
  negativePrompt?: string;
  /** 时长(秒) */
  duration?: number;
  /** 格式: mp3, wav, flac */
  format?: string;
  /** 生成数量 */
  n?: number;
  /** 参考音频URL */
  referenceAudio?: string;
  /** 风格 */
  style?: string;
  /** 元数据 */
  metadata?: Record<string, string>;
  /** 响应格式: url, b64_json */
  response_format?: string;
}
