package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class KnowledgeBasesApi(private val client: HttpClient) {

    /** List documents */
    suspend fun listDocuments(knowledgeBaseId: String, params: Map<String, Any>? = null): ListDocumentsResponse? {
        return client.get(ApiPaths.aiPath("/v1/knowledge-bases/$knowledgeBaseId/documents"), params) as? ListDocumentsResponse
    }

    /** Add document */
    suspend fun addDocument(knowledgeBaseId: String, body: DocumentAddRequest): DocumentResponse? {
        return client.post(ApiPaths.aiPath("/v1/knowledge-bases/$knowledgeBaseId/documents"), body) as? DocumentResponse
    }

    /** Search knowledge */
    suspend fun searchKnowledge(body: KnowledgeSearchRequest): KnowledgeSearchResponse? {
        return client.post(ApiPaths.aiPath("/v1/knowledge-bases/search"), body) as? KnowledgeSearchResponse
    }

    /** List knowledge bases */
    suspend fun listKnowledgeBases(params: Map<String, Any>? = null): KnowledgeBaseListResponse? {
        return client.get(ApiPaths.aiPath("/v1/knowledge-bases"), params) as? KnowledgeBaseListResponse
    }

    /** Create knowledge base */
    suspend fun createKnowledgeBase(body: KnowledgeBaseCreateRequest): KnowledgeBaseResponse? {
        return client.post(ApiPaths.aiPath("/v1/knowledge-bases"), body) as? KnowledgeBaseResponse
    }

    /** Get document */
    suspend fun getDocument(knowledgeBaseId: String, documentId: String): DocumentResponse? {
        return client.get(ApiPaths.aiPath("/v1/knowledge-bases/$knowledgeBaseId/documents/$documentId")) as? DocumentResponse
    }

    /** Delete document */
    suspend fun deleteDocument(knowledgeBaseId: String, documentId: String): Unit {
        client.delete(ApiPaths.aiPath("/v1/knowledge-bases/$knowledgeBaseId/documents/$documentId"))
    }

    /** Get knowledge base */
    suspend fun getKnowledgeBase(knowledgeBaseId: String): KnowledgeBaseResponse? {
        return client.get(ApiPaths.aiPath("/v1/knowledge-bases/$knowledgeBaseId")) as? KnowledgeBaseResponse
    }

    /** Delete knowledge base */
    suspend fun deleteKnowledgeBase(knowledgeBaseId: String): Unit {
        client.delete(ApiPaths.aiPath("/v1/knowledge-bases/$knowledgeBaseId"))
    }
}
