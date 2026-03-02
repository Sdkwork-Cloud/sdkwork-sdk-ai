import type { VideoError } from './video-error';

/** OpenAI标准视频对象 */
export interface OpenAiVideo {
  /** Unique identifier for the video job */
  id?: string;
  /** The object type, which is always 'video' */
  object?: string;
  /** The video generation model that produced the job */
  model?: string;
  /** Current lifecycle status of the video job */
  status?: 'queued' | 'processing' | 'completed' | 'failed';
  /** Approximate completion percentage for the generation task */
  progress?: number;
  /** The prompt that was used to generate the video */
  prompt?: string;
  /** Duration of the generated clip in seconds */
  seconds?: '4' | '8' | '12';
  /** The resolution of the generated video */
  size?: '720x1280' | '1280x720' | '1024x1792' | '1792x1024';
  /** Quality of the generated video */
  quality?: string;
  /** Error payload that explains why generation failed, if applicable */
  error?: VideoError;
  /** Unix timestamp (seconds) for when the job was created */
  created_at?: number;
  /** Unix timestamp (seconds) for when the job completed, if finished */
  completed_at?: number;
  /** Unix timestamp (seconds) for when the downloadable assets expire, if set */
  expires_at?: number;
  /** The URL to download the generated video */
  output_url?: string;
  /** Identifier of the source video if this video is a remix */
  remixed_from_video_id?: string;
}
