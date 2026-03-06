import Foundation

public class Chat2Api {
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
    public func updateCompletion(completion_id: String, body: UpdateCompletionPostRequest) async throws -> ChatCompletionResponse? {
        let response = try await client.post(ApiPaths.aiPath("/chat/completions/\(completion_id)"), body: body)
        return response as? ChatCompletionResponse
    }

    /// Delete chat completion
    public func deleteCompletion(completion_id: String) async throws -> ChatCompletionDeleteResponse? {
        let response = try await client.delete(ApiPaths.aiPath("/chat/completions/\(completion_id)"))
        return response as? ChatCompletionDeleteResponse
    }

    /// Update chat completion
    public func patchUpdateCompletion(completion_id: String, body: PatchUpdateCompletionRequest) async throws -> ChatCompletionResponse? {
        let response = try await client.patch(ApiPaths.aiPath("/chat/completions/\(completion_id)"), body: body)
        return response as? ChatCompletionResponse
    }

    /// Count Claude tokens
    public func countClaudeTokens(body: CountClaudeTokensPostRequest) async throws -> CountClaudeTokensPostResponse? {
        let response = try await client.post(ApiPaths.aiPath("/messages/count_tokens"), body: body)
        return response as? CountClaudeTokensPostResponse
    }

    /// Create Claude message
    public func createClaudeMessage(body: CreateClaudeMessageRequest, headers: [String: String]? = nil) async throws -> CreateClaudeMessageResponse? {
        let response = try await client.post(ApiPaths.aiPath("/messages"), body: body, params: nil, headers: headers)
        return response as? CreateClaudeMessageResponse
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

    /// Get chat completion messages
    public func getMessages(completion_id: String, params: [String: Any]? = nil) async throws -> ChatMessageList? {
        let response = try await client.get(ApiPaths.aiPath("/chat/completions/\(completion_id)/messages"), params: params)
        return response as? ChatMessageList
    }
}
