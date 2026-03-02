import Foundation

public class AssistantsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Get assistant
    public func getAssistant(assistant_id: String) async throws -> AssistantResponse? {
        let response = try await client.get(ApiPaths.aiPath("/assistants/\(assistant_id)"))
        return response as? AssistantResponse
    }

    /// Update assistant
    public func updateAssistant(assistant_id: String, body: AssistantCreateRequest) async throws -> AssistantResponse? {
        let response = try await client.post(ApiPaths.aiPath("/assistants/\(assistant_id)"), body: body)
        return response as? AssistantResponse
    }

    /// Delete assistant
    public func deleteAssistant(assistant_id: String) async throws -> AssistantDeleteResponse? {
        let response = try await client.delete(ApiPaths.aiPath("/assistants/\(assistant_id)"))
        return response as? AssistantDeleteResponse
    }

    /// List assistants
    public func listAssistants(params: [String: Any]? = nil) async throws -> AssistantListResponse? {
        let response = try await client.get(ApiPaths.aiPath("/assistants"), params: params)
        return response as? AssistantListResponse
    }

    /// Create assistant
    public func createAssistant(body: AssistantCreateRequest) async throws -> AssistantResponse? {
        let response = try await client.post(ApiPaths.aiPath("/assistants"), body: body)
        return response as? AssistantResponse
    }
}
