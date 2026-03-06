import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultListLabelOption } from '../types';


export class I18nResourceApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

async getOptions(params?: QueryParams): Promise<PlusApiResultListLabelOption> {
    return this.client.get<PlusApiResultListLabelOption>(aiApiPath(`/v1/open/i18n/options`), params);
  }

async createOptions(params?: QueryParams): Promise<PlusApiResultListLabelOption> {
    return this.client.post<PlusApiResultListLabelOption>(aiApiPath(`/v1/open/i18n/options`), undefined, params);
  }
}

export function createI18nResourceApi(client: HttpClient): I18nResourceApi {
  return new I18nResourceApi(client);
}
