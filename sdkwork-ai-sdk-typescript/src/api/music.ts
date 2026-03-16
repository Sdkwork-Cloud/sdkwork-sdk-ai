import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { MusicGenerationRequest, SunoMusic, SunoMusicDeleteResponse, SunoMusicList } from '../types';


export class MusicApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Generate music */
  async createGenerate(body: MusicGenerationRequest): Promise<SunoMusic> {
    return this.client.post<SunoMusic>(aiApiPath(`/v1/music/generations`), body);
  }

/** List music */
  async listMusic(params?: QueryParams): Promise<SunoMusicList> {
    return this.client.get<SunoMusicList>(aiApiPath(`/music`), params);
  }

/** Generate music */
  async createGenerateMusic(body: MusicGenerationRequest): Promise<SunoMusic> {
    return this.client.post<SunoMusic>(aiApiPath(`/music`), body);
  }

/** Generate music */
  async createGenerateGenerations(body: MusicGenerationRequest): Promise<SunoMusic> {
    return this.client.post<SunoMusic>(aiApiPath(`/music/generations`), body);
  }

/** Retrieve music */
  async retrieve(music_id: string | number): Promise<SunoMusic> {
    return this.client.get<SunoMusic>(aiApiPath(`/music/${music_id}`));
  }

/** Delete music */
  async deleteMusic(music_id: string | number): Promise<SunoMusicDeleteResponse> {
    return this.client.delete<SunoMusicDeleteResponse>(aiApiPath(`/music/${music_id}`));
  }
}

export function createMusicApi(client: HttpClient): MusicApi {
  return new MusicApi(client);
}
