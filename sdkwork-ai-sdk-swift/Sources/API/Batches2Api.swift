import Foundation

public class Batches2Api {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Cancel batch
    public func cancelBatch(batch_id: String) async throws -> BatchResponse? {
        let response = try await client.post(ApiPaths.aiPath("/v1/batches/\(batch_id)/cancel"), body: nil)
        return response as? BatchResponse
    }

    /// List batches
    public func listBatches(params: [String: Any]? = nil) async throws -> BatchListResponse? {
        let response = try await client.get(ApiPaths.aiPath("/v1/batches"), params: params)
        return response as? BatchListResponse
    }

    /// Create batch
    public func createBatch(body: BatchCreateRequest) async throws -> BatchResponse? {
        let response = try await client.post(ApiPaths.aiPath("/v1/batches"), body: body)
        return response as? BatchResponse
    }

    /// Get batch
    public func getBatch(batch_id: String) async throws -> BatchResponse? {
        let response = try await client.get(ApiPaths.aiPath("/v1/batches/\(batch_id)"))
        return response as? BatchResponse
    }
}
