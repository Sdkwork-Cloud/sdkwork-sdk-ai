import '../http/client.dart';
import '../models.dart';

class VideosApi {
  final HttpClient _client;
  
  VideosApi(this._client);

  /// List videos
  Future<OpenAiVideoList?> listVideos(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/videos'), params: params);
    return response is OpenAiVideoList ? response : null;
  }

  /// Create video
  Future<OpenAiVideo?> createVideo(VideoGenerationRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/videos'), body: body, contentType: 'application/json');
    return response is OpenAiVideo ? response : null;
  }

  /// Retrieve video
  Future<OpenAiVideo?> retrieveVideo(String video_id) async {
    final response = await _client.get(ApiPaths.aiPath('/videos/${video_id}'));
    return response is OpenAiVideo ? response : null;
  }

  /// Delete video
  Future<OpenAiVideoDeleteResponse?> deleteVideo(String video_id) async {
    final response = await _client.delete(ApiPaths.aiPath('/videos/${video_id}'));
    return response is OpenAiVideoDeleteResponse ? response : null;
  }
}
