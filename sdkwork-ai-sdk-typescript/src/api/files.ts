import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { OpenAiFileDeleteResponse, OpenAiFileList, OpenAiFileObject } from '../types';


export class FilesApi2 {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** List files */
  async listFiles(params?: QueryParams): Promise<OpenAiFileList> {
    return this.client.get<OpenAiFileList>(aiApiPath(`/v1/files`), params);
  }

/** Upload file */
  async uploadFile(body?: FormData, params?: QueryParams): Promise<OpenAiFileObject> {
    return this.client.post<OpenAiFileObject>(aiApiPath(`/v1/files`), body, params);
  }

/** Retrieve file content */
  async retrieveFileContent(fileId: string | number): Promise<string> {
    return this.client.get<string>(aiApiPath(`/v1/files/${fileId}/content`));
  }

/** Retrieve file */
  async retrieveFile(fileId: string | number): Promise<OpenAiFileObject> {
    return this.client.get<OpenAiFileObject>(aiApiPath(`/v1/files/${fileId}`));
  }

/** Delete file */
  async deleteFile(fileId: string | number): Promise<OpenAiFileDeleteResponse> {
    return this.client.delete<OpenAiFileDeleteResponse>(aiApiPath(`/v1/files/${fileId}`));
  }
}

export function createFilesApi2(client: HttpClient): FilesApi2 {
  return new FilesApi2(client);
}

export { FilesApi2 as FilesApi, createFilesApi2 as createFilesApi };
