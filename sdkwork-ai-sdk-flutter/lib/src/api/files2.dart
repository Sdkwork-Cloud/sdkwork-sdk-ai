import '../http/client.dart';
import '../models.dart';

class Files2Api {
  final HttpClient _client;
  
  Files2Api(this._client);

  /// List files
  Future<OpenAiFileList?> listFiles(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/v1/files'), params: params);
    return response is OpenAiFileList ? response : null;
  }

  /// Upload file
  Future<OpenAiFileObject?> uploadFile(UploadFilePostRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.aiPath('/v1/files'), body: body, params: params, contentType: 'multipart/form-data');
    return response is OpenAiFileObject ? response : null;
  }

  /// Retrieve file content
  Future<String?> retrieveFileContent(String fileId) async {
    final response = await _client.get(ApiPaths.aiPath('/v1/files/${fileId}/content'));
    return response is String ? response : null;
  }

  /// Retrieve file
  Future<OpenAiFileObject?> retrieveFile(String fileId) async {
    final response = await _client.get(ApiPaths.aiPath('/v1/files/${fileId}'));
    return response is OpenAiFileObject ? response : null;
  }

  /// Delete file
  Future<OpenAiFileDeleteResponse?> deleteFile(String fileId) async {
    final response = await _client.delete(ApiPaths.aiPath('/v1/files/${fileId}'));
    return response is OpenAiFileDeleteResponse ? response : null;
  }
}
