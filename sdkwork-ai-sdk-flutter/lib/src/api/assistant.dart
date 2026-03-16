import '../http/client.dart';
import '../models.dart';

class AssistantApi {
  final HttpClient _client;
  
  AssistantApi(this._client);

  /// Get assistant
  Future<AssistantResponse?> getAssistant(String assistant_id) async {
    final response = await _client.get(ApiPaths.aiPath('/assistants/${assistant_id}'));
    return response is AssistantResponse ? response : null;
  }

  /// Update assistant
  Future<AssistantResponse?> updateAssistant(String assistant_id, AssistantCreateRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/assistants/${assistant_id}'), body: body, contentType: 'application/json');
    return response is AssistantResponse ? response : null;
  }

  /// Delete assistant
  Future<AssistantDeleteResponse?> deleteAssistant(String assistant_id) async {
    final response = await _client.delete(ApiPaths.aiPath('/assistants/${assistant_id}'));
    return response is AssistantDeleteResponse ? response : null;
  }

  /// List assistants
  Future<AssistantListResponse?> listAssistants(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/assistants'), params: params);
    return response is AssistantListResponse ? response : null;
  }

  /// Create assistant
  Future<AssistantResponse?> createAssistant(AssistantCreateRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/assistants'), body: body, contentType: 'application/json');
    return response is AssistantResponse ? response : null;
  }
}
