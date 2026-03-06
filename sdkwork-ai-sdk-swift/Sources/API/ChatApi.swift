import Foundation

public class ChatApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Get chat completion
    public func getCompletion(completion_id: String) async throws -> ChatCompletionResponse? {
        let response = try await client.get(ApiPaths.aiPath("/v1/chat/completions/\(completion_id)"))
        return response as? ChatCompletionResponse
    }

    /// Update chat completion
    public func createUpdateCompletion(completion_id: String, body: UpdateCompletionRequest) async throws -> ChatCompletionResponse? {
        let response = try await client.post(ApiPaths.aiPath("/v1/chat/completions/\(completion_id)"), body: body)
        return response as? ChatCompletionResponse
    }

    /// Delete chat completion
    public func deleteCompletion(completion_id: String) async throws -> ChatCompletionDeleteResponse? {
        let response = try await client.delete(ApiPaths.aiPath("/v1/chat/completions/\(completion_id)"))
        return response as? ChatCompletionDeleteResponse
    }

    /// Update chat completion
    public func patchUpdateCompletion(completion_id: String, body: UpdateCompletionPatchRequest) async throws -> ChatCompletionResponse? {
        let response = try await client.patch(ApiPaths.aiPath("/v1/chat/completions/\(completion_id)"), body: body)
        return response as? ChatCompletionResponse
    }

    /// Count Claude tokens
    public func countClaudeTokens(body: CountClaudeTokensRequest) async throws -> CountClaudeTokensResponse? {
        let response = try await client.post(ApiPaths.aiPath("/v1/messages/count_tokens"), body: body)
        return response as? CountClaudeTokensResponse
    }

    /// Create Claude message
    public func createClaudeMessage(body: CreateClaudeMessagePostRequest, headers: [String: String]? = nil) async throws -> CreateClaudeMessagePostResponse? {
        let response = try await client.post(ApiPaths.aiPath("/v1/messages"), body: body, params: nil, headers: headers)
        return response as? CreateClaudeMessagePostResponse
    }

    /// List chat completions
    public func listCompletions(params: [String: Any]? = nil) async throws -> ChatCompletionList? {
        let response = try await client.get(ApiPaths.aiPath("/v1/chat/completions"), params: params)
        return response as? ChatCompletionList
    }

    /// Create chat completion
    public func createChatCompletion(body: ChatCompletionRequest) async throws -> CreateChatCompletionPostResponse? {
        let response = try await client.post(ApiPaths.aiPath("/v1/chat/completions"), body: body)
        return response as? CreateChatCompletionPostResponse
    }

    /// Get chat completion messages
    public func getMessages(completion_id: String, params: [String: Any]? = nil) async throws -> ChatMessageList? {
        let response = try await client.get(ApiPaths.aiPath("/v1/chat/completions/\(completion_id)/messages"), params: params)
        return response as? ChatMessageList
    }
}
