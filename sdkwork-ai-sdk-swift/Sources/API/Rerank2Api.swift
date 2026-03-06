import Foundation

public class Rerank2Api {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Rerank documents
    public func rerank(body: RerankRequest) async throws -> RerankResponse? {
        let response = try await client.post(ApiPaths.aiPath("/v1/rerank"), body: body)
        return response as? RerankResponse
    }
}
