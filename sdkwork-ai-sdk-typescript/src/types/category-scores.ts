/** Category scores */
export interface CategoryScores {
  /** Score for hate category */
  hate?: number;
  /** Score for sexual category */
  sexual?: number;
  /** Score for violence category */
  violence?: number;
  /** Score for hate/threatening category */
  'hate/threatening'?: number;
  /** Score for self-harm category */
  'self-harm'?: number;
  /** Score for sexual/minors category */
  'sexual/minors'?: number;
  /** Score for violence/graphic category */
  'violence/graphic'?: number;
  /** Score for illegal-act category */
  'illegal-act'?: number;
  /** Score for illegal-act/instruction category */
  'illegal-act/instruction'?: number;
}
