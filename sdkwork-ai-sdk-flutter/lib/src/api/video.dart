import '../http/client.dart';
import '../models.dart';

class VideoApi {
  final HttpClient _client;
  
  VideoApi(this._client);

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

  /// Create video
  Future<OpenAiVideo?> createVideoGenerations(VideoGenerationRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/videos/generations'), body: body, contentType: 'application/json');
    return response is OpenAiVideo ? response : null;
  }

  /// Create video
  Future<OpenAiVideo?> createVideoGenerations2(VideoGenerationRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/videos/generations'), body: body, contentType: 'application/json');
    return response is OpenAiVideo ? response : null;
  }

  /// Retrieve video
  Future<OpenAiVideo?> retrieve(String video_id) async {
    final response = await _client.get(ApiPaths.aiPath('/videos/${video_id}'));
    return response is OpenAiVideo ? response : null;
  }

  /// Delete video
  Future<OpenAiVideoDeleteResponse?> deleteVideo(String video_id) async {
    final response = await _client.delete(ApiPaths.aiPath('/videos/${video_id}'));
    return response is OpenAiVideoDeleteResponse ? response : null;
  }
}
