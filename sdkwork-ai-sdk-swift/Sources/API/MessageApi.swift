import Foundation

public class MessageApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Count Claude tokens
    public func countClaudeTokens(body: CountClaudeTokensPostRequest) async throws -> CountClaudeTokensPostResponse? {
        let response = try await client.post(ApiPaths.aiPath("/messages/count_tokens"), body: body)
        return response as? CountClaudeTokensPostResponse
    }

    /// Create Claude message
    public func createClaude(body: CreateClaudeMessageRequest, headers: [String: String]? = nil) async throws -> CreateClaudeMessageResponse? {
        let response = try await client.post(ApiPaths.aiPath("/messages"), body: body, params: nil, headers: headers)
        return response as? CreateClaudeMessageResponse
    }
}
