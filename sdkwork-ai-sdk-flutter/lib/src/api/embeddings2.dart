import '../http/client.dart';
import '../models.dart';

class Embeddings2Api {
  final HttpClient _client;
  
  Embeddings2Api(this._client);

  /// Create embeddings
  Future<EmbeddingResponse?> createEmbedding(EmbeddingRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/embeddings'), body: body, contentType: 'application/json');
    return response is EmbeddingResponse ? response : null;
  }
}
