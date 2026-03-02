import Foundation

public class ImagesApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Create image variation
    public func createImageVariation(body: ImageGenerationRequest) async throws -> ImageGenerationResponse? {
        let response = try await client.post(ApiPaths.aiPath("/images/variations"), body: body)
        return response as? ImageGenerationResponse
    }

    /// Create image
    public func createImage(body: ImageGenerationRequest) async throws -> ImageGenerationResponse? {
        let response = try await client.post(ApiPaths.aiPath("/images/generations"), body: body)
        return response as? ImageGenerationResponse
    }

    /// Create image edit
    public func createImageEdit(body: ImageGenerationRequest) async throws -> ImageGenerationResponse? {
        let response = try await client.post(ApiPaths.aiPath("/images/edits"), body: body)
        return response as? ImageGenerationResponse
    }
}
