import Foundation

public class Responses2Api {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Cancel response
    public func cancelResponse(response_id: String) async throws -> CancelResponsePostResponse? {
        let response = try await client.post(ApiPaths.aiPath("/v1/responses/\(response_id)/cancel"), body: nil)
        return response as? CancelResponsePostResponse
    }

    /// Create response
    public func createResponse(body: CreateResponseRequest) async throws -> CreateResponseResponse? {
        let response = try await client.post(ApiPaths.aiPath("/v1/responses"), body: body)
        return response as? CreateResponseResponse
    }

    /// List response input items
    public func listResponseInputItems(response_id: String) async throws -> ListResponseInputItemsResponse? {
        let response = try await client.get(ApiPaths.aiPath("/v1/responses/\(response_id)/input_items"))
        return response as? ListResponseInputItemsResponse
    }

    /// Get response
    public func getResponse(response_id: String) async throws -> GetResponseResponse? {
        let response = try await client.get(ApiPaths.aiPath("/v1/responses/\(response_id)"))
        return response as? GetResponseResponse
    }

    /// Delete response
    public func deleteResponse(response_id: String) async throws -> DeleteResponseResponse? {
        let response = try await client.delete(ApiPaths.aiPath("/v1/responses/\(response_id)"))
        return response as? DeleteResponseResponse
    }
}
