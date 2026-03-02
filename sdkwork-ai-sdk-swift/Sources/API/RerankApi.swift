import Foundation

public class RerankApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Rerank documents
    public func rerank(body: RerankRequest) async throws -> RerankResponse? {
        let response = try await client.post(ApiPaths.aiPath("/rerank"), body: body)
        return response as? RerankResponse
    }
}
