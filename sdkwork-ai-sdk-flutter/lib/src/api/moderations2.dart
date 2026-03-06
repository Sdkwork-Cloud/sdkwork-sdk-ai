import '../http/client.dart';
import '../models.dart';

class Moderations2Api {
  final HttpClient _client;
  
  Moderations2Api(this._client);

  /// Create moderation
  Future<ModerationResponse?> createModeration(ModerationRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/moderations'), body: body, contentType: 'application/json');
    return response is ModerationResponse ? response : null;
  }
}
