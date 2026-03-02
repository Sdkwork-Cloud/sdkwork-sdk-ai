import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { OpenAiVideo, OpenAiVideoDeleteResponse, OpenAiVideoList, VideoGenerationRequest } from '../types';


export class VideosApi {
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

/** Retrieve video */
  async retrieveVideo(videoId: string | number): Promise<OpenAiVideo> {
    return this.client.get<OpenAiVideo>(aiApiPath(`/videos/${videoId}`));
  }

/** Delete video */
  async deleteVideo(videoId: string | number): Promise<OpenAiVideoDeleteResponse> {
    return this.client.delete<OpenAiVideoDeleteResponse>(aiApiPath(`/videos/${videoId}`));
  }
}

export function createVideosApi(client: HttpClient): VideosApi {
  return new VideosApi(client);
}
