import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { SpeechRequest, TranscriptionResponse } from '../types';


export class AudioApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create translation */
  async createTranslation(body?: FormData, params?: QueryParams): Promise<TranscriptionResponse> {
    return this.client.post<TranscriptionResponse>(aiApiPath(`/audio/translations`), body, params);
  }

/** Create transcription */
  async createTranscription(body?: FormData, params?: QueryParams): Promise<TranscriptionResponse> {
    return this.client.post<TranscriptionResponse>(aiApiPath(`/audio/transcriptions`), body, params);
  }

/** Create speech */
  async createSpeech(body: SpeechRequest): Promise<string> {
    return this.client.post<string>(aiApiPath(`/audio/speech`), body);
  }
}

export function createAudioApi(client: HttpClient): AudioApi {
  return new AudioApi(client);
}
