class LabelOption {
  final String? label;
  final String? value;
  final String? description;

  LabelOption({
    this.label,
    this.value,
    this.description
  });
}

class PlusApiResultListLabelOption {
  final List<LabelOption>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListLabelOption({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ChatCompletionResponse {
  final String? id;
  final String? object;
  final int? created;
  final String? model;
  final List<Choice>? choices;
  final Usage? usage;
  final String? systemFingerprint;
  final String? serviceTier;

  ChatCompletionResponse({
    this.id,
    this.object,
    this.created,
    this.model,
    this.choices,
    this.usage,
    this.systemFingerprint,
    this.serviceTier
  });
}

class Choice {
  final int? index;
  final Message? message;
  final Logprobs? logprobs;
  final String? finishReason;
  final String? moderationHitType;

  Choice({
    this.index,
    this.message,
    this.logprobs,
    this.finishReason,
    this.moderationHitType
  });
}

class CompletionTokensDetails {
  final int? reasoningTokens;
  final int? audioTokens;
  final int? acceptedPredictionTokens;
  final int? rejectedPredictionTokens;

  CompletionTokensDetails({
    this.reasoningTokens,
    this.audioTokens,
    this.acceptedPredictionTokens,
    this.rejectedPredictionTokens
  });
}

class Content {
  final String? token;
  final double? logprob;
  final List<int>? bytes;
  final List<TopLogprob>? topLogprobs;

  Content({
    this.token,
    this.logprob,
    this.bytes,
    this.topLogprobs
  });
}

class FunctionCall {
  final String? name;
  final String? arguments;

  FunctionCall({
    this.name,
    this.arguments
  });
}

class Logprobs {
  final List<Content>? content;
  final List<Content>? refusal;

  Logprobs({
    this.content,
    this.refusal
  });
}

class Message {
  final String? role;
  final dynamic? content;
  final String? refusal;
  final List<dynamic>? annotations;
  final String? reasoningContent;
  final List<ToolCall>? toolCalls;

  Message({
    this.role,
    this.content,
    this.refusal,
    this.annotations,
    this.reasoningContent,
    this.toolCalls
  });
}

class PromptTokensDetails {
  final int? cachedTokens;
  final int? audioTokens;

  PromptTokensDetails({
    this.cachedTokens,
    this.audioTokens
  });
}

class ToolCall {
  final String? id;
  final String? type;
  final FunctionCall? function;

  ToolCall({
    this.id,
    this.type,
    this.function
  });
}

class TopLogprob {
  final String? token;
  final double? logprob;
  final List<int>? bytes;

  TopLogprob({
    this.token,
    this.logprob,
    this.bytes
  });
}

class Usage {
  final int? promptTokens;
  final int? completionTokens;
  final int? totalTokens;
  final PromptTokensDetails? promptTokensDetails;
  final CompletionTokensDetails? completionTokensDetails;

  Usage({
    this.promptTokens,
    this.completionTokens,
    this.totalTokens,
    this.promptTokensDetails,
    this.completionTokensDetails
  });
}

class VideoGenerationRequest {
  final String? prompt;
  final String? model;
  final String? seconds;
  final String? size;
  final String? quality;
  final int? width;
  final int? height;
  final int? seed;
  final String? user;
  final String? negativePrompt;
  final List<String>? imageUrls;
  final String? aspectRatio;
  final String? responseFormat;

  VideoGenerationRequest({
    this.prompt,
    this.model,
    this.seconds,
    this.size,
    this.quality,
    this.width,
    this.height,
    this.seed,
    this.user,
    this.negativePrompt,
    this.imageUrls,
    this.aspectRatio,
    this.responseFormat
  });
}

class OpenAiVideo {
  final String? id;
  final String? object;
  final String? model;
  final String? status;
  final int? progress;
  final String? prompt;
  final String? seconds;
  final String? size;
  final String? quality;
  final VideoError? error;
  final int? createdAt;
  final int? completedAt;
  final int? expiresAt;
  final String? outputUrl;
  final String? remixedFromVideoId;

  OpenAiVideo({
    this.id,
    this.object,
    this.model,
    this.status,
    this.progress,
    this.prompt,
    this.seconds,
    this.size,
    this.quality,
    this.error,
    this.createdAt,
    this.completedAt,
    this.expiresAt,
    this.outputUrl,
    this.remixedFromVideoId
  });
}

class VideoError {
  final String? code;
  final String? message;
  final String? type;
  final String? param;

  VideoError({
    this.code,
    this.message,
    this.type,
    this.param
  });
}

class Function {
  final String? name;
  final String? arguments;

  Function({
    this.name,
    this.arguments
  });
}

class LastError {
  final String? code;
  final String? message;

  LastError({
    this.code,
    this.message
  });
}

class RequiredAction {
  final String? type;
  final SubmitToolOutputs? submitToolOutputs;

  RequiredAction({
    this.type,
    this.submitToolOutputs
  });
}

class RunResponse {
  final String? id;
  final String? object;
  final String? status;
  final String? model;
  final String? instructions;
  final List<dynamic>? tools;
  final Map<String, String>? metadata;
  final Usage? usage;
  final double? temperature;
  final int? createdAt;
  final String? threadId;
  final String? assistantId;
  final RequiredAction? requiredAction;
  final LastError? lastError;
  final int? expiresAt;
  final int? startedAt;
  final int? cancelledAt;
  final int? failedAt;
  final int? completedAt;
  final Map<String, dynamic>? toolResources;
  final double? topP;
  final int? maxPromptTokens;
  final int? maxCompletionTokens;
  final dynamic? truncationStrategy;

  RunResponse({
    this.id,
    this.object,
    this.status,
    this.model,
    this.instructions,
    this.tools,
    this.metadata,
    this.usage,
    this.temperature,
    this.createdAt,
    this.threadId,
    this.assistantId,
    this.requiredAction,
    this.lastError,
    this.expiresAt,
    this.startedAt,
    this.cancelledAt,
    this.failedAt,
    this.completedAt,
    this.toolResources,
    this.topP,
    this.maxPromptTokens,
    this.maxCompletionTokens,
    this.truncationStrategy
  });
}

class SubmitToolOutputs {
  final List<ToolCall>? toolCalls;

  SubmitToolOutputs({
    this.toolCalls
  });
}

class RunCreateRequest {
  final String? model;
  final String? instructions;
  final List<dynamic>? tools;
  final Map<String, String>? metadata;
  final double? temperature;
  final bool? stream;
  final String? assistantId;
  final String? additionalInstructions;
  final List<Map<String, dynamic>>? additionalMessages;
  final Map<String, dynamic>? toolResources;
  final double? topP;
  final int? maxPromptTokens;
  final int? maxCompletionTokens;
  final TruncationStrategy? truncationStrategy;

  RunCreateRequest({
    this.model,
    this.instructions,
    this.tools,
    this.metadata,
    this.temperature,
    this.stream,
    this.assistantId,
    this.additionalInstructions,
    this.additionalMessages,
    this.toolResources,
    this.topP,
    this.maxPromptTokens,
    this.maxCompletionTokens,
    this.truncationStrategy
  });
}

class TruncationStrategy {
  final String? type;
  final int? lastMessages;

  TruncationStrategy({
    this.type,
    this.lastMessages
  });
}

class ThreadMessageModifyRequest {
  final Map<String, String>? metadata;

  ThreadMessageModifyRequest({
    this.metadata
  });
}

class ContentBlock {
  final String? type;
  final TextContent? text;
  final ImageFileContent? imageFile;

  ContentBlock({
    this.type,
    this.text,
    this.imageFile
  });
}

class ImageFileContent {
  final String? fileId;

  ImageFileContent({
    this.fileId
  });
}

class TextContent {
  final String? value;
  final List<dynamic>? annotations;

  TextContent({
    this.value,
    this.annotations
  });
}

class ThreadMessageResponse {
  final String? id;
  final String? object;
  final String? role;
  final String? status;
  final List<ContentBlock>? content;
  final Map<String, String>? metadata;
  final int? createdAt;
  final String? threadId;
  final dynamic? incompleteDetails;
  final int? completedAt;
  final int? incompleteAt;
  final String? assistantId;
  final String? runId;
  final List<String>? fileIds;

  ThreadMessageResponse({
    this.id,
    this.object,
    this.role,
    this.status,
    this.content,
    this.metadata,
    this.createdAt,
    this.threadId,
    this.incompleteDetails,
    this.completedAt,
    this.incompleteAt,
    this.assistantId,
    this.runId,
    this.fileIds
  });
}

class Attachment {
  final List<Map<String, dynamic>>? tools;
  final String? fileId;

  Attachment({
    this.tools,
    this.fileId
  });
}

class ThreadMessageCreateRequest {
  final String? role;
  final dynamic? content;
  final List<Attachment>? attachments;
  final Map<String, String>? metadata;

  ThreadMessageCreateRequest({
    this.role,
    this.content,
    this.attachments,
    this.metadata
  });
}

class ThreadCreateRequest {
  final List<Message>? messages;
  final Map<String, String>? metadata;
  final Map<String, dynamic>? toolResources;

  ThreadCreateRequest({
    this.messages,
    this.metadata,
    this.toolResources
  });
}

class ThreadResponse {
  final String? id;
  final String? object;
  final Map<String, String>? metadata;
  final int? createdAt;
  final Map<String, dynamic>? toolResources;

  ThreadResponse({
    this.id,
    this.object,
    this.metadata,
    this.createdAt,
    this.toolResources
  });
}

class ThreadRunCreateRequest {
  final String? model;
  final String? instructions;
  final List<dynamic>? tools;
  final Map<String, String>? metadata;
  final double? temperature;
  final bool? stream;
  final ThreadCreateRequest? thread;
  final String? assistantId;
  final String? additionalInstructions;
  final List<Map<String, dynamic>>? additionalMessages;
  final Map<String, dynamic>? toolResources;
  final double? topP;
  final int? maxPromptTokens;
  final int? maxCompletionTokens;
  final TruncationStrategy? truncationStrategy;

  ThreadRunCreateRequest({
    this.model,
    this.instructions,
    this.tools,
    this.metadata,
    this.temperature,
    this.stream,
    this.thread,
    this.assistantId,
    this.additionalInstructions,
    this.additionalMessages,
    this.toolResources,
    this.topP,
    this.maxPromptTokens,
    this.maxCompletionTokens,
    this.truncationStrategy
  });
}

class Document {
  final String? content;
  final dynamic? metadata;

  Document({
    this.content,
    this.metadata
  });
}

class RerankRequest {
  final String? query;
  final List<Document>? documents;
  final String? model;
  final int? topN;
  final bool? returnDocuments;

  RerankRequest({
    this.query,
    this.documents,
    this.model,
    this.topN,
    this.returnDocuments
  });
}

class RerankResponse {
  final String? id;
  final String? object;
  final String? model;
  final List<Result>? results;
  final Usage? usage;

  RerankResponse({
    this.id,
    this.object,
    this.model,
    this.results,
    this.usage
  });
}

class Result {
  final int? index;
  final double? score;
  final String? document;

  Result({
    this.index,
    this.score,
    this.document
  });
}

class MusicGenerationRequest {
  final String? model;
  final String? prompt;
  final int? duration;
  final String? format;
  final int? n;
  final String? style;
  final Map<String, String>? metadata;
  final String? negativePrompt;
  final String? responseFormat;
  final String? referenceAudio;

  MusicGenerationRequest({
    this.model,
    this.prompt,
    this.duration,
    this.format,
    this.n,
    this.style,
    this.metadata,
    this.negativePrompt,
    this.responseFormat,
    this.referenceAudio
  });
}

class MusicError {
  final String? code;
  final String? message;

  MusicError({
    this.code,
    this.message
  });
}

class SunoMusic {
  final String? id;
  final String? object;
  final String? title;
  final String? status;
  final int? duration;
  final List<String>? tags;
  final String? genre;
  final String? audioUrl;
  final String? lyrics;
  final bool? instrumental;
  final MusicError? error;
  final int? createdAt;
  final int? completedAt;

  SunoMusic({
    this.id,
    this.object,
    this.title,
    this.status,
    this.duration,
    this.tags,
    this.genre,
    this.audioUrl,
    this.lyrics,
    this.instrumental,
    this.error,
    this.createdAt,
    this.completedAt
  });
}

class ModerationRequest {
  final String? model;
  final dynamic? input;
  final String? user;

  ModerationRequest({
    this.model,
    this.input,
    this.user
  });
}

class Categories {
  final bool? hate;
  final bool? sexual;
  final bool? violence;
  final bool? hateThreatening;
  final bool? selfHarm;
  final bool? sexualMinors;
  final bool? violenceGraphic;
  final bool? illegalAct;
  final bool? illegalActInstruction;

  Categories({
    this.hate,
    this.sexual,
    this.violence,
    this.hateThreatening,
    this.selfHarm,
    this.sexualMinors,
    this.violenceGraphic,
    this.illegalAct,
    this.illegalActInstruction
  });
}

class CategoryScores {
  final double? hate;
  final double? sexual;
  final double? violence;
  final double? hateThreatening;
  final double? selfHarm;
  final double? sexualMinors;
  final double? violenceGraphic;
  final double? illegalAct;
  final double? illegalActInstruction;

  CategoryScores({
    this.hate,
    this.sexual,
    this.violence,
    this.hateThreatening,
    this.selfHarm,
    this.sexualMinors,
    this.violenceGraphic,
    this.illegalAct,
    this.illegalActInstruction
  });
}

class ModerationResponse {
  final String? id;
  final String? model;
  final List<ModerationResult>? results;

  ModerationResponse({
    this.id,
    this.model,
    this.results
  });
}

class ModerationResult {
  final bool? flagged;
  final Categories? categories;
  final CategoryScores? categoryScores;

  ModerationResult({
    this.flagged,
    this.categories,
    this.categoryScores
  });
}

class ChunkConfig {
  final String? separator;
  final int? chunkSize;
  final int? chunkOverlap;

  ChunkConfig({
    this.separator,
    this.chunkSize,
    this.chunkOverlap
  });
}

class DocumentAddRequest {
  final String? content;
  final String? title;
  final String? type;
  final Map<String, dynamic>? metadata;
  final ChunkConfig? chunkConfig;
  final String? knowledgeBaseId;

  DocumentAddRequest({
    this.content,
    this.title,
    this.type,
    this.metadata,
    this.chunkConfig,
    this.knowledgeBaseId
  });
}

class DocumentResponse {
  final String? title;
  final String? type;
  final String? status;
  final Map<String, dynamic>? metadata;
  final String? documentId;
  final String? knowledgeBaseId;
  final int? chunkCount;
  final int? createdAt;
  final int? updatedAt;

  DocumentResponse({
    this.title,
    this.type,
    this.status,
    this.metadata,
    this.documentId,
    this.knowledgeBaseId,
    this.chunkCount,
    this.createdAt,
    this.updatedAt
  });
}

class Filter {
  final String? field;
  final String? op;
  final dynamic? value;

  Filter({
    this.field,
    this.op,
    this.value
  });
}

class KnowledgeSearchRequest {
  final String? query;
  final List<Filter>? filters;
  final String? knowledgeBaseId;
  final int? topK;
  final double? scoreThreshold;

  KnowledgeSearchRequest({
    this.query,
    this.filters,
    this.knowledgeBaseId,
    this.topK,
    this.scoreThreshold
  });
}

class KnowledgeSearchResponse {
  final List<SearchResult>? results;
  final int? total;

  KnowledgeSearchResponse({
    this.results,
    this.total
  });
}

class SearchResult {
  final String? content;
  final double? score;
  final Map<String, dynamic>? metadata;
  final String? documentId;
  final String? chunkId;

  SearchResult({
    this.content,
    this.score,
    this.metadata,
    this.documentId,
    this.chunkId
  });
}

class KnowledgeBaseCreateRequest {
  final String? name;
  final String? description;
  final Map<String, dynamic>? extra;
  final String? embeddingModelId;
  final String? indexType;

  KnowledgeBaseCreateRequest({
    this.name,
    this.description,
    this.extra,
    this.embeddingModelId,
    this.indexType
  });
}

class KnowledgeBaseResponse {
  final String? name;
  final String? description;
  final String? status;
  final String? knowledgeBaseId;
  final String? embeddingModelId;
  final String? indexType;
  final int? createdAt;
  final int? updatedAt;
  final int? docCount;

  KnowledgeBaseResponse({
    this.name,
    this.description,
    this.status,
    this.knowledgeBaseId,
    this.embeddingModelId,
    this.indexType,
    this.createdAt,
    this.updatedAt,
    this.docCount
  });
}

class ImageData {
  final String? url;
  final String? b64Json;
  final String? revisedPrompt;

  ImageData({
    this.url,
    this.b64Json,
    this.revisedPrompt
  });
}

class ImageGenerationResponse {
  final int? created;
  final List<ImageData>? data;

  ImageGenerationResponse({
    this.created,
    this.data
  });
}

class ImageGenerationRequest {
  final String? model;
  final String? prompt;
  final int? n;
  final String? quality;
  final String? size;
  final String? style;
  final String? user;
  final List<String>? image;
  final Map<String, dynamic>? extra;
  final String? responseFormat;

  ImageGenerationRequest({
    this.model,
    this.prompt,
    this.n,
    this.quality,
    this.size,
    this.style,
    this.user,
    this.image,
    this.extra,
    this.responseFormat
  });
}

class OpenAiFileObject {
  final String? id;
  final String? object;
  final int? bytes;
  final String? filename;
  final String? purpose;
  final String? status;
  final bool? deleted;
  final int? createdAt;
  final int? expiresAt;
  final String? statusDetails;

  OpenAiFileObject({
    this.id,
    this.object,
    this.bytes,
    this.filename,
    this.purpose,
    this.status,
    this.deleted,
    this.createdAt,
    this.expiresAt,
    this.statusDetails
  });
}

class EmbeddingRequest {
  final String? model;
  final dynamic? input;
  final int? dimensions;
  final String? user;
  final String? encodingFormat;

  EmbeddingRequest({
    this.model,
    this.input,
    this.dimensions,
    this.user,
    this.encodingFormat
  });
}

class Embedding {
  final String? object;
  final List<double>? embedding;
  final int? index;

  Embedding({
    this.object,
    this.embedding,
    this.index
  });
}

class EmbeddingResponse {
  final String? object;
  final List<Embedding>? data;
  final String? model;
  final Usage? usage;

  EmbeddingResponse({
    this.object,
    this.data,
    this.model,
    this.usage
  });
}

class ContextResponse {
  final String? id;
  final String? object;
  final int? created;
  final String? model;
  final String? mode;
  final int? ttl;
  final TruncationStrategy? truncationStrategy;
  final Usage? usage;

  ContextResponse({
    this.id,
    this.object,
    this.created,
    this.model,
    this.mode,
    this.ttl,
    this.truncationStrategy,
    this.usage
  });
}

class ContextCreateRequest {
  final String? model;
  final List<ContextMessage>? messages;
  final String? mode;
  final int? ttl;
  final TruncationStrategy? truncationStrategy;

  ContextCreateRequest({
    this.model,
    this.messages,
    this.mode,
    this.ttl,
    this.truncationStrategy
  });
}

class ContextMessage {
  final String? role;
  final String? content;
  final String? name;
  final List<ToolCall>? toolCalls;

  ContextMessage({
    this.role,
    this.content,
    this.name,
    this.toolCalls
  });
}

class Annotation {
  final String? type;
  final String? text;
  final FileCitation? fileCitation;

  Annotation({
    this.type,
    this.text,
    this.fileCitation
  });
}

class Audio {
  final String? id;
  final String? data;
  final String? transcript;
  final int? expiresAt;

  Audio({
    this.id,
    this.data,
    this.transcript,
    this.expiresAt
  });
}

class AudioParameters {
  final String? voice;
  final String? format;

  AudioParameters({
    this.voice,
    this.format
  });
}

class ChatCompletionRequest {
  final String? model;
  final List<ChatMessage>? messages;
  final double? temperature;
  final int? n;
  final bool? stream;
  final List<String>? stop;
  final String? user;
  final List<Tool>? tools;
  final double? seed;
  final List<String>? modalities;
  final AudioParameters? audio;
  final bool? store;
  final Map<String, String>? metadata;
  final Thinking? thinking;
  final double? topP;
  final int? maxTokens;
  final int? maxCompletionTokens;
  final double? presencePenalty;
  final double? frequencyPenalty;
  final Map<String, int>? logitBias;
  final ResponseFormat? responseFormat;
  final dynamic? toolChoice;
  final String? serviceTier;
  final StreamOptions? streamOptions;
  final String? reasoningEffort;
  final bool? parallelToolCalls;
  final bool? logprobs;
  final int? topLogprobs;

  ChatCompletionRequest({
    this.model,
    this.messages,
    this.temperature,
    this.n,
    this.stream,
    this.stop,
    this.user,
    this.tools,
    this.seed,
    this.modalities,
    this.audio,
    this.store,
    this.metadata,
    this.thinking,
    this.topP,
    this.maxTokens,
    this.maxCompletionTokens,
    this.presencePenalty,
    this.frequencyPenalty,
    this.logitBias,
    this.responseFormat,
    this.toolChoice,
    this.serviceTier,
    this.streamOptions,
    this.reasoningEffort,
    this.parallelToolCalls,
    this.logprobs,
    this.topLogprobs
  });
}

class ChatMessage {
  final String? role;
  final dynamic? content;
  final String? name;
  final String? refusal;
  final Audio? audio;
  final List<Annotation>? annotations;
  final List<ToolCall>? toolCalls;
  final String? toolCallId;

  ChatMessage({
    this.role,
    this.content,
    this.name,
    this.refusal,
    this.audio,
    this.annotations,
    this.toolCalls,
    this.toolCallId
  });
}

class FileCitation {
  final String? fileId;
  final String? quote;

  FileCitation({
    this.fileId,
    this.quote
  });
}

class JsonSchema {
  final String? name;
  final String? description;
  final dynamic? schema;
  final bool? strict;

  JsonSchema({
    this.name,
    this.description,
    this.schema,
    this.strict
  });
}

class ResponseFormat {
  final String? type;
  final JsonSchema? jsonSchema;

  ResponseFormat({
    this.type,
    this.jsonSchema
  });
}

class StreamOptions {
  final bool? includeUsage;
  final bool? chunkIncludeUsage;

  StreamOptions({
    this.includeUsage,
    this.chunkIncludeUsage
  });
}

class Thinking {
  final String? type;

  Thinking({
    this.type
  });
}

class Tool {
  final String? type;
  final Function? function;

  Tool({
    this.type,
    this.function
  });
}

class BatchResponse {
  final String? id;
  final String? object;
  final String? endpoint;
  final Errors? errors;
  final String? status;
  final Map<String, String>? metadata;
  final String? inputFileId;
  final String? outputFileId;
  final String? errorFileId;
  final int? createdAt;
  final String? completionWindow;
  final int? expiresAt;
  final int? startedAt;
  final int? completedAt;
  final int? failedAt;
  final int? expiredAt;
  final int? cancelledAt;
  final RequestCounts? requestCounts;

  BatchResponse({
    this.id,
    this.object,
    this.endpoint,
    this.errors,
    this.status,
    this.metadata,
    this.inputFileId,
    this.outputFileId,
    this.errorFileId,
    this.createdAt,
    this.completionWindow,
    this.expiresAt,
    this.startedAt,
    this.completedAt,
    this.failedAt,
    this.expiredAt,
    this.cancelledAt,
    this.requestCounts
  });
}

class ErrorObject {
  final String? code;
  final String? message;
  final int? line;
  final String? param;

  ErrorObject({
    this.code,
    this.message,
    this.line,
    this.param
  });
}

class Errors {
  final ErrorObject? object;
  final dynamic? data;

  Errors({
    this.object,
    this.data
  });
}

class RequestCounts {
  final int? total;
  final int? completed;
  final int? failed;

  RequestCounts({
    this.total,
    this.completed,
    this.failed
  });
}

class BatchCreateRequest {
  final String? endpoint;
  final Map<String, String>? metadata;
  final String? inputFileId;
  final String? completionWindow;

  BatchCreateRequest({
    this.endpoint,
    this.metadata,
    this.inputFileId,
    this.completionWindow
  });
}

class Segment {
  final int? id;
  final int? seek;
  final double? start;
  final double? end;
  final String? text;
  final List<int>? tokens;
  final double? temperature;
  final double? avgLogprob;
  final double? compressionRatio;
  final double? noSpeechProb;

  Segment({
    this.id,
    this.seek,
    this.start,
    this.end,
    this.text,
    this.tokens,
    this.temperature,
    this.avgLogprob,
    this.compressionRatio,
    this.noSpeechProb
  });
}

class TranscriptionResponse {
  final String? text;
  final String? task;
  final String? language;
  final double? duration;
  final List<Word>? words;
  final List<Segment>? segments;

  TranscriptionResponse({
    this.text,
    this.task,
    this.language,
    this.duration,
    this.words,
    this.segments
  });
}

class Word {
  final String? word;
  final double? start;
  final double? end;

  Word({
    this.word,
    this.start,
    this.end
  });
}

class SpeechRequest {
  final String? model;
  final String? input;
  final String? voice;
  final double? speed;
  final Map<String, dynamic>? extra;
  final String? responseFormat;

  SpeechRequest({
    this.model,
    this.input,
    this.voice,
    this.speed,
    this.extra,
    this.responseFormat
  });
}

class AssistantCreateRequest {
  final String? model;
  final String? name;
  final String? description;
  final String? instructions;
  final List<Tool>? tools;
  final Map<String, String>? metadata;
  final double? temperature;
  final Map<String, dynamic>? toolResources;
  final ResponseFormat? responseFormat;
  final double? topP;

  AssistantCreateRequest({
    this.model,
    this.name,
    this.description,
    this.instructions,
    this.tools,
    this.metadata,
    this.temperature,
    this.toolResources,
    this.responseFormat,
    this.topP
  });
}

class AssistantResponse {
  final String? id;
  final String? object;
  final String? model;
  final String? name;
  final String? description;
  final String? instructions;
  final List<dynamic>? tools;
  final Map<String, String>? metadata;
  final double? temperature;
  final int? createdAt;
  final Map<String, dynamic>? toolResources;
  final dynamic? responseFormat;
  final double? topP;

  AssistantResponse({
    this.id,
    this.object,
    this.model,
    this.name,
    this.description,
    this.instructions,
    this.tools,
    this.metadata,
    this.temperature,
    this.createdAt,
    this.toolResources,
    this.responseFormat,
    this.topP
  });
}

class OpenAiVideoList {
  final String? object;
  final List<OpenAiVideo>? data;

  OpenAiVideoList({
    this.object,
    this.data
  });
}

class RunStepResponse {
  final String? id;
  final String? object;
  final String? type;
  final String? status;
  final Map<String, String>? metadata;
  final int? createdAt;
  final String? assistantId;
  final String? threadId;
  final String? runId;
  final dynamic? stepDetails;
  final dynamic? lastError;
  final int? expiredAt;
  final int? cancelledAt;
  final int? failedAt;
  final int? completedAt;

  RunStepResponse({
    this.id,
    this.object,
    this.type,
    this.status,
    this.metadata,
    this.createdAt,
    this.assistantId,
    this.threadId,
    this.runId,
    this.stepDetails,
    this.lastError,
    this.expiredAt,
    this.cancelledAt,
    this.failedAt,
    this.completedAt
  });
}

class RunStepListResponse {
  final String? object;
  final List<RunStepResponse>? data;
  final bool? hasMore;
  final String? firstId;
  final String? lastId;

  RunStepListResponse({
    this.object,
    this.data,
    this.hasMore,
    this.firstId,
    this.lastId
  });
}

class RunListResponse {
  final String? object;
  final List<RunResponse>? data;
  final bool? hasMore;
  final String? firstId;
  final String? lastId;

  RunListResponse({
    this.object,
    this.data,
    this.hasMore,
    this.firstId,
    this.lastId
  });
}

class ThreadMessageListResponse {
  final String? object;
  final List<ThreadMessageResponse>? data;
  final bool? hasMore;
  final String? firstId;
  final String? lastId;

  ThreadMessageListResponse({
    this.object,
    this.data,
    this.hasMore,
    this.firstId,
    this.lastId
  });
}

class SunoMusicList {
  final String? object;
  final List<SunoMusic>? data;

  SunoMusicList({
    this.object,
    this.data
  });
}

class OpenAiModel {
  final String? id;
  final String? object;
  final int? created;
  final String? ownedBy;

  OpenAiModel({
    this.id,
    this.object,
    this.created,
    this.ownedBy
  });
}

class OpenAiModelList {
  final String? object;
  final List<OpenAiModel>? data;

  OpenAiModelList({
    this.object,
    this.data
  });
}

class ChatMessageList {
  final String? object;
  final List<ChatMessage>? data;
  final bool? hasMore;
  final String? firstId;
  final String? lastId;

  ChatMessageList({
    this.object,
    this.data,
    this.hasMore,
    this.firstId,
    this.lastId
  });
}

class ChatCompletionList {
  final String? object;
  final List<ChatCompletionResponse>? data;
  final bool? hasMore;
  final String? firstId;
  final String? lastId;

  ChatCompletionList({
    this.object,
    this.data,
    this.hasMore,
    this.firstId,
    this.lastId
  });
}

class KnowledgeBaseListResponse {
  final List<KnowledgeBaseResponse>? data;
  final int? total;
  final bool? hasMore;

  KnowledgeBaseListResponse({
    this.data,
    this.total,
    this.hasMore
  });
}

class OpenAiFileList {
  final List<OpenAiFileObject>? data;
  final String? object;
  final String? firstId;
  final String? lastId;
  final bool? hasMore;

  OpenAiFileList({
    this.data,
    this.object,
    this.firstId,
    this.lastId,
    this.hasMore
  });
}

class BatchListResponse {
  final String? object;
  final List<BatchResponse>? data;
  final bool? hasMore;
  final String? firstId;
  final String? lastId;

  BatchListResponse({
    this.object,
    this.data,
    this.hasMore,
    this.firstId,
    this.lastId
  });
}

class AssistantListResponse {
  final String? object;
  final List<AssistantResponse>? data;
  final bool? hasMore;
  final String? firstId;
  final String? lastId;

  AssistantListResponse({
    this.object,
    this.data,
    this.hasMore,
    this.firstId,
    this.lastId
  });
}

class OpenAiVideoDeleteResponse {
  final String? id;
  final String? object;
  final bool? deleted;

  OpenAiVideoDeleteResponse({
    this.id,
    this.object,
    this.deleted
  });
}

class ThreadDeleteResponse {
  final String? id;
  final String? object;
  final bool? deleted;

  ThreadDeleteResponse({
    this.id,
    this.object,
    this.deleted
  });
}

class SunoMusicDeleteResponse {
  final String? id;
  final String? object;
  final bool? deleted;

  SunoMusicDeleteResponse({
    this.id,
    this.object,
    this.deleted
  });
}

class OpenAiModelDeleteResponse {
  final String? id;
  final String? object;
  final bool? deleted;

  OpenAiModelDeleteResponse({
    this.id,
    this.object,
    this.deleted
  });
}

class ChatCompletionDeleteResponse {
  final String? id;
  final String? object;
  final bool? deleted;

  ChatCompletionDeleteResponse({
    this.id,
    this.object,
    this.deleted
  });
}

class OpenAiFileDeleteResponse {
  final String? id;
  final String? object;
  final bool? deleted;

  OpenAiFileDeleteResponse({
    this.id,
    this.object,
    this.deleted
  });
}

class AssistantDeleteResponse {
  final String? id;
  final String? object;
  final bool? deleted;

  AssistantDeleteResponse({
    this.id,
    this.object,
    this.deleted
  });
}

class UpdateCompletionRequest {


  UpdateCompletionRequest({

  });
}

class UpdateCompletionPatchRequest {


  UpdateCompletionPatchRequest({

  });
}

class UpdateCompletionPostRequest {


  UpdateCompletionPostRequest({

  });
}

class PatchUpdateCompletionRequest {


  PatchUpdateCompletionRequest({

  });
}

class SubmitToolOutputsRequest {


  SubmitToolOutputsRequest({

  });
}

class SubmitToolOutputsResponse {


  SubmitToolOutputsResponse({

  });
}

class SubmitToolOutputsPostRequest {


  SubmitToolOutputsPostRequest({

  });
}

class SubmitToolOutputsPostResponse {


  SubmitToolOutputsPostResponse({

  });
}

class UpdateRunRequest {


  UpdateRunRequest({

  });
}

class UpdateRunPostRequest {


  UpdateRunPostRequest({

  });
}

class CreateRunResponse {


  CreateRunResponse({

  });
}

class CreateRunPostResponse {


  CreateRunPostResponse({

  });
}

class CreateThreadAndRunResponse {


  CreateThreadAndRunResponse({

  });
}

class CreateThreadAndRunPostResponse {


  CreateThreadAndRunPostResponse({

  });
}

class CancelResponseResponse {


  CancelResponseResponse({

  });
}

class CancelResponsePostResponse {


  CancelResponsePostResponse({

  });
}

class CreateResponseRequest {


  CreateResponseRequest({

  });
}

class CreateResponseResponse {


  CreateResponseResponse({

  });
}

class CreateResponsePostRequest {


  CreateResponsePostRequest({

  });
}

class CreateResponsePostResponse {


  CreateResponsePostResponse({

  });
}

class CountClaudeTokensRequest {


  CountClaudeTokensRequest({

  });
}

class CountClaudeTokensResponse {


  CountClaudeTokensResponse({

  });
}

class CountClaudeTokensPostRequest {


  CountClaudeTokensPostRequest({

  });
}

class CountClaudeTokensPostResponse {


  CountClaudeTokensPostResponse({

  });
}

class CreateClaudeMessageRequest {


  CreateClaudeMessageRequest({

  });
}

class CreateClaudeMessageResponse {


  CreateClaudeMessageResponse({

  });
}

class CreateClaudeMessagePostRequest {


  CreateClaudeMessagePostRequest({

  });
}

class CreateClaudeMessagePostResponse {


  CreateClaudeMessagePostResponse({

  });
}

class UpdateChatCompletionRequest {


  UpdateChatCompletionRequest({

  });
}

class UpdateChatCompletionPostRequest {


  UpdateChatCompletionPostRequest({

  });
}

class ListDocumentsResponse {


  ListDocumentsResponse({

  });
}

class ListDocumentsGetResponse {


  ListDocumentsGetResponse({

  });
}

class CreateImageVariationRequest {
  final List<String>? image;
  final List<String>? image;

  CreateImageVariationRequest({
    this.image,
    this.image
  });
}

class CreateImageVariationPostRequest {
  final List<String>? image;
  final List<String>? image;

  CreateImageVariationPostRequest({
    this.image,
    this.image
  });
}

class CreateImageEditRequest {
  final List<String>? image;
  final List<String>? image;
  final String? mask;

  CreateImageEditRequest({
    this.image,
    this.image,
    this.mask
  });
}

class CreateImageEditPostRequest {
  final List<String>? image;
  final List<String>? image;
  final String? mask;

  CreateImageEditPostRequest({
    this.image,
    this.image,
    this.mask
  });
}

class UploadFileRequest {
  final String? file;

  UploadFileRequest({
    this.file
  });
}

class UploadFilePostRequest {
  final String? file;

  UploadFilePostRequest({
    this.file
  });
}

class ChatWithContextRequest {


  ChatWithContextRequest({

  });
}

class ChatWithContextPostRequest {


  ChatWithContextPostRequest({

  });
}

class CreateChatCompletionResponse {


  CreateChatCompletionResponse({

  });
}

class CreateChatCompletionPostResponse {


  CreateChatCompletionPostResponse({

  });
}

class CreateTranslationRequest {
  final String? file;

  CreateTranslationRequest({
    this.file
  });
}

class CreateTranslationPostRequest {
  final String? file;

  CreateTranslationPostRequest({
    this.file
  });
}

class CreateTranscriptionRequest {
  final String? file;

  CreateTranscriptionRequest({
    this.file
  });
}

class CreateTranscriptionPostRequest {
  final String? file;

  CreateTranscriptionPostRequest({
    this.file
  });
}

class ListResponseInputItemsResponse {


  ListResponseInputItemsResponse({

  });
}

class ListResponseInputItemsGetResponse {


  ListResponseInputItemsGetResponse({

  });
}

class GetResponseResponse {


  GetResponseResponse({

  });
}

class DeleteResponseResponse {


  DeleteResponseResponse({

  });
}

class GetResponseGetResponse {


  GetResponseGetResponse({

  });
}

class DeleteResponseDeleteResponse {


  DeleteResponseDeleteResponse({

  });
}
