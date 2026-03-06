import '../http/client.dart';
import '../models.dart';

class Music2Api {
  final HttpClient _client;
  
  Music2Api(this._client);

  /// Generate music
  Future<SunoMusic?> generate(MusicGenerationRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/music/generations'), body: body, contentType: 'application/json');
    return response is SunoMusic ? response : null;
  }

  /// Retrieve music
  Future<SunoMusic?> retrieve(String musicId) async {
    final response = await _client.get(ApiPaths.aiPath('/music/${musicId}'));
    return response is SunoMusic ? response : null;
  }

  /// Delete music
  Future<SunoMusicDeleteResponse?> deleteMusic(String musicId) async {
    final response = await _client.delete(ApiPaths.aiPath('/music/${musicId}'));
    return response is SunoMusicDeleteResponse ? response : null;
  }

  /// List music
  Future<SunoMusicList?> listMusic(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/music'), params: params);
    return response is SunoMusicList ? response : null;
  }
}
