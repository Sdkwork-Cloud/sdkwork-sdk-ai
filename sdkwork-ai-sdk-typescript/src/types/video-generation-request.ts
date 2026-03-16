/** Video generation request */
export interface VideoGenerationRequest {
  /** Text prompt that describes the video to generate */
  prompt: string;
  /** The video generation model to use */
  model?: 'sora-2' | 'sora-2-pro';
  /** Clip duration in seconds */
  seconds?: '4' | '8' | '12';
  /** Output resolution formatted as width x height */
  size?: '720x1280' | '1280x720' | '1024x1792' | '1792x1024';
  /** Quality of the generated video */
  quality?: string;
  /** Output width in pixels */
  width?: number;
  /** Output height in pixels */
  height?: number;
  /** Seed for reproducible generation */
  seed?: number;
  /** User identifier */
  user?: string;
  /** Negative prompt for video generation */
  negative_prompt?: string;
  /** Image URLs for video generation */
  image_urls?: string[];
  /** Output aspect ratio */
  aspect_ratio?: string;
  /** Output response format */
  response_format?: string;
}
