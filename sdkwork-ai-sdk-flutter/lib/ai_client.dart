import 'package:sdkwork_common_flutter/sdkwork_common_flutter.dart';
import 'src/http/client.dart';
import '../api/chat.dart';
import '../api/videos.dart';
import '../api/threads.dart';
import '../api/responses.dart';
import '../api/rerank.dart';
import '../api/music.dart';
import '../api/moderations.dart';
import '../api/chat_completions.dart';
import '../api/knowledge_bases.dart';
import '../api/images.dart';
import '../api/files.dart';
import '../api/embeddings.dart';
import '../api/context.dart';
import '../api/batches.dart';
import '../api/audio.dart';
import '../api/assistants.dart';
import '../api/models.dart';

class SdkworkAiClient {
  final HttpClient _httpClient;

  late final ChatApi chat;
  late final VideosApi videos;
  late final ThreadsApi threads;
  late final ResponsesApi responses;
  late final RerankApi rerank;
  late final MusicApi music;
  late final ModerationsApi moderations;
  late final ChatCompletionsApi chatCompletions;
  late final KnowledgeBasesApi knowledgeBases;
  late final ImagesApi images;
  late final FilesApi files;
  late final EmbeddingsApi embeddings;
  late final ContextApi context;
  late final BatchesApi batches;
  late final AudioApi audio;
  late final AssistantsApi assistants;
  late final ModelsApi models;

  SdkworkAiClient({
    required SdkConfig config,
  }) : _httpClient = HttpClient(config: config) {
    chat = ChatApi(_httpClient);
    videos = VideosApi(_httpClient);
    threads = ThreadsApi(_httpClient);
    responses = ResponsesApi(_httpClient);
    rerank = RerankApi(_httpClient);
    music = MusicApi(_httpClient);
    moderations = ModerationsApi(_httpClient);
    chatCompletions = ChatCompletionsApi(_httpClient);
    knowledgeBases = KnowledgeBasesApi(_httpClient);
    images = ImagesApi(_httpClient);
    files = FilesApi(_httpClient);
    embeddings = EmbeddingsApi(_httpClient);
    context = ContextApi(_httpClient);
    batches = BatchesApi(_httpClient);
    audio = AudioApi(_httpClient);
    assistants = AssistantsApi(_httpClient);
    models = ModelsApi(_httpClient);
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
