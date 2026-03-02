import '../http/client.dart';
import '../models.dart';

class ChatCompletionsApi {
  final HttpClient _client;
  
  ChatCompletionsApi(this._client);

  /// Get chat completion
  Future<ChatCompletionResponse?> getChatCompletion(String completionId) async {
    final response = await _client.get(ApiPaths.aiPath('/management/chat/completions/${completionId}'));
    return response is ChatCompletionResponse ? response : null;
  }

  /// Update chat completion
  Future<ChatCompletionResponse?> updateChatCompletion(String completionId, UpdateChatCompletionRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/management/chat/completions/${completionId}'), body: body, contentType: 'application/json');
    return response is ChatCompletionResponse ? response : null;
  }

  /// Delete chat completion
  Future<ChatCompletionDeleteResponse?> deleteChatCompletion(String completionId) async {
    final response = await _client.delete(ApiPaths.aiPath('/management/chat/completions/${completionId}'));
    return response is ChatCompletionDeleteResponse ? response : null;
  }

  /// Get chat messages
  Future<ChatMessageList?> getChatMessages(String completionId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/management/chat/completions/${completionId}/messages'), params: params);
    return response is ChatMessageList ? response : null;
  }

  /// List chat completions
  Future<ChatCompletionList?> listChatCompletions(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/management/chat/completions'), params: params);
    return response is ChatCompletionList ? response : null;
  }
}
