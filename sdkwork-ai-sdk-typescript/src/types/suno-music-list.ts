import type { SunoMusic } from './suno-music';

/** Suno音乐列表对象 */
export interface SunoMusicList {
  /** 对象类型 */
  object?: string;
  /** 音乐列表 */
  data?: SunoMusic[];
}
