import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { OpenAiFileDeleteResponse, OpenAiFileList, OpenAiFileObject } from '../types';


export class FilesApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** List files */
  async listFiles(params?: QueryParams): Promise<OpenAiFileList> {
    return this.client.get<OpenAiFileList>(aiApiPath(`/files`), params);
  }

/** Upload file */
  async uploadFile(body?: FormData, params?: QueryParams): Promise<OpenAiFileObject> {
    return this.client.post<OpenAiFileObject>(aiApiPath(`/files`), body, params);
  }

/** Retrieve file content */
  async retrieveFileContent(fileId: string | number): Promise<string> {
    return this.client.get<string>(aiApiPath(`/files/${fileId}/content`));
  }

/** Retrieve file */
  async retrieveFile(fileId: string | number): Promise<OpenAiFileObject> {
    return this.client.get<OpenAiFileObject>(aiApiPath(`/files/${fileId}`));
  }

/** Delete file */
  async deleteFile(fileId: string | number): Promise<OpenAiFileDeleteResponse> {
    return this.client.delete<OpenAiFileDeleteResponse>(aiApiPath(`/files/${fileId}`));
  }
}

export function createFilesApi(client: HttpClient): FilesApi {
  return new FilesApi(client);
}
