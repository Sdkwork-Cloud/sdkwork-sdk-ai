import '../http/client.dart';
import '../models.dart';

class Images2Api {
  final HttpClient _client;
  
  Images2Api(this._client);

  /// Create image variation
  Future<ImageGenerationResponse?> createImageVariation(CreateImageVariationPostRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/images/variations'), body: body, params: params, contentType: 'multipart/form-data');
    return response is ImageGenerationResponse ? response : null;
  }

  /// Create image
  Future<ImageGenerationResponse?> createImage(ImageGenerationRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/images/generations'), body: body, contentType: 'application/json');
    return response is ImageGenerationResponse ? response : null;
  }

  /// Create image edit
  Future<ImageGenerationResponse?> createImageEdit(CreateImageEditRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/images/edits'), body: body, params: params, contentType: 'multipart/form-data');
    return response is ImageGenerationResponse ? response : null;
  }
}
