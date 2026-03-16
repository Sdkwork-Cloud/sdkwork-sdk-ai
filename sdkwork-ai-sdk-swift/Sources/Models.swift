import Foundation

struct LabelOption: Codable {
    let label: String?
    let value: String?
    let description: String?
}

struct PlusApiResultListLabelOption: Codable {
    let data: [LabelOption]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ChatCompletionResponse: Codable {
    let id: String?
    let object: String?
    let created: Int?
    let model: String?
    let choices: [Choice]?
    let usage: Usage?
    let systemFingerprint: String?
    let serviceTier: String?
}

struct Choice: Codable {
    let index: Int?
    let message: Message?
    let logprobs: Logprobs?
    let finishReason: String?
    let moderationHitType: String?
}

struct CompletionTokensDetails: Codable {
    let reasoningTokens: Int?
    let audioTokens: Int?
    let acceptedPredictionTokens: Int?
    let rejectedPredictionTokens: Int?
}

struct Content: Codable {
    let token: String?
    let logprob: Double?
    let bytes: [Int]?
    let topLogprobs: [TopLogprob]?
}

struct FunctionCall: Codable {
    let name: String?
    let arguments: String?
}

struct Logprobs: Codable {
    let content: [Content]?
    let refusal: [Content]?
}

struct Message: Codable {
    let role: String?
    let content: Any?
    let refusal: String?
    let annotations: [Any]?
    let reasoningContent: String?
    let toolCalls: [ToolCall]?
}

struct PromptTokensDetails: Codable {
    let cachedTokens: Int?
    let audioTokens: Int?
}

struct ToolCall: Codable {
    let id: String?
    let type: String?
    let function: FunctionCall?
}

struct TopLogprob: Codable {
    let token: String?
    let logprob: Double?
    let bytes: [Int]?
}

struct Usage: Codable {
    let promptTokens: Int?
    let completionTokens: Int?
    let totalTokens: Int?
    let promptTokensDetails: PromptTokensDetails?
    let completionTokensDetails: CompletionTokensDetails?
}

struct VideoGenerationRequest: Codable {
    let prompt: String?
    let model: String?
    let seconds: String?
    let size: String?
    let quality: String?
    let width: Int?
    let height: Int?
    let seed: Int?
    let user: String?
    let negativePrompt: String?
    let imageUrls: [String]?
    let aspectRatio: String?
    let responseFormat: String?
}

struct OpenAiVideo: Codable {
    let id: String?
    let object: String?
    let model: String?
    let status: String?
    let progress: Int?
    let prompt: String?
    let seconds: String?
    let size: String?
    let quality: String?
    let error: VideoError?
    let createdAt: Int?
    let completedAt: Int?
    let expiresAt: Int?
    let outputUrl: String?
    let remixedFromVideoId: String?
}

struct VideoError: Codable {
    let code: String?
    let message: String?
    let type: String?
    let param: String?
}

struct Function: Codable {
    let name: String?
    let arguments: String?
}

struct LastError: Codable {
    let code: String?
    let message: String?
}

struct RequiredAction: Codable {
    let type: String?
    let submitToolOutputs: SubmitToolOutputs?
}

struct RunResponse: Codable {
    let id: String?
    let object: String?
    let status: String?
    let model: String?
    let instructions: String?
    let tools: [Any]?
    let metadata: [String: String]?
    let usage: Usage?
    let temperature: Double?
    let createdAt: Int?
    let threadId: String?
    let assistantId: String?
    let requiredAction: RequiredAction?
    let lastError: LastError?
    let expiresAt: Int?
    let startedAt: Int?
    let cancelledAt: Int?
    let failedAt: Int?
    let completedAt: Int?
    let toolResources: [String: Any]?
    let topP: Double?
    let maxPromptTokens: Int?
    let maxCompletionTokens: Int?
    let truncationStrategy: Any?
}

struct SubmitToolOutputs: Codable {
    let toolCalls: [ToolCall]?
}

struct RunCreateRequest: Codable {
    let model: String?
    let instructions: String?
    let tools: [Any]?
    let metadata: [String: String]?
    let temperature: Double?
    let stream: Bool?
    let assistantId: String?
    let additionalInstructions: String?
    let additionalMessages: [[String: Any]]?
    let toolResources: [String: Any]?
    let topP: Double?
    let maxPromptTokens: Int?
    let maxCompletionTokens: Int?
    let truncationStrategy: TruncationStrategy?
}

struct TruncationStrategy: Codable {
    let type: String?
    let lastMessages: Int?
}

struct ThreadMessageModifyRequest: Codable {
    let metadata: [String: String]?
}

struct ContentBlock: Codable {
    let type: String?
    let text: TextContent?
    let imageFile: ImageFileContent?
}

struct ImageFileContent: Codable {
    let fileId: String?
}

struct TextContent: Codable {
    let value: String?
    let annotations: [Any]?
}

struct ThreadMessageResponse: Codable {
    let id: String?
    let object: String?
    let role: String?
    let status: String?
    let content: [ContentBlock]?
    let metadata: [String: String]?
    let createdAt: Int?
    let threadId: String?
    let incompleteDetails: Any?
    let completedAt: Int?
    let incompleteAt: Int?
    let assistantId: String?
    let runId: String?
    let fileIds: [String]?
}

struct Attachment: Codable {
    let tools: [[String: Any]]?
    let fileId: String?
}

struct ThreadMessageCreateRequest: Codable {
    let role: String?
    let content: Any?
    let attachments: [Attachment]?
    let metadata: [String: String]?
}

struct ThreadCreateRequest: Codable {
    let messages: [Message]?
    let metadata: [String: String]?
    let toolResources: [String: Any]?
}

struct ThreadResponse: Codable {
    let id: String?
    let object: String?
    let metadata: [String: String]?
    let createdAt: Int?
    let toolResources: [String: Any]?
}

struct ThreadRunCreateRequest: Codable {
    let model: String?
    let instructions: String?
    let tools: [Any]?
    let metadata: [String: String]?
    let temperature: Double?
    let stream: Bool?
    let thread: ThreadCreateRequest?
    let assistantId: String?
    let additionalInstructions: String?
    let additionalMessages: [[String: Any]]?
    let toolResources: [String: Any]?
    let topP: Double?
    let maxPromptTokens: Int?
    let maxCompletionTokens: Int?
    let truncationStrategy: TruncationStrategy?
}

struct Document: Codable {
    let content: String?
    let metadata: Any?
}

struct RerankRequest: Codable {
    let query: String?
    let documents: [Document]?
    let model: String?
    let topN: Int?
    let returnDocuments: Bool?
}

struct RerankResponse: Codable {
    let id: String?
    let object: String?
    let model: String?
    let results: [Result]?
    let usage: Usage?
}

struct Result: Codable {
    let index: Int?
    let score: Double?
    let document: String?
}

struct MusicGenerationRequest: Codable {
    let model: String?
    let prompt: String?
    let duration: Int?
    let format: String?
    let n: Int?
    let style: String?
    let metadata: [String: String]?
    let negativePrompt: String?
    let responseFormat: String?
    let referenceAudio: String?
}

struct MusicError: Codable {
    let code: String?
    let message: String?
}

struct SunoMusic: Codable {
    let id: String?
    let object: String?
    let title: String?
    let status: String?
    let duration: Int?
    let tags: [String]?
    let genre: String?
    let audioUrl: String?
    let lyrics: String?
    let instrumental: Bool?
    let error: MusicError?
    let createdAt: Int?
    let completedAt: Int?
}

struct ModerationRequest: Codable {
    let model: String?
    let input: Any?
    let user: String?
}

struct Categories: Codable {
    let hate: Bool?
    let sexual: Bool?
    let violence: Bool?
    let hateThreatening: Bool?
    let selfHarm: Bool?
    let sexualMinors: Bool?
    let violenceGraphic: Bool?
    let illegalAct: Bool?
    let illegalActInstruction: Bool?
}

struct CategoryScores: Codable {
    let hate: Double?
    let sexual: Double?
    let violence: Double?
    let hateThreatening: Double?
    let selfHarm: Double?
    let sexualMinors: Double?
    let violenceGraphic: Double?
    let illegalAct: Double?
    let illegalActInstruction: Double?
}

struct ModerationResponse: Codable {
    let id: String?
    let model: String?
    let results: [ModerationResult]?
}

struct ModerationResult: Codable {
    let flagged: Bool?
    let categories: Categories?
    let categoryScores: CategoryScores?
}

struct ChunkConfig: Codable {
    let separator: String?
    let chunkSize: Int?
    let chunkOverlap: Int?
}

struct DocumentAddRequest: Codable {
    let content: String?
    let title: String?
    let type: String?
    let metadata: [String: Any]?
    let chunkConfig: ChunkConfig?
    let knowledgeBaseId: String?
}

struct DocumentResponse: Codable {
    let title: String?
    let type: String?
    let status: String?
    let metadata: [String: Any]?
    let documentId: String?
    let knowledgeBaseId: String?
    let chunkCount: Int?
    let createdAt: Int?
    let updatedAt: Int?
}

struct Filter: Codable {
    let field: String?
    let op: String?
    let value: Any?
}

struct KnowledgeSearchRequest: Codable {
    let query: String?
    let filters: [Filter]?
    let knowledgeBaseId: String?
    let topK: Int?
    let scoreThreshold: Double?
}

struct KnowledgeSearchResponse: Codable {
    let results: [SearchResult]?
    let total: Int?
}

struct SearchResult: Codable {
    let content: String?
    let score: Double?
    let metadata: [String: Any]?
    let documentId: String?
    let chunkId: String?
}

struct KnowledgeBaseCreateRequest: Codable {
    let name: String?
    let description: String?
    let extra: [String: Any]?
    let embeddingModelId: String?
    let indexType: String?
}

struct KnowledgeBaseResponse: Codable {
    let name: String?
    let description: String?
    let status: String?
    let knowledgeBaseId: String?
    let embeddingModelId: String?
    let indexType: String?
    let createdAt: Int?
    let updatedAt: Int?
    let docCount: Int?
}

struct ImageData: Codable {
    let url: String?
    let b64Json: String?
    let revisedPrompt: String?
}

struct ImageGenerationResponse: Codable {
    let created: Int?
    let data: [ImageData]?
}

struct ImageGenerationRequest: Codable {
    let model: String?
    let prompt: String?
    let n: Int?
    let quality: String?
    let size: String?
    let style: String?
    let user: String?
    let image: [String]?
    let extra: [String: Any]?
    let responseFormat: String?
}

struct OpenAiFileObject: Codable {
    let id: String?
    let object: String?
    let bytes: Int?
    let filename: String?
    let purpose: String?
    let status: String?
    let deleted: Bool?
    let createdAt: Int?
    let expiresAt: Int?
    let statusDetails: String?
}

struct EmbeddingRequest: Codable {
    let model: String?
    let input: Any?
    let dimensions: Int?
    let user: String?
    let encodingFormat: String?
}

struct Embedding: Codable {
    let object: String?
    let embedding: [Double]?
    let index: Int?
}

struct EmbeddingResponse: Codable {
    let object: String?
    let data: [Embedding]?
    let model: String?
    let usage: Usage?
}

struct ContextResponse: Codable {
    let id: String?
    let object: String?
    let created: Int?
    let model: String?
    let mode: String?
    let ttl: Int?
    let truncationStrategy: TruncationStrategy?
    let usage: Usage?
}

struct ContextCreateRequest: Codable {
    let model: String?
    let messages: [ContextMessage]?
    let mode: String?
    let ttl: Int?
    let truncationStrategy: TruncationStrategy?
}

struct ContextMessage: Codable {
    let role: String?
    let content: String?
    let name: String?
    let toolCalls: [ToolCall]?
}

struct Annotation: Codable {
    let type: String?
    let text: String?
    let fileCitation: FileCitation?
}

struct Audio: Codable {
    let id: String?
    let data: String?
    let transcript: String?
    let expiresAt: Int?
}

struct AudioParameters: Codable {
    let voice: String?
    let format: String?
}

struct ChatCompletionRequest: Codable {
    let model: String?
    let messages: [ChatMessage]?
    let temperature: Double?
    let n: Int?
    let stream: Bool?
    let stop: [String]?
    let user: String?
    let tools: [Tool]?
    let seed: Double?
    let modalities: [String]?
    let audio: AudioParameters?
    let store: Bool?
    let metadata: [String: String]?
    let thinking: Thinking?
    let topP: Double?
    let maxTokens: Int?
    let maxCompletionTokens: Int?
    let presencePenalty: Double?
    let frequencyPenalty: Double?
    let logitBias: [String: Int]?
    let responseFormat: ResponseFormat?
    let toolChoice: Any?
    let serviceTier: String?
    let streamOptions: StreamOptions?
    let reasoningEffort: String?
    let parallelToolCalls: Bool?
    let logprobs: Bool?
    let topLogprobs: Int?
}

struct ChatMessage: Codable {
    let role: String?
    let content: Any?
    let name: String?
    let refusal: String?
    let audio: Audio?
    let annotations: [Annotation]?
    let toolCalls: [ToolCall]?
    let toolCallId: String?
}

struct FileCitation: Codable {
    let fileId: String?
    let quote: String?
}

struct JsonSchema: Codable {
    let name: String?
    let description: String?
    let schema: Any?
    let strict: Bool?
}

struct ResponseFormat: Codable {
    let type: String?
    let jsonSchema: JsonSchema?
}

struct StreamOptions: Codable {
    let includeUsage: Bool?
    let chunkIncludeUsage: Bool?
}

struct Thinking: Codable {
    let type: String?
}

struct Tool: Codable {
    let type: String?
    let function: Function?
}

struct BatchResponse: Codable {
    let id: String?
    let object: String?
    let endpoint: String?
    let errors: Errors?
    let status: String?
    let metadata: [String: String]?
    let inputFileId: String?
    let outputFileId: String?
    let errorFileId: String?
    let createdAt: Int?
    let completionWindow: String?
    let expiresAt: Int?
    let startedAt: Int?
    let completedAt: Int?
    let failedAt: Int?
    let expiredAt: Int?
    let cancelledAt: Int?
    let requestCounts: RequestCounts?
}

struct ErrorObject: Codable {
    let code: String?
    let message: String?
    let line: Int?
    let param: String?
}

struct Errors: Codable {
    let object: ErrorObject?
    let data: Any?
}

struct RequestCounts: Codable {
    let total: Int?
    let completed: Int?
    let failed: Int?
}

struct BatchCreateRequest: Codable {
    let endpoint: String?
    let metadata: [String: String]?
    let inputFileId: String?
    let completionWindow: String?
}

struct Segment: Codable {
    let id: Int?
    let seek: Int?
    let start: Double?
    let end: Double?
    let text: String?
    let tokens: [Int]?
    let temperature: Double?
    let avgLogprob: Double?
    let compressionRatio: Double?
    let noSpeechProb: Double?
}

struct TranscriptionResponse: Codable {
    let text: String?
    let task: String?
    let language: String?
    let duration: Double?
    let words: [Word]?
    let segments: [Segment]?
}

struct Word: Codable {
    let word: String?
    let start: Double?
    let end: Double?
}

struct SpeechRequest: Codable {
    let model: String?
    let input: String?
    let voice: String?
    let speed: Double?
    let extra: [String: Any]?
    let responseFormat: String?
}

struct AssistantCreateRequest: Codable {
    let model: String?
    let name: String?
    let description: String?
    let instructions: String?
    let tools: [Tool]?
    let metadata: [String: String]?
    let temperature: Double?
    let toolResources: [String: Any]?
    let responseFormat: ResponseFormat?
    let topP: Double?
}

struct AssistantResponse: Codable {
    let id: String?
    let object: String?
    let model: String?
    let name: String?
    let description: String?
    let instructions: String?
    let tools: [Any]?
    let metadata: [String: String]?
    let temperature: Double?
    let createdAt: Int?
    let toolResources: [String: Any]?
    let responseFormat: Any?
    let topP: Double?
}

struct OpenAiVideoList: Codable {
    let object: String?
    let data: [OpenAiVideo]?
}

struct RunStepResponse: Codable {
    let id: String?
    let object: String?
    let type: String?
    let status: String?
    let metadata: [String: String]?
    let createdAt: Int?
    let assistantId: String?
    let threadId: String?
    let runId: String?
    let stepDetails: Any?
    let lastError: Any?
    let expiredAt: Int?
    let cancelledAt: Int?
    let failedAt: Int?
    let completedAt: Int?
}

struct RunStepListResponse: Codable {
    let object: String?
    let data: [RunStepResponse]?
    let hasMore: Bool?
    let firstId: String?
    let lastId: String?
}

struct RunListResponse: Codable {
    let object: String?
    let data: [RunResponse]?
    let hasMore: Bool?
    let firstId: String?
    let lastId: String?
}

struct ThreadMessageListResponse: Codable {
    let object: String?
    let data: [ThreadMessageResponse]?
    let hasMore: Bool?
    let firstId: String?
    let lastId: String?
}

struct SunoMusicList: Codable {
    let object: String?
    let data: [SunoMusic]?
}

struct OpenAiModel: Codable {
    let id: String?
    let object: String?
    let created: Int?
    let ownedBy: String?
}

struct OpenAiModelList: Codable {
    let object: String?
    let data: [OpenAiModel]?
}

struct ChatMessageList: Codable {
    let object: String?
    let data: [ChatMessage]?
    let hasMore: Bool?
    let firstId: String?
    let lastId: String?
}

struct ChatCompletionList: Codable {
    let object: String?
    let data: [ChatCompletionResponse]?
    let hasMore: Bool?
    let firstId: String?
    let lastId: String?
}

struct KnowledgeBaseListResponse: Codable {
    let data: [KnowledgeBaseResponse]?
    let total: Int?
    let hasMore: Bool?
}

struct OpenAiFileList: Codable {
    let data: [OpenAiFileObject]?
    let object: String?
    let firstId: String?
    let lastId: String?
    let hasMore: Bool?
}

struct BatchListResponse: Codable {
    let object: String?
    let data: [BatchResponse]?
    let hasMore: Bool?
    let firstId: String?
    let lastId: String?
}

struct AssistantListResponse: Codable {
    let object: String?
    let data: [AssistantResponse]?
    let hasMore: Bool?
    let firstId: String?
    let lastId: String?
}

struct OpenAiVideoDeleteResponse: Codable {
    let id: String?
    let object: String?
    let deleted: Bool?
}

struct ThreadDeleteResponse: Codable {
    let id: String?
    let object: String?
    let deleted: Bool?
}

struct SunoMusicDeleteResponse: Codable {
    let id: String?
    let object: String?
    let deleted: Bool?
}

struct OpenAiModelDeleteResponse: Codable {
    let id: String?
    let object: String?
    let deleted: Bool?
}

struct ChatCompletionDeleteResponse: Codable {
    let id: String?
    let object: String?
    let deleted: Bool?
}

struct OpenAiFileDeleteResponse: Codable {
    let id: String?
    let object: String?
    let deleted: Bool?
}

struct AssistantDeleteResponse: Codable {
    let id: String?
    let object: String?
    let deleted: Bool?
}

struct UpdateCompletionRequest: Codable {

}

struct UpdateCompletionPatchRequest: Codable {

}

struct UpdateCompletionPostRequest: Codable {

}

struct PatchUpdateCompletionRequest: Codable {

}

struct SubmitToolOutputsRequest: Codable {

}

struct SubmitToolOutputsResponse: Codable {

}

struct SubmitToolOutputsPostRequest: Codable {

}

struct SubmitToolOutputsPostResponse: Codable {

}

struct UpdateRunRequest: Codable {

}

struct UpdateRunPostRequest: Codable {

}

struct CreateRunResponse: Codable {

}

struct CreateRunPostResponse: Codable {

}

struct CreateThreadAndRunResponse: Codable {

}

struct CreateThreadAndRunPostResponse: Codable {

}

struct CancelResponseResponse: Codable {

}

struct CancelResponsePostResponse: Codable {

}

struct CreateResponseRequest: Codable {

}

struct CreateResponseResponse: Codable {

}

struct CreateResponsePostRequest: Codable {

}

struct CreateResponsePostResponse: Codable {

}

struct CountClaudeTokensRequest: Codable {

}

struct CountClaudeTokensResponse: Codable {

}

struct CountClaudeTokensPostRequest: Codable {

}

struct CountClaudeTokensPostResponse: Codable {

}

struct CreateClaudeMessageRequest: Codable {

}

struct CreateClaudeMessageResponse: Codable {

}

struct CreateClaudeMessagePostRequest: Codable {

}

struct CreateClaudeMessagePostResponse: Codable {

}

struct UpdateChatCompletionRequest: Codable {

}

struct UpdateChatCompletionPostRequest: Codable {

}

struct ListDocumentsResponse: Codable {

}

struct ListDocumentsGetResponse: Codable {

}

struct CreateImageVariationRequest: Codable {
    let image: [String]?
    let image: [String]?
}

struct CreateImageVariationPostRequest: Codable {
    let image: [String]?
    let image: [String]?
}

struct CreateImageEditRequest: Codable {
    let image: [String]?
    let image: [String]?
    let mask: String?
}

struct CreateImageEditPostRequest: Codable {
    let image: [String]?
    let image: [String]?
    let mask: String?
}

struct UploadFileRequest: Codable {
    let file: String?
}

struct UploadFilePostRequest: Codable {
    let file: String?
}

struct ChatWithContextRequest: Codable {

}

struct ChatWithContextPostRequest: Codable {

}

struct CreateChatCompletionResponse: Codable {

}

struct CreateChatCompletionPostResponse: Codable {

}

struct CreateTranslationRequest: Codable {
    let file: String?
}

struct CreateTranslationPostRequest: Codable {
    let file: String?
}

struct CreateTranscriptionRequest: Codable {
    let file: String?
}

struct CreateTranscriptionPostRequest: Codable {
    let file: String?
}

struct ListResponseInputItemsResponse: Codable {

}

struct ListResponseInputItemsGetResponse: Codable {

}

struct GetResponseResponse: Codable {

}

struct DeleteResponseResponse: Codable {

}

struct GetResponseGetResponse: Codable {

}

struct DeleteResponseDeleteResponse: Codable {

}
