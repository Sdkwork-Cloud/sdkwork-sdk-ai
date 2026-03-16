import Foundation

public class ResponseApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Cancel response
    public func cancel(response_id: String) async throws -> CancelResponseResponse? {
        let response = try await client.post(ApiPaths.aiPath("/responses/\(response_id)/cancel"), body: nil)
        return response as? CancelResponseResponse
    }

    /// Create response
    public func createResponse(body: CreateResponsePostRequest) async throws -> CreateResponsePostResponse? {
        let response = try await client.post(ApiPaths.aiPath("/responses"), body: body)
        return response as? CreateResponsePostResponse
    }

    /// List response input items
    public func listResponseInputItems(response_id: String) async throws -> ListResponseInputItemsGetResponse? {
        let response = try await client.get(ApiPaths.aiPath("/responses/\(response_id)/input_items"))
        return response as? ListResponseInputItemsGetResponse
    }

    /// Get response
    public func getResponse(response_id: String) async throws -> GetResponseGetResponse? {
        let response = try await client.get(ApiPaths.aiPath("/responses/\(response_id)"))
        return response as? GetResponseGetResponse
    }

    /// Delete response
    public func deleteResponse(response_id: String) async throws -> DeleteResponseDeleteResponse? {
        let response = try await client.delete(ApiPaths.aiPath("/responses/\(response_id)"))
        return response as? DeleteResponseDeleteResponse
    }
}
