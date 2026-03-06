import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { OpenAiVideo, OpenAiVideoDeleteResponse, OpenAiVideoList, VideoGenerationRequest } from '../types';


export class VideosApi2 {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** List videos */
  async listVideos(params?: QueryParams): Promise<OpenAiVideoList> {
    return this.client.get<OpenAiVideoList>(aiApiPath(`/v1/videos`), params);
  }

/** Create video */
  async createVideo(body: VideoGenerationRequest): Promise<OpenAiVideo> {
    return this.client.post<OpenAiVideo>(aiApiPath(`/v1/videos`), body);
  }

/** Retrieve video */
  async retrieveVideo(video_id: string | number): Promise<OpenAiVideo> {
    return this.client.get<OpenAiVideo>(aiApiPath(`/v1/videos/${video_id}`));
  }

/** Delete video */
  async deleteVideo(video_id: string | number): Promise<OpenAiVideoDeleteResponse> {
    return this.client.delete<OpenAiVideoDeleteResponse>(aiApiPath(`/v1/videos/${video_id}`));
  }
}

export function createVideosApi2(client: HttpClient): VideosApi2 {
  return new VideosApi2(client);
}
