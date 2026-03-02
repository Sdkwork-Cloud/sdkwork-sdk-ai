import '../http/client.dart';
import '../models.dart';

class BatchesApi {
  final HttpClient _client;
  
  BatchesApi(this._client);

  /// Cancel batch
  Future<BatchResponse?> cancelBatch(String batch_id) async {
    final response = await _client.post(ApiPaths.aiPath('/batches/${batch_id}/cancel'));
    return response is BatchResponse ? response : null;
  }

  /// List batches
  Future<BatchListResponse?> listBatches(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/batches'), params: params);
    return response is BatchListResponse ? response : null;
  }

  /// Create batch
  Future<BatchResponse?> createBatch(BatchCreateRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/batches'), body: body, contentType: 'application/json');
    return response is BatchResponse ? response : null;
  }

  /// Get batch
  Future<BatchResponse?> getBatch(String batch_id) async {
    final response = await _client.get(ApiPaths.aiPath('/batches/${batch_id}'));
    return response is BatchResponse ? response : null;
  }
}
