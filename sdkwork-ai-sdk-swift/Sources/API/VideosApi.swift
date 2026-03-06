import Foundation

public class VideosApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// List videos
    public func listVideos(params: [String: Any]? = nil) async throws -> OpenAiVideoList? {
        let response = try await client.get(ApiPaths.aiPath("/videos"), params: params)
        return response as? OpenAiVideoList
    }

    /// Create video
    public func createVideo(body: VideoGenerationRequest) async throws -> OpenAiVideo? {
        let response = try await client.post(ApiPaths.aiPath("/videos"), body: body)
        return response as? OpenAiVideo
    }

    /// Retrieve video
    public func retrieveVideo(video_id: String) async throws -> OpenAiVideo? {
        let response = try await client.get(ApiPaths.aiPath("/videos/\(video_id)"))
        return response as? OpenAiVideo
    }

    /// Delete video
    public func deleteVideo(video_id: String) async throws -> OpenAiVideoDeleteResponse? {
        let response = try await client.delete(ApiPaths.aiPath("/videos/\(video_id)"))
        return response as? OpenAiVideoDeleteResponse
    }
}
