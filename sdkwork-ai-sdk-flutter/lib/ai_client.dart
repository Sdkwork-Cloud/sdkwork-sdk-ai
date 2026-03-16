import 'package:sdkwork_common_flutter/sdkwork_common_flutter.dart';
import 'src/http/client.dart';
import '../api/open.dart';
import '../api/chat.dart';
import '../api/video.dart';
import '../api/thread.dart';
import '../api/response.dart';
import '../api/rerank.dart';
import '../api/music.dart';
import '../api/moderation.dart';
import '../api/message.dart';
import '../api/knowledge_base.dart';
import '../api/image.dart';
import '../api/file.dart';
import '../api/embedding.dart';
import '../api/context.dart';
import '../api/batch.dart';
import '../api/audio.dart';
import '../api/assistant.dart';
import '../api/model.dart';

class SdkworkAiClient {
  final HttpClient _httpClient;

  late final OpenApi open;
  late final ChatApi chat;
  late final VideoApi video;
  late final ThreadApi thread;
  late final ResponseApi response;
  late final RerankApi rerank;
  late final MusicApi music;
  late final ModerationApi moderation;
  late final MessageApi message;
  late final KnowledgeBaseApi knowledgeBase;
  late final ImageApi image;
  late final FileApi file;
  late final EmbeddingApi embedding;
  late final ContextApi context;
  late final BatchApi batch;
  late final AudioApi audio;
  late final AssistantApi assistant;
  late final ModelApi model;

  SdkworkAiClient({
    required SdkConfig config,
  }) : _httpClient = HttpClient(config: config) {
    open = OpenApi(_httpClient);
    chat = ChatApi(_httpClient);
    video = VideoApi(_httpClient);
    thread = ThreadApi(_httpClient);
    response = ResponseApi(_httpClient);
    rerank = RerankApi(_httpClient);
    music = MusicApi(_httpClient);
    moderation = ModerationApi(_httpClient);
    message = MessageApi(_httpClient);
    knowledgeBase = KnowledgeBaseApi(_httpClient);
    image = ImageApi(_httpClient);
    file = FileApi(_httpClient);
    embedding = EmbeddingApi(_httpClient);
    context = ContextApi(_httpClient);
    batch = BatchApi(_httpClient);
    audio = AudioApi(_httpClient);
    assistant = AssistantApi(_httpClient);
    model = ModelApi(_httpClient);
  }

  factory SdkworkAiClient.withBaseUrl({
    required String baseUrl,
    String? apiKey,
    String? authToken,
    String? accessToken,
    String apiKeyHeader = 'Authorization',
    bool apiKeyAsBearer = true,
    Map<String, String>? headers,
    int timeout = 30000,
  }) {
    return SdkworkAiClient(
      config: SdkConfig(
        baseUrl: baseUrl,
        timeout: timeout,
        headers: headers ?? const {},
        apiKey: apiKey,
        apiKeyHeader: apiKeyHeader,
        apiKeyAsBearer: apiKeyAsBearer,
        authToken: authToken,
        accessToken: accessToken,
      ),
    );
  }

  void setApiKey(String apiKey) {
    _httpClient.setApiKey(apiKey);
  }

  void setAuthToken(String token) {
    _httpClient.setAuthToken(token);
  }

  void setAccessToken(String token) {
    _httpClient.setAccessToken(token);
  }

  void setHeader(String key, String value) {
    _httpClient.setHeader(key, value);
  }
}
