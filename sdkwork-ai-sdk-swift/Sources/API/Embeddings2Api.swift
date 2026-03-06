import Foundation

public class Embeddings2Api {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Create embeddings
    public func createEmbedding(body: EmbeddingRequest) async throws -> EmbeddingResponse? {
        let response = try await client.post(ApiPaths.aiPath("/embeddings"), body: body)
        return response as? EmbeddingResponse
    }
}
