import '../http/client.dart';
import '../models.dart';

class Audio2Api {
  final HttpClient _client;
  
  Audio2Api(this._client);

  /// Create translation
  Future<TranscriptionResponse?> createTranslation(CreateTranslationPostRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/audio/translations'), body: body, params: params, contentType: 'multipart/form-data');
    return response is TranscriptionResponse ? response : null;
  }

  /// Create transcription
  Future<TranscriptionResponse?> createTranscription(CreateTranscriptionRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/audio/transcriptions'), body: body, params: params, contentType: 'multipart/form-data');
    return response is TranscriptionResponse ? response : null;
  }

  /// Create speech
  Future<String?> createSpeech(SpeechRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/audio/speech'), body: body, contentType: 'application/json');
    return response is String ? response : null;
  }
}
