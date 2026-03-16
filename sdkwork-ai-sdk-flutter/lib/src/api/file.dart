import '../http/client.dart';
import '../models.dart';

class FileApi {
  final HttpClient _client;
  
  FileApi(this._client);

  /// List files
  Future<OpenAiFileList?> listFiles(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/files'), params: params);
    return response is OpenAiFileList ? response : null;
  }

  /// Upload file
  Future<OpenAiFileObject?> upload(UploadFileRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.aiPath('/files'), body: body, params: params, contentType: 'multipart/form-data');
    return response is OpenAiFileObject ? response : null;
  }

  /// Retrieve file content
  Future<String?> retrieveFileContent(String file_id) async {
    final response = await _client.get(ApiPaths.aiPath('/files/${file_id}/content'));
    return response is String ? response : null;
  }

  /// Retrieve file
  Future<OpenAiFileObject?> retrieve(String file_id) async {
    final response = await _client.get(ApiPaths.aiPath('/files/${file_id}'));
    return response is OpenAiFileObject ? response : null;
  }

  /// Delete file
  Future<OpenAiFileDeleteResponse?> deleteFile(String file_id) async {
    final response = await _client.delete(ApiPaths.aiPath('/files/${file_id}'));
    return response is OpenAiFileDeleteResponse ? response : null;
  }
}
