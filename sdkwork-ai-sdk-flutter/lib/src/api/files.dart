import '../http/client.dart';
import '../models.dart';

class FilesApi {
  final HttpClient _client;
  
  FilesApi(this._client);

  /// List files
  Future<OpenAiFileList?> listFiles(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/files'), params: params);
    return response is OpenAiFileList ? response : null;
  }

  /// Upload file
  Future<OpenAiFileObject?> uploadFile(UploadFileRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.aiPath('/files'), body: body, params: params, contentType: 'multipart/form-data');
    return response is OpenAiFileObject ? response : null;
  }

  /// Retrieve file content
  Future<String?> retrieveFileContent(String fileId) async {
    final response = await _client.get(ApiPaths.aiPath('/files/${fileId}/content'));
    return response is String ? response : null;
  }

  /// Retrieve file
  Future<OpenAiFileObject?> retrieveFile(String fileId) async {
    final response = await _client.get(ApiPaths.aiPath('/files/${fileId}'));
    return response is OpenAiFileObject ? response : null;
  }

  /// Delete file
  Future<OpenAiFileDeleteResponse?> deleteFile(String fileId) async {
    final response = await _client.delete(ApiPaths.aiPath('/files/${fileId}'));
    return response is OpenAiFileDeleteResponse ? response : null;
  }
}
