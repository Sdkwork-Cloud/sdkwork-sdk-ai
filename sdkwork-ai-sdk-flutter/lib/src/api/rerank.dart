import '../http/client.dart';
import '../models.dart';

class RerankApi {
  final HttpClient _client;
  
  RerankApi(this._client);

  /// Rerank documents
  Future<RerankResponse?> rerank(RerankRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/rerank'), body: body, contentType: 'application/json');
    return response is RerankResponse ? response : null;
  }
}
