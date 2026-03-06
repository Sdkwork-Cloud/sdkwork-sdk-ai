import Foundation

public class Context2Api {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Chat with context
    public func chatWith(contextId: String, body: ChatWithContextPostRequest) async throws -> ContextResponse? {
        let response = try await client.post(ApiPaths.aiPath("/v1/context/\(contextId)/chat/completions"), body: body)
        return response as? ContextResponse
    }

    /// Create context
    public func createContext(body: ContextCreateRequest) async throws -> ContextResponse? {
        let response = try await client.post(ApiPaths.aiPath("/v1/context/create"), body: body)
        return response as? ContextResponse
    }

    /// Get context
    public func getContext(contextId: String) async throws -> ContextResponse? {
        let response = try await client.get(ApiPaths.aiPath("/v1/context/\(contextId)"))
        return response as? ContextResponse
    }

    /// Delete context
    public func deleteContext(contextId: String) async throws -> Void {
        _ = try await client.delete(ApiPaths.aiPath("/v1/context/\(contextId)"))
    }
}
