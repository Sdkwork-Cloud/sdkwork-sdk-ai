import Foundation

public class ContextApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Chat with context
    public func chatWith(contextId: String, body: ChatWithContextRequest) async throws -> ContextResponse? {
        let response = try await client.post(ApiPaths.aiPath("/context/\(contextId)/chat/completions"), body: body)
        return response as? ContextResponse
    }

    /// Create context
    public func createContext(body: ContextCreateRequest) async throws -> ContextResponse? {
        let response = try await client.post(ApiPaths.aiPath("/context/create"), body: body)
        return response as? ContextResponse
    }

    /// Get context
    public func getContext(contextId: String) async throws -> ContextResponse? {
        let response = try await client.get(ApiPaths.aiPath("/context/\(contextId)"))
        return response as? ContextResponse
    }

    /// Delete context
    public func deleteContext(contextId: String) async throws -> Void {
        _ = try await client.delete(ApiPaths.aiPath("/context/\(contextId)"))
    }
}
