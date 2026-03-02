import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { DocumentAddRequest, DocumentResponse, KnowledgeBaseCreateRequest, KnowledgeBaseListResponse, KnowledgeBaseResponse, KnowledgeSearchRequest, KnowledgeSearchResponse, ListDocumentsResponse } from '../types';


export class KnowledgeBasesApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** List documents */
  async listDocuments(knowledgeBaseId: string | number, params?: QueryParams): Promise<ListDocumentsResponse> {
    return this.client.get<ListDocumentsResponse>(aiApiPath(`/knowledge-bases/${knowledgeBaseId}/documents`), params);
  }

/** Add document */
  async addDocument(knowledgeBaseId: string | number, body: DocumentAddRequest): Promise<DocumentResponse> {
    return this.client.post<DocumentResponse>(aiApiPath(`/knowledge-bases/${knowledgeBaseId}/documents`), body);
  }

/** Search knowledge */
  async searchKnowledge(body: KnowledgeSearchRequest): Promise<KnowledgeSearchResponse> {
    return this.client.post<KnowledgeSearchResponse>(aiApiPath(`/knowledge-bases/search`), body);
  }

/** List knowledge bases */
  async listKnowledgeBases(params?: QueryParams): Promise<KnowledgeBaseListResponse> {
    return this.client.get<KnowledgeBaseListResponse>(aiApiPath(`/knowledge-bases`), params);
  }

/** Create knowledge base */
  async createKnowledgeBase(body: KnowledgeBaseCreateRequest): Promise<KnowledgeBaseResponse> {
    return this.client.post<KnowledgeBaseResponse>(aiApiPath(`/knowledge-bases`), body);
  }

/** Get document */
  async getDocument(knowledgeBaseId: string | number, documentId: string | number): Promise<DocumentResponse> {
    return this.client.get<DocumentResponse>(aiApiPath(`/knowledge-bases/${knowledgeBaseId}/documents/${documentId}`));
  }

/** Delete document */
  async deleteDocument(knowledgeBaseId: string | number, documentId: string | number): Promise<void> {
    return this.client.delete<void>(aiApiPath(`/knowledge-bases/${knowledgeBaseId}/documents/${documentId}`));
  }

/** Get knowledge base */
  async getKnowledgeBase(knowledgeBaseId: string | number): Promise<KnowledgeBaseResponse> {
    return this.client.get<KnowledgeBaseResponse>(aiApiPath(`/knowledge-bases/${knowledgeBaseId}`));
  }

/** Delete knowledge base */
  async deleteKnowledgeBase(knowledgeBaseId: string | number): Promise<void> {
    return this.client.delete<void>(aiApiPath(`/knowledge-bases/${knowledgeBaseId}`));
  }
}

export function createKnowledgeBasesApi(client: HttpClient): KnowledgeBasesApi {
  return new KnowledgeBasesApi(client);
}
