import '../http/client.dart';
import '../models.dart';

class ImagesApi {
  final HttpClient _client;
  
  ImagesApi(this._client);

  /// Create image variation
  Future<ImageGenerationResponse?> createImageVariation(ImageGenerationRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/images/variations'), body: body, contentType: 'application/json');
    return response is ImageGenerationResponse ? response : null;
  }

  /// Create image
  Future<ImageGenerationResponse?> createImage(ImageGenerationRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/images/generations'), body: body, contentType: 'application/json');
    return response is ImageGenerationResponse ? response : null;
  }

  /// Create image edit
  Future<ImageGenerationResponse?> createImageEdit(ImageGenerationRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/images/edits'), body: body, contentType: 'application/json');
    return response is ImageGenerationResponse ? response : null;
  }
}
