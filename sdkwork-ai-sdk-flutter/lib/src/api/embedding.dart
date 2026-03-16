import '../http/client.dart';
import '../models.dart';

class EmbeddingApi {
  final HttpClient _client;
  
  EmbeddingApi(this._client);

  /// Create embeddings
  Future<EmbeddingResponse?> createEmbedding(EmbeddingRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/embeddings'), body: body, contentType: 'application/json');
    return response is EmbeddingResponse ? response : null;
  }
}
