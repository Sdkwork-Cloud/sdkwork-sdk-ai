import Foundation

public class ModerationsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Create moderation
    public func createModeration(body: ModerationRequest) async throws -> ModerationResponse? {
        let response = try await client.post(ApiPaths.aiPath("/v1/moderations"), body: body)
        return response as? ModerationResponse
    }
}
