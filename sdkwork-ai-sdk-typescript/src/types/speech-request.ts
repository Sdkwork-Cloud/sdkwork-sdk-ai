/** Speech request */
export interface SpeechRequest {
  model?: string;
  input?: string;
  voice?: string;
  speed?: number;
  extra?: Record<string, unknown>;
  response_format?: string;
}
