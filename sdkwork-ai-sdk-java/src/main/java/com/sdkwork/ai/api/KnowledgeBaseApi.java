package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class KnowledgeBaseApi {
    private final HttpClient client;
    
    public KnowledgeBaseApi(HttpClient client) {
        this.client = client;
    }

    /** List documents */
    public ListDocumentsGetResponse listDocuments(String knowledge_base_id, Map<String, Object> params) throws Exception {
        return (ListDocumentsGetResponse) client.get(ApiPaths.aiPath("/knowledge-bases/" + knowledge_base_id + "/documents"), params);
    }

    /** Add document */
    public DocumentResponse addDocument(String knowledge_base_id, DocumentAddRequest body) throws Exception {
        return (DocumentResponse) client.post(ApiPaths.aiPath("/knowledge-bases/" + knowledge_base_id + "/documents"), body);
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
    public DocumentResponse getDocument(String knowledge_base_id, String document_id) throws Exception {
        return (DocumentResponse) client.get(ApiPaths.aiPath("/knowledge-bases/" + knowledge_base_id + "/documents/" + document_id + ""));
    }

    /** Delete document */
    public Void deleteDocument(String knowledge_base_id, String document_id) throws Exception {
        client.delete(ApiPaths.aiPath("/knowledge-bases/" + knowledge_base_id + "/documents/" + document_id + ""));
        return null;
    }

    /** Get knowledge base */
    public KnowledgeBaseResponse getKnowledgeBase(String knowledge_base_id) throws Exception {
        return (KnowledgeBaseResponse) client.get(ApiPaths.aiPath("/knowledge-bases/" + knowledge_base_id + ""));
    }

    /** Delete knowledge base */
    public Void deleteKnowledgeBase(String knowledge_base_id) throws Exception {
        client.delete(ApiPaths.aiPath("/knowledge-bases/" + knowledge_base_id + ""));
        return null;
    }
}
