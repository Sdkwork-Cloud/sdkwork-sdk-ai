package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class KnowledgeBaseApi(private val client: HttpClient) {

    /** List documents */
    suspend fun listDocuments(knowledge_base_id: String, params: Map<String, Any>? = null): ListDocumentsGetResponse? {
        return client.get(ApiPaths.aiPath("/knowledge-bases/$knowledge_base_id/documents"), params) as? ListDocumentsGetResponse
    }

    /** Add document */
    suspend fun addDocument(knowledge_base_id: String, body: DocumentAddRequest): DocumentResponse? {
        return client.post(ApiPaths.aiPath("/knowledge-bases/$knowledge_base_id/documents"), body) as? DocumentResponse
    }

    /** Search knowledge */
    suspend fun searchKnowledge(body: KnowledgeSearchRequest): KnowledgeSearchResponse? {
        return client.post(ApiPaths.aiPath("/knowledge-bases/search"), body) as? KnowledgeSearchResponse
    }

    /** List knowledge bases */
    suspend fun listKnowledgeBases(params: Map<String, Any>? = null): KnowledgeBaseListResponse? {
        return client.get(ApiPaths.aiPath("/knowledge-bases"), params) as? KnowledgeBaseListResponse
    }

    /** Create knowledge base */
    suspend fun createKnowledgeBase(body: KnowledgeBaseCreateRequest): KnowledgeBaseResponse? {
        return client.post(ApiPaths.aiPath("/knowledge-bases"), body) as? KnowledgeBaseResponse
    }

    /** Get document */
    suspend fun getDocument(knowledge_base_id: String, document_id: String): DocumentResponse? {
        return client.get(ApiPaths.aiPath("/knowledge-bases/$knowledge_base_id/documents/$document_id")) as? DocumentResponse
    }

    /** Delete document */
    suspend fun deleteDocument(knowledge_base_id: String, document_id: String): Unit {
        client.delete(ApiPaths.aiPath("/knowledge-bases/$knowledge_base_id/documents/$document_id"))
    }

    /** Get knowledge base */
    suspend fun getKnowledgeBase(knowledge_base_id: String): KnowledgeBaseResponse? {
        return client.get(ApiPaths.aiPath("/knowledge-bases/$knowledge_base_id")) as? KnowledgeBaseResponse
    }

    /** Delete knowledge base */
    suspend fun deleteKnowledgeBase(knowledge_base_id: String): Unit {
        client.delete(ApiPaths.aiPath("/knowledge-bases/$knowledge_base_id"))
    }
}
