import '../http/client.dart';
import '../models.dart';

class Videos2Api {
  final HttpClient _client;
  
  Videos2Api(this._client);

  /// List videos
  Future<OpenAiVideoList?> listVideos(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/v1/videos'), params: params);
    return response is OpenAiVideoList ? response : null;
  }

  /// Create video
  Future<OpenAiVideo?> createVideo(VideoGenerationRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/videos'), body: body, contentType: 'application/json');
    return response is OpenAiVideo ? response : null;
  }

  /// Retrieve video
  Future<OpenAiVideo?> retrieveVideo(String video_id) async {
    final response = await _client.get(ApiPaths.aiPath('/v1/videos/${video_id}'));
    return response is OpenAiVideo ? response : null;
  }

  /// Delete video
  Future<OpenAiVideoDeleteResponse?> deleteVideo(String video_id) async {
    final response = await _client.delete(ApiPaths.aiPath('/v1/videos/${video_id}'));
    return response is OpenAiVideoDeleteResponse ? response : null;
  }
}
