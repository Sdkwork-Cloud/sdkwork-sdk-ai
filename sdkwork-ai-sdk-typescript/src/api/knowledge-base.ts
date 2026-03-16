import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { DocumentAddRequest, DocumentResponse, KnowledgeBaseCreateRequest, KnowledgeBaseListResponse, KnowledgeBaseResponse, KnowledgeSearchRequest, KnowledgeSearchResponse, ListDocumentsGetResponse } from '../types';


export class KnowledgeBaseApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** List documents */
  async listDocuments(knowledge_base_id: string | number, params?: QueryParams): Promise<ListDocumentsGetResponse> {
    return this.client.get<ListDocumentsGetResponse>(aiApiPath(`/knowledge-bases/${knowledge_base_id}/documents`), params);
  }

/** Add document */
  async addDocument(knowledge_base_id: string | number, body: DocumentAddRequest): Promise<DocumentResponse> {
    return this.client.post<DocumentResponse>(aiApiPath(`/knowledge-bases/${knowledge_base_id}/documents`), body);
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
  async getDocument(knowledge_base_id: string | number, document_id: string | number): Promise<DocumentResponse> {
    return this.client.get<DocumentResponse>(aiApiPath(`/knowledge-bases/${knowledge_base_id}/documents/${document_id}`));
  }

/** Delete document */
  async deleteDocument(knowledge_base_id: string | number, document_id: string | number): Promise<void> {
    return this.client.delete<void>(aiApiPath(`/knowledge-bases/${knowledge_base_id}/documents/${document_id}`));
  }

/** Get knowledge base */
  async getKnowledgeBase(knowledge_base_id: string | number): Promise<KnowledgeBaseResponse> {
    return this.client.get<KnowledgeBaseResponse>(aiApiPath(`/knowledge-bases/${knowledge_base_id}`));
  }

/** Delete knowledge base */
  async deleteKnowledgeBase(knowledge_base_id: string | number): Promise<void> {
    return this.client.delete<void>(aiApiPath(`/knowledge-bases/${knowledge_base_id}`));
  }
}

export function createKnowledgeBaseApi(client: HttpClient): KnowledgeBaseApi {
  return new KnowledgeBaseApi(client);
}
