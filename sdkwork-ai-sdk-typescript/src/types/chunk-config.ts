/** 切片配置 */
export interface ChunkConfig {
  /** 分隔符 */
  separator?: string;
  /** 切片大小 */
  chunk_size?: number;
  /** 切片重叠大小 */
  chunk_overlap?: number;
}
