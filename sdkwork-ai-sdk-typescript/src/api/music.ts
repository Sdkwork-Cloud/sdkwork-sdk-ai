import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { MusicGenerationRequest, SunoMusic, SunoMusicDeleteResponse, SunoMusicList } from '../types';


export class MusicApi2 {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Generate music */
  async generate(body: MusicGenerationRequest): Promise<SunoMusic> {
    return this.client.post<SunoMusic>(aiApiPath(`/music/generations`), body);
  }

/** Retrieve music */
  async retrieve(musicId: string | number): Promise<SunoMusic> {
    return this.client.get<SunoMusic>(aiApiPath(`/music/${musicId}`));
  }

/** Delete music */
  async deleteMusic(musicId: string | number): Promise<SunoMusicDeleteResponse> {
    return this.client.delete<SunoMusicDeleteResponse>(aiApiPath(`/music/${musicId}`));
  }

/** List music */
  async listMusic(params?: QueryParams): Promise<SunoMusicList> {
    return this.client.get<SunoMusicList>(aiApiPath(`/music`), params);
  }
}

export function createMusicApi2(client: HttpClient): MusicApi2 {
  return new MusicApi2(client);
}

export { MusicApi2 as MusicApi, createMusicApi2 as createMusicApi };

