import type { MusicError } from './music-error';

/** Suno音乐对象 */
export interface SunoMusic {
  /** 音乐ID */
  id?: string;
  /** 对象类型 */
  object?: string;
  /** 音乐标题 */
  title?: string;
  /** 音乐状态 */
  status?: 'queued' | 'processing' | 'completed' | 'failed';
  /** 音乐时长（秒） */
  duration?: number;
  /** 音乐风格标签 */
  tags?: string[];
  /** 音乐流派 */
  genre?: string;
  /** 音频文件URL */
  audioUrl?: string;
  /** 歌词 */
  lyrics?: string;
  /** 是否纯音乐 */
  instrumental?: boolean;
  /** 错误信息（如果生成失败） */
  error?: MusicError;
  /** 创建时间（Unix时间戳，秒） */
  created_at?: number;
  /** 完成时间（Unix时间戳，秒） */
  completed_at?: number;
}
