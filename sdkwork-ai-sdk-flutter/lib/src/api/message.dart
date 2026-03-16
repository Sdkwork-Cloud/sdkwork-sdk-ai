import '../http/client.dart';
import '../models.dart';

class MessageApi {
  final HttpClient _client;
  
  MessageApi(this._client);

  /// Count Claude tokens
  Future<CountClaudeTokensPostResponse?> countClaudeTokens(CountClaudeTokensPostRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/messages/count_tokens'), body: body, contentType: 'application/json');
    return response is CountClaudeTokensPostResponse ? response : null;
  }

  /// Create Claude message
  Future<CreateClaudeMessageResponse?> createClaude(CreateClaudeMessageRequest body, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.aiPath('/messages'), body: body, headers: headers, contentType: 'application/json');
    return response is CreateClaudeMessageResponse ? response : null;
  }
}
