import '../http/client.dart';
import '../models.dart';

class Responses2Api {
  final HttpClient _client;
  
  Responses2Api(this._client);

  /// Cancel response
  Future<CancelResponsePostResponse?> cancelResponse(String response_id) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/responses/${response_id}/cancel'));
    return response is CancelResponsePostResponse ? response : null;
  }

  /// Create response
  Future<CreateResponseResponse?> createResponse(CreateResponseRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/responses'), body: body, contentType: 'application/json');
    return response is CreateResponseResponse ? response : null;
  }

  /// List response input items
  Future<ListResponseInputItemsResponse?> listResponseInputItems(String response_id) async {
    final response = await _client.get(ApiPaths.aiPath('/v1/responses/${response_id}/input_items'));
    return response is ListResponseInputItemsResponse ? response : null;
  }

  /// Get response
  Future<GetResponseResponse?> getResponse(String response_id) async {
    final response = await _client.get(ApiPaths.aiPath('/v1/responses/${response_id}'));
    return response is GetResponseResponse ? response : null;
  }

  /// Delete response
  Future<DeleteResponseResponse?> deleteResponse(String response_id) async {
    final response = await _client.delete(ApiPaths.aiPath('/v1/responses/${response_id}'));
    return response is DeleteResponseResponse ? response : null;
  }
}
