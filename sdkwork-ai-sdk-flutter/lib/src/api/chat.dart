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
  Future<ChatCompletionResponse?> updateCompletion(String completion_id, UpdateCompletionRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/chat/completions/${completion_id}'), body: body, contentType: 'application/json');
    return response is ChatCompletionResponse ? response : null;
  }

  /// Delete chat completion
  Future<ChatCompletionDeleteResponse?> deleteCompletion(String completion_id) async {
    final response = await _client.delete(ApiPaths.aiPath('/chat/completions/${completion_id}'));
    return response is ChatCompletionDeleteResponse ? response : null;
  }

  /// Update chat completion
  Future<ChatCompletionResponse?> patchUpdateCompletion(String completion_id, PatchUpdateCompletionRequest body) async {
    final response = await _client.patch(ApiPaths.aiPath('/chat/completions/${completion_id}'), body: body, contentType: 'application/json');
    return response is ChatCompletionResponse ? response : null;
  }

  /// Count Claude tokens
  Future<CountClaudeTokensResponse?> countClaudeTokens(CountClaudeTokensRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/messages/count_tokens'), body: body, contentType: 'application/json');
    return response is CountClaudeTokensResponse ? response : null;
  }

  /// Create Claude message
  Future<CreateClaudeMessageResponse?> createClaudeMessage(CreateClaudeMessageRequest body, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.aiPath('/messages'), body: body, headers: headers, contentType: 'application/json');
    return response is CreateClaudeMessageResponse ? response : null;
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

  /// Get chat completion messages
  Future<ChatMessageList?> getMessages(String completion_id, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/chat/completions/${completion_id}/messages'), params: params);
    return response is ChatMessageList ? response : null;
  }
}
