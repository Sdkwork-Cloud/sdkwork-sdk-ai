import '../http/client.dart';
import '../models.dart';

class ContextApi {
  final HttpClient _client;
  
  ContextApi(this._client);

  /// Chat with context
  Future<ContextResponse?> chatWith(String context_id, ChatWithContextRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/context/${context_id}/chat/completions'), body: body, contentType: 'application/json');
    return response is ContextResponse ? response : null;
  }

  /// Create context
  Future<ContextResponse?> createContext(ContextCreateRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/context/create'), body: body, contentType: 'application/json');
    return response is ContextResponse ? response : null;
  }

  /// Get context
  Future<ContextResponse?> getContext(String context_id) async {
    final response = await _client.get(ApiPaths.aiPath('/context/${context_id}'));
    return response is ContextResponse ? response : null;
  }

  /// Delete context
  Future<void> deleteContext(String context_id) async {
    await _client.delete(ApiPaths.aiPath('/context/${context_id}'));
  }
}
