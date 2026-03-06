import '../http/client.dart';
import '../models.dart';

class Context2Api {
  final HttpClient _client;
  
  Context2Api(this._client);

  /// Chat with context
  Future<ContextResponse?> chatWith(String contextId, ChatWithContextPostRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/context/${contextId}/chat/completions'), body: body, contentType: 'application/json');
    return response is ContextResponse ? response : null;
  }

  /// Create context
  Future<ContextResponse?> createContext(ContextCreateRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/context/create'), body: body, contentType: 'application/json');
    return response is ContextResponse ? response : null;
  }

  /// Get context
  Future<ContextResponse?> getContext(String contextId) async {
    final response = await _client.get(ApiPaths.aiPath('/v1/context/${contextId}'));
    return response is ContextResponse ? response : null;
  }

  /// Delete context
  Future<void> deleteContext(String contextId) async {
    await _client.delete(ApiPaths.aiPath('/v1/context/${contextId}'));
  }
}
