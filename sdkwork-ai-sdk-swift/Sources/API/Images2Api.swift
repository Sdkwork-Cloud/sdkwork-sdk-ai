import Foundation

public class Images2Api {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Create image variation
    public func createImageVariation(body: CreateImageVariationPostRequest? = nil, params: [String: Any]? = nil) async throws -> ImageGenerationResponse? {
        let response = try await client.post(ApiPaths.aiPath("/v1/images/variations"), body: body, params: params, headers: nil, contentType: "multipart/form-data")
        return response as? ImageGenerationResponse
    }

    /// Create image
    public func createImage(body: ImageGenerationRequest) async throws -> ImageGenerationResponse? {
        let response = try await client.post(ApiPaths.aiPath("/v1/images/generations"), body: body)
        return response as? ImageGenerationResponse
    }

    /// Create image edit
    public func createImageEdit(body: CreateImageEditRequest? = nil, params: [String: Any]? = nil) async throws -> ImageGenerationResponse? {
        let response = try await client.post(ApiPaths.aiPath("/v1/images/edits"), body: body, params: params, headers: nil, contentType: "multipart/form-data")
        return response as? ImageGenerationResponse
    }
}
