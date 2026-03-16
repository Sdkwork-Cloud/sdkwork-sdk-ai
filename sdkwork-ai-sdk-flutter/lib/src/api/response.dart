import '../http/client.dart';
import '../models.dart';

class ResponseApi {
  final HttpClient _client;
  
  ResponseApi(this._client);

  /// Cancel response
  Future<CancelResponseResponse?> cancel(String response_id) async {
    final response = await _client.post(ApiPaths.aiPath('/responses/${response_id}/cancel'));
    return response is CancelResponseResponse ? response : null;
  }

  /// Create response
  Future<CreateResponsePostResponse?> createResponse(CreateResponsePostRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/responses'), body: body, contentType: 'application/json');
    return response is CreateResponsePostResponse ? response : null;
  }

  /// List response input items
  Future<ListResponseInputItemsGetResponse?> listResponseInputItems(String response_id) async {
    final response = await _client.get(ApiPaths.aiPath('/responses/${response_id}/input_items'));
    return response is ListResponseInputItemsGetResponse ? response : null;
  }

  /// Get response
  Future<GetResponseGetResponse?> getResponse(String response_id) async {
    final response = await _client.get(ApiPaths.aiPath('/responses/${response_id}'));
    return response is GetResponseGetResponse ? response : null;
  }

  /// Delete response
  Future<DeleteResponseDeleteResponse?> deleteResponse(String response_id) async {
    final response = await _client.delete(ApiPaths.aiPath('/responses/${response_id}'));
    return response is DeleteResponseDeleteResponse ? response : null;
  }
}
