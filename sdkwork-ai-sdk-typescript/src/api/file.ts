import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { OpenAiFileDeleteResponse, OpenAiFileList, OpenAiFileObject } from '../types';


export class FileApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** List files */
  async listFiles(params?: QueryParams): Promise<OpenAiFileList> {
    return this.client.get<OpenAiFileList>(aiApiPath(`/files`), params);
  }

/** Upload file */
  async upload(body?: FormData, params?: QueryParams): Promise<OpenAiFileObject> {
    return this.client.post<OpenAiFileObject>(aiApiPath(`/files`), body, params);
  }

/** Retrieve file content */
  async retrieveFileContent(file_id: string | number): Promise<string> {
    return this.client.get<string>(aiApiPath(`/files/${file_id}/content`));
  }

/** Retrieve file */
  async retrieve(file_id: string | number): Promise<OpenAiFileObject> {
    return this.client.get<OpenAiFileObject>(aiApiPath(`/files/${file_id}`));
  }

/** Delete file */
  async deleteFile(file_id: string | number): Promise<OpenAiFileDeleteResponse> {
    return this.client.delete<OpenAiFileDeleteResponse>(aiApiPath(`/files/${file_id}`));
  }
}

export function createFileApi(client: HttpClient): FileApi {
  return new FileApi(client);
}
