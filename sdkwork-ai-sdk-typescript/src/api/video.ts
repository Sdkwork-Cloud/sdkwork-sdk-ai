import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { OpenAiVideo, OpenAiVideoDeleteResponse, OpenAiVideoList, VideoGenerationRequest } from '../types';


export class VideoApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** List videos */
  async listVideos(params?: QueryParams): Promise<OpenAiVideoList> {
    return this.client.get<OpenAiVideoList>(aiApiPath(`/videos`), params);
  }

/** Create video */
  async createVideo(body: VideoGenerationRequest): Promise<OpenAiVideo> {
    return this.client.post<OpenAiVideo>(aiApiPath(`/videos`), body);
  }

/** Create video */
  async createVideoGenerations(body: VideoGenerationRequest): Promise<OpenAiVideo> {
    return this.client.post<OpenAiVideo>(aiApiPath(`/videos/generations`), body);
  }

/** Create video */
  async createVideoGenerations2(body: VideoGenerationRequest): Promise<OpenAiVideo> {
    return this.client.post<OpenAiVideo>(aiApiPath(`/v1/videos/generations`), body);
  }

/** Retrieve video */
  async retrieve(video_id: string | number): Promise<OpenAiVideo> {
    return this.client.get<OpenAiVideo>(aiApiPath(`/videos/${video_id}`));
  }

/** Delete video */
  async deleteVideo(video_id: string | number): Promise<OpenAiVideoDeleteResponse> {
    return this.client.delete<OpenAiVideoDeleteResponse>(aiApiPath(`/videos/${video_id}`));
  }
}

export function createVideoApi(client: HttpClient): VideoApi {
  return new VideoApi(client);
}
