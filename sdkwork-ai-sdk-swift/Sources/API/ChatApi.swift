import Foundation

public class ChatApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Get chat completion
    public func getCompletion(completion_id: String) async throws -> ChatCompletionResponse? {
        let response = try await client.get(ApiPaths.aiPath("/chat/completions/\(completion_id)"))
        return response as? ChatCompletionResponse
    }

    /// Update chat completion
    public func createUpdateCompletion(completion_id: String, body: UpdateCompletionPostRequest) async throws -> ChatCompletionResponse? {
        let response = try await client.post(ApiPaths.aiPath("/chat/completions/\(completion_id)"), body: body)
        return response as? ChatCompletionResponse
    }

    /// Delete chat completion
    public func deleteCompletion(completion_id: String) async throws -> ChatCompletionDeleteResponse? {
        let response = try await client.delete(ApiPaths.aiPath("/chat/completions/\(completion_id)"))
        return response as? ChatCompletionDeleteResponse
    }

    /// Update chat completion
    public func patchUpdateCompletion(completion_id: String, body: UpdateCompletionPatchRequest) async throws -> ChatCompletionResponse? {
        let response = try await client.patch(ApiPaths.aiPath("/v1/chat/completions/\(completion_id)"), body: body)
        return response as? ChatCompletionResponse
    }

    /// Update chat completion
    public func patchUpdateCompletionChat(completion_id: String, body: PatchUpdateCompletionRequest) async throws -> ChatCompletionResponse? {
        let response = try await client.patch(ApiPaths.aiPath("/chat/completions/\(completion_id)"), body: body)
        return response as? ChatCompletionResponse
    }

    /// Get chat completion
    public func getChatCompletion(completion_id: String) async throws -> ChatCompletionResponse? {
        let response = try await client.get(ApiPaths.aiPath("/management/chat/completions/\(completion_id)"))
        return response as? ChatCompletionResponse
    }

    /// Update chat completion
    public func updateChatCompletion(completion_id: String, body: UpdateChatCompletionRequest) async throws -> ChatCompletionResponse? {
        let response = try await client.post(ApiPaths.aiPath("/management/chat/completions/\(completion_id)"), body: body)
        return response as? ChatCompletionResponse
    }

    /// Delete chat completion
    public func deleteChatCompletion(completion_id: String) async throws -> ChatCompletionDeleteResponse? {
        let response = try await client.delete(ApiPaths.aiPath("/management/chat/completions/\(completion_id)"))
        return response as? ChatCompletionDeleteResponse
    }

    /// List chat completions
    public func listCompletions(params: [String: Any]? = nil) async throws -> ChatCompletionList? {
        let response = try await client.get(ApiPaths.aiPath("/chat/completions"), params: params)
        return response as? ChatCompletionList
    }

    /// Create chat completion
    public func createChatCompletion(body: ChatCompletionRequest) async throws -> CreateChatCompletionResponse? {
        let response = try await client.post(ApiPaths.aiPath("/chat/completions"), body: body)
        return response as? CreateChatCompletionResponse
    }

    /// Get chat messages
    public func getChatMessages(completion_id: String, params: [String: Any]? = nil) async throws -> ChatMessageList? {
        let response = try await client.get(ApiPaths.aiPath("/management/chat/completions/\(completion_id)/messages"), params: params)
        return response as? ChatMessageList
    }

    /// List chat completions
    public func listChatCompletions(params: [String: Any]? = nil) async throws -> ChatCompletionList? {
        let response = try await client.get(ApiPaths.aiPath("/management/chat/completions"), params: params)
        return response as? ChatCompletionList
    }

    /// Get chat completion messages
    public func getMessages(completion_id: String, params: [String: Any]? = nil) async throws -> ChatMessageList? {
        let response = try await client.get(ApiPaths.aiPath("/chat/completions/\(completion_id)/messages"), params: params)
        return response as? ChatMessageList
    }
}
