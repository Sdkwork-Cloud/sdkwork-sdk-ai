import '../http/client.dart';
import '../models.dart';

class AudioApi {
  final HttpClient _client;
  
  AudioApi(this._client);

  /// Create translation
  Future<TranscriptionResponse?> createTranslation(CreateTranslationRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.aiPath('/audio/translations'), body: body, params: params, contentType: 'multipart/form-data');
    return response is TranscriptionResponse ? response : null;
  }

  /// Create transcription
  Future<TranscriptionResponse?> createTranscription(CreateTranscriptionRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.aiPath('/audio/transcriptions'), body: body, params: params, contentType: 'multipart/form-data');
    return response is TranscriptionResponse ? response : null;
  }

  /// Create speech
  Future<String?> createSpeech(SpeechRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/audio/speech'), body: body, contentType: 'application/json');
    return response is String ? response : null;
  }
}
