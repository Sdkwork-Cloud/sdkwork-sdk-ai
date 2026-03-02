import '../http/client.dart';
import '../models.dart';

class ModelsApi {
  final HttpClient _client;
  
  ModelsApi(this._client);

  /// Retrieve model
  Future<OpenAiModel?> retrieveModel(String model) async {
    final response = await _client.get(ApiPaths.aiPath('/models/${model}'));
    return response is OpenAiModel ? response : null;
  }

  /// Delete model
  Future<OpenAiModelDeleteResponse?> deleteModel(String model) async {
    final response = await _client.delete(ApiPaths.aiPath('/models/${model}'));
    return response is OpenAiModelDeleteResponse ? response : null;
  }

  /// List models
  Future<OpenAiModelList?> listModels() async {
    final response = await _client.get(ApiPaths.aiPath('/models'));
    return response is OpenAiModelList ? response : null;
  }
}
