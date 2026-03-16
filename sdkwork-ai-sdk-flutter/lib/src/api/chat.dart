import '../http/client.dart';
import '../models.dart';

class ChatApi {
  final HttpClient _client;
  
  ChatApi(this._client);

  /// Get chat completion
  Future<ChatCompletionResponse?> getCompletion(String completion_id) async {
    final response = await _client.get(ApiPaths.aiPath('/chat/completions/${completion_id}'));
    return response is ChatCompletionResponse ? response : null;
  }

  /// Update chat completion
  Future<ChatCompletionResponse?> createUpdateCompletion(String completion_id, UpdateCompletionPostRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/chat/completions/${completion_id}'), body: body, contentType: 'application/json');
    return response is ChatCompletionResponse ? response : null;
  }

  /// Delete chat completion
  Future<ChatCompletionDeleteResponse?> deleteCompletion(String completion_id) async {
    final response = await _client.delete(ApiPaths.aiPath('/chat/completions/${completion_id}'));
    return response is ChatCompletionDeleteResponse ? response : null;
  }

  /// Update chat completion
  Future<ChatCompletionResponse?> patchUpdateCompletion(String completion_id, UpdateCompletionPatchRequest body) async {
    final response = await _client.patch(ApiPaths.aiPath('/v1/chat/completions/${completion_id}'), body: body, contentType: 'application/json');
    return response is ChatCompletionResponse ? response : null;
  }

  /// Update chat completion
  Future<ChatCompletionResponse?> patchUpdateCompletionChat(String completion_id, PatchUpdateCompletionRequest body) async {
    final response = await _client.patch(ApiPaths.aiPath('/chat/completions/${completion_id}'), body: body, contentType: 'application/json');
    return response is ChatCompletionResponse ? response : null;
  }

  /// Get chat completion
  Future<ChatCompletionResponse?> getChatCompletion(String completion_id) async {
    final response = await _client.get(ApiPaths.aiPath('/management/chat/completions/${completion_id}'));
    return response is ChatCompletionResponse ? response : null;
  }

  /// Update chat completion
  Future<ChatCompletionResponse?> updateChatCompletion(String completion_id, UpdateChatCompletionRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/management/chat/completions/${completion_id}'), body: body, contentType: 'application/json');
    return response is ChatCompletionResponse ? response : null;
  }

  /// Delete chat completion
  Future<ChatCompletionDeleteResponse?> deleteChatCompletion(String completion_id) async {
    final response = await _client.delete(ApiPaths.aiPath('/management/chat/completions/${completion_id}'));
    return response is ChatCompletionDeleteResponse ? response : null;
  }

  /// List chat completions
  Future<ChatCompletionList?> listCompletions(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/chat/completions'), params: params);
    return response is ChatCompletionList ? response : null;
  }

  /// Create chat completion
  Future<CreateChatCompletionResponse?> createChatCompletion(ChatCompletionRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/chat/completions'), body: body, contentType: 'application/json');
    return response is CreateChatCompletionResponse ? response : null;
  }

  /// Get chat messages
  Future<ChatMessageList?> getChatMessages(String completion_id, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/management/chat/completions/${completion_id}/messages'), params: params);
    return response is ChatMessageList ? response : null;
  }

  /// List chat completions
  Future<ChatCompletionList?> listChatCompletions(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/management/chat/completions'), params: params);
    return response is ChatCompletionList ? response : null;
  }

  /// Get chat completion messages
  Future<ChatMessageList?> getMessages(String completion_id, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/chat/completions/${completion_id}/messages'), params: params);
    return response is ChatMessageList ? response : null;
  }
}
