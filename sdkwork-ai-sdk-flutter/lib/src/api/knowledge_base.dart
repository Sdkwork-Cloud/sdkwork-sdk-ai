import '../http/client.dart';
import '../models.dart';

class KnowledgeBaseApi {
  final HttpClient _client;
  
  KnowledgeBaseApi(this._client);

  /// List documents
  Future<ListDocumentsGetResponse?> listDocuments(String knowledge_base_id, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/knowledge-bases/${knowledge_base_id}/documents'), params: params);
    return response is ListDocumentsGetResponse ? response : null;
  }

  /// Add document
  Future<DocumentResponse?> addDocument(String knowledge_base_id, DocumentAddRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/knowledge-bases/${knowledge_base_id}/documents'), body: body, contentType: 'application/json');
    return response is DocumentResponse ? response : null;
  }

  /// Search knowledge
  Future<KnowledgeSearchResponse?> searchKnowledge(KnowledgeSearchRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/knowledge-bases/search'), body: body, contentType: 'application/json');
    return response is KnowledgeSearchResponse ? response : null;
  }

  /// List knowledge bases
  Future<KnowledgeBaseListResponse?> listKnowledgeBases(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/knowledge-bases'), params: params);
    return response is KnowledgeBaseListResponse ? response : null;
  }

  /// Create knowledge base
  Future<KnowledgeBaseResponse?> createKnowledgeBase(KnowledgeBaseCreateRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/knowledge-bases'), body: body, contentType: 'application/json');
    return response is KnowledgeBaseResponse ? response : null;
  }

  /// Get document
  Future<DocumentResponse?> getDocument(String knowledge_base_id, String document_id) async {
    final response = await _client.get(ApiPaths.aiPath('/knowledge-bases/${knowledge_base_id}/documents/${document_id}'));
    return response is DocumentResponse ? response : null;
  }

  /// Delete document
  Future<void> deleteDocument(String knowledge_base_id, String document_id) async {
    await _client.delete(ApiPaths.aiPath('/knowledge-bases/${knowledge_base_id}/documents/${document_id}'));
  }

  /// Get knowledge base
  Future<KnowledgeBaseResponse?> getKnowledgeBase(String knowledge_base_id) async {
    final response = await _client.get(ApiPaths.aiPath('/knowledge-bases/${knowledge_base_id}'));
    return response is KnowledgeBaseResponse ? response : null;
  }

  /// Delete knowledge base
  Future<void> deleteKnowledgeBase(String knowledge_base_id) async {
    await _client.delete(ApiPaths.aiPath('/knowledge-bases/${knowledge_base_id}'));
  }
}
