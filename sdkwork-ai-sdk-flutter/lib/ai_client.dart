import 'package:sdkwork_common_flutter/sdkwork_common_flutter.dart';
import 'src/http/client.dart';
import '../api/i18n_resource.dart';
import '../api/chat.dart';
import '../api/chat2.dart';
import '../api/videos.dart';
import '../api/videos2.dart';
import '../api/threads.dart';
import '../api/threads2.dart';
import '../api/responses.dart';
import '../api/responses2.dart';
import '../api/rerank.dart';
import '../api/rerank2.dart';
import '../api/music.dart';
import '../api/music2.dart';
import '../api/moderations.dart';
import '../api/moderations2.dart';
import '../api/chat_completions.dart';
import '../api/chat_completions2.dart';
import '../api/knowledge_bases.dart';
import '../api/knowledge_bases2.dart';
import '../api/images.dart';
import '../api/images2.dart';
import '../api/files.dart';
import '../api/files2.dart';
import '../api/embeddings.dart';
import '../api/embeddings2.dart';
import '../api/context.dart';
import '../api/context2.dart';
import '../api/batches.dart';
import '../api/batches2.dart';
import '../api/audio.dart';
import '../api/audio2.dart';
import '../api/assistants.dart';
import '../api/assistants2.dart';
import '../api/models.dart';
import '../api/models2.dart';

class SdkworkAiClient {
  final HttpClient _httpClient;

  late final I18nResourceApi i18nResource;
  late final ChatApi chat;
  late final Chat2Api chat2;
  late final VideosApi videos;
  late final Videos2Api videos2;
  late final ThreadsApi threads;
  late final Threads2Api threads2;
  late final ResponsesApi responses;
  late final Responses2Api responses2;
  late final RerankApi rerank;
  late final Rerank2Api rerank2;
  late final MusicApi music;
  late final Music2Api music2;
  late final ModerationsApi moderations;
  late final Moderations2Api moderations2;
  late final ChatCompletionsApi chatCompletions;
  late final ChatCompletions2Api chatCompletions2;
  late final KnowledgeBasesApi knowledgeBases;
  late final KnowledgeBases2Api knowledgeBases2;
  late final ImagesApi images;
  late final Images2Api images2;
  late final FilesApi files;
  late final Files2Api files2;
  late final EmbeddingsApi embeddings;
  late final Embeddings2Api embeddings2;
  late final ContextApi context;
  late final Context2Api context2;
  late final BatchesApi batches;
  late final Batches2Api batches2;
  late final AudioApi audio;
  late final Audio2Api audio2;
  late final AssistantsApi assistants;
  late final Assistants2Api assistants2;
  late final ModelsApi models;
  late final Models2Api models2;

  SdkworkAiClient({
    required SdkConfig config,
  }) : _httpClient = HttpClient(config: config) {
    i18nResource = I18nResourceApi(_httpClient);
    chat = ChatApi(_httpClient);
    chat2 = Chat2Api(_httpClient);
    videos = VideosApi(_httpClient);
    videos2 = Videos2Api(_httpClient);
    threads = ThreadsApi(_httpClient);
    threads2 = Threads2Api(_httpClient);
    responses = ResponsesApi(_httpClient);
    responses2 = Responses2Api(_httpClient);
    rerank = RerankApi(_httpClient);
    rerank2 = Rerank2Api(_httpClient);
    music = MusicApi(_httpClient);
    music2 = Music2Api(_httpClient);
    moderations = ModerationsApi(_httpClient);
    moderations2 = Moderations2Api(_httpClient);
    chatCompletions = ChatCompletionsApi(_httpClient);
    chatCompletions2 = ChatCompletions2Api(_httpClient);
    knowledgeBases = KnowledgeBasesApi(_httpClient);
    knowledgeBases2 = KnowledgeBases2Api(_httpClient);
    images = ImagesApi(_httpClient);
    images2 = Images2Api(_httpClient);
    files = FilesApi(_httpClient);
    files2 = Files2Api(_httpClient);
    embeddings = EmbeddingsApi(_httpClient);
    embeddings2 = Embeddings2Api(_httpClient);
    context = ContextApi(_httpClient);
    context2 = Context2Api(_httpClient);
    batches = BatchesApi(_httpClient);
    batches2 = Batches2Api(_httpClient);
    audio = AudioApi(_httpClient);
    audio2 = Audio2Api(_httpClient);
    assistants = AssistantsApi(_httpClient);
    assistants2 = Assistants2Api(_httpClient);
    models = ModelsApi(_httpClient);
    models2 = Models2Api(_httpClient);
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
