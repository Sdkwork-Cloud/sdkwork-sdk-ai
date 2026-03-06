import '../http/client.dart';
import '../models.dart';

class ModerationsApi {
  final HttpClient _client;
  
  ModerationsApi(this._client);

  /// Create moderation
  Future<ModerationResponse?> createModeration(ModerationRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/moderations'), body: body, contentType: 'application/json');
    return response is ModerationResponse ? response : null;
  }
}
