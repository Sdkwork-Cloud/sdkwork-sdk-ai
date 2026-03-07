import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { SpeechRequest, TranscriptionResponse } from '../types';


export class AudioApi2 {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create translation */
  async createTranslation(body?: FormData, params?: QueryParams): Promise<TranscriptionResponse> {
    return this.client.post<TranscriptionResponse>(aiApiPath(`/v1/audio/translations`), body, params);
  }

/** Create transcription */
  async createTranscription(body?: FormData, params?: QueryParams): Promise<TranscriptionResponse> {
    return this.client.post<TranscriptionResponse>(aiApiPath(`/v1/audio/transcriptions`), body, params);
  }

/** Create speech */
  async createSpeech(body: SpeechRequest): Promise<string> {
    return this.client.post<string>(aiApiPath(`/v1/audio/speech`), body);
  }
}

export function createAudioApi2(client: HttpClient): AudioApi2 {
  return new AudioApi2(client);
}

export { AudioApi2 as AudioApi, createAudioApi2 as createAudioApi };
