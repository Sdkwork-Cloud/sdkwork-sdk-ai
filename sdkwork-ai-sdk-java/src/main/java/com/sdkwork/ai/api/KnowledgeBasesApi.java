package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class KnowledgeBasesApi {
    private final HttpClient client;
    
    public KnowledgeBasesApi(HttpClient client) {
        this.client = client;
    }

    /** List documents */
    public ListDocumentsResponse listDocuments(String knowledgeBaseId, Map<String, Object> params) throws Exception {
        return (ListDocumentsResponse) client.get(ApiPaths.aiPath("/knowledge-bases/" + knowledgeBaseId + "/documents"), params);
    }

    /** Add document */
    public DocumentResponse addDocument(String knowledgeBaseId, DocumentAddRequest body) throws Exception {
        return (DocumentResponse) client.post(ApiPaths.aiPath("/knowledge-bases/" + knowledgeBaseId + "/documents"), body);
    }

    /** Search knowledge */
    public KnowledgeSearchResponse searchKnowledge(KnowledgeSearchRequest body) throws Exception {
        return (KnowledgeSearchResponse) client.post(ApiPaths.aiPath("/knowledge-bases/search"), body);
    }

    /** List knowledge bases */
    public KnowledgeBaseListResponse listKnowledgeBases(Map<String, Object> params) throws Exception {
        return (KnowledgeBaseListResponse) client.get(ApiPaths.aiPath("/knowledge-bases"), params);
    }

    /** Create knowledge base */
    public KnowledgeBaseResponse createKnowledgeBase(KnowledgeBaseCreateRequest body) throws Exception {
        return (KnowledgeBaseResponse) client.post(ApiPaths.aiPath("/knowledge-bases"), body);
    }

    /** Get document */
    public DocumentResponse getDocument(String knowledgeBaseId, String documentId) throws Exception {
        return (DocumentResponse) client.get(ApiPaths.aiPath("/knowledge-bases/" + knowledgeBaseId + "/documents/" + documentId + ""));
    }

    /** Delete document */
    public Void deleteDocument(String knowledgeBaseId, String documentId) throws Exception {
        client.delete(ApiPaths.aiPath("/knowledge-bases/" + knowledgeBaseId + "/documents/" + documentId + ""));
        return null;
    }

    /** Get knowledge base */
    public KnowledgeBaseResponse getKnowledgeBase(String knowledgeBaseId) throws Exception {
        return (KnowledgeBaseResponse) client.get(ApiPaths.aiPath("/knowledge-bases/" + knowledgeBaseId + ""));
    }

    /** Delete knowledge base */
    public Void deleteKnowledgeBase(String knowledgeBaseId) throws Exception {
        client.delete(ApiPaths.aiPath("/knowledge-bases/" + knowledgeBaseId + ""));
        return null;
    }
}
