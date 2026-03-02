/** Audio response data */
export interface Audio {
  /** Unique identifier for this audio response */
  id?: string;
  /** Base64 encoded audio bytes */
  data?: string;
  /** Transcript of the audio */
  transcript?: string;
  /** The Unix timestamp (in seconds) for when this audio response was created */
  expires_at?: number;
}
