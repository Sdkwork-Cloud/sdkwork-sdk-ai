import Foundation

public class ChatCompletionsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Get chat completion
    public func getChatCompletion(completionId: String) async throws -> ChatCompletionResponse? {
        let response = try await client.get(ApiPaths.aiPath("/management/chat/completions/\(completionId)"))
        return response as? ChatCompletionResponse
    }

    /// Update chat completion
    public func updateChatCompletion(completionId: String, body: UpdateChatCompletionRequest) async throws -> ChatCompletionResponse? {
        let response = try await client.post(ApiPaths.aiPath("/management/chat/completions/\(completionId)"), body: body)
        return response as? ChatCompletionResponse
    }

    /// Delete chat completion
    public func deleteChatCompletion(completionId: String) async throws -> ChatCompletionDeleteResponse? {
        let response = try await client.delete(ApiPaths.aiPath("/management/chat/completions/\(completionId)"))
        return response as? ChatCompletionDeleteResponse
    }

    /// Get chat messages
    public func getChatMessages(completionId: String, params: [String: Any]? = nil) async throws -> ChatMessageList? {
        let response = try await client.get(ApiPaths.aiPath("/management/chat/completions/\(completionId)/messages"), params: params)
        return response as? ChatMessageList
    }

    /// List chat completions
    public func listChatCompletions(params: [String: Any]? = nil) async throws -> ChatCompletionList? {
        let response = try await client.get(ApiPaths.aiPath("/management/chat/completions"), params: params)
        return response as? ChatCompletionList
    }
}
