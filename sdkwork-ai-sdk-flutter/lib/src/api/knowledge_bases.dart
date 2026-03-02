import '../http/client.dart';
import '../models.dart';

class KnowledgeBasesApi {
  final HttpClient _client;
  
  KnowledgeBasesApi(this._client);

  /// List documents
  Future<ListDocumentsResponse?> listDocuments(String knowledgeBaseId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/knowledge-bases/${knowledgeBaseId}/documents'), params: params);
    return response is ListDocumentsResponse ? response : null;
  }

  /// Add document
  Future<DocumentResponse?> addDocument(String knowledgeBaseId, DocumentAddRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/knowledge-bases/${knowledgeBaseId}/documents'), body: body, contentType: 'application/json');
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
  Future<DocumentResponse?> getDocument(String knowledgeBaseId, String documentId) async {
    final response = await _client.get(ApiPaths.aiPath('/knowledge-bases/${knowledgeBaseId}/documents/${documentId}'));
    return response is DocumentResponse ? response : null;
  }

  /// Delete document
  Future<void> deleteDocument(String knowledgeBaseId, String documentId) async {
    await _client.delete(ApiPaths.aiPath('/knowledge-bases/${knowledgeBaseId}/documents/${documentId}'));
  }

  /// Get knowledge base
  Future<KnowledgeBaseResponse?> getKnowledgeBase(String knowledgeBaseId) async {
    final response = await _client.get(ApiPaths.aiPath('/knowledge-bases/${knowledgeBaseId}'));
    return response is KnowledgeBaseResponse ? response : null;
  }

  /// Delete knowledge base
  Future<void> deleteKnowledgeBase(String knowledgeBaseId) async {
    await _client.delete(ApiPaths.aiPath('/knowledge-bases/${knowledgeBaseId}'));
  }
}
