import '../http/client.dart';
import '../models.dart';

class Rerank2Api {
  final HttpClient _client;
  
  Rerank2Api(this._client);

  /// Rerank documents
  Future<RerankResponse?> rerank(RerankRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/rerank'), body: body, contentType: 'application/json');
    return response is RerankResponse ? response : null;
  }
}
