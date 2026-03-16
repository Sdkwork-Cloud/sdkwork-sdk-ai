import '../http/client.dart';
import '../models.dart';

class OpenApi {
  final HttpClient _client;
  
  OpenApi(this._client);

  Future<PlusApiResultListLabelOption?> getOptions(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/v1/open/i18n/options'), params: params);
    return response is PlusApiResultListLabelOption ? response : null;
  }

  Future<PlusApiResultListLabelOption?> createOptions(Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/open/i18n/options'), params: params);
    return response is PlusApiResultListLabelOption ? response : null;
  }
}
