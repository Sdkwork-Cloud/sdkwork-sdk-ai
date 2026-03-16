import '../http/client.dart';
import '../models.dart';

class MusicApi {
  final HttpClient _client;
  
  MusicApi(this._client);

  /// Generate music
  Future<SunoMusic?> createGenerate(MusicGenerationRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/music/generations'), body: body, contentType: 'application/json');
    return response is SunoMusic ? response : null;
  }

  /// List music
  Future<SunoMusicList?> listMusic(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/music'), params: params);
    return response is SunoMusicList ? response : null;
  }

  /// Generate music
  Future<SunoMusic?> createGenerateMusic(MusicGenerationRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/music'), body: body, contentType: 'application/json');
    return response is SunoMusic ? response : null;
  }

  /// Generate music
  Future<SunoMusic?> createGenerateGenerations(MusicGenerationRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/music/generations'), body: body, contentType: 'application/json');
    return response is SunoMusic ? response : null;
  }

  /// Retrieve music
  Future<SunoMusic?> retrieve(String music_id) async {
    final response = await _client.get(ApiPaths.aiPath('/music/${music_id}'));
    return response is SunoMusic ? response : null;
  }

  /// Delete music
  Future<SunoMusicDeleteResponse?> deleteMusic(String music_id) async {
    final response = await _client.delete(ApiPaths.aiPath('/music/${music_id}'));
    return response is SunoMusicDeleteResponse ? response : null;
  }
}
