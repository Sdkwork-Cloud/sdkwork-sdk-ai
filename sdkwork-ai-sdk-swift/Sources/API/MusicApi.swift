import Foundation

public class MusicApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Generate music
    public func generate(body: MusicGenerationRequest) async throws -> SunoMusic? {
        let response = try await client.post(ApiPaths.aiPath("/v1/music/generations"), body: body)
        return response as? SunoMusic
    }

    /// Retrieve music
    public func retrieve(musicId: String) async throws -> SunoMusic? {
        let response = try await client.get(ApiPaths.aiPath("/v1/music/\(musicId)"))
        return response as? SunoMusic
    }

    /// Delete music
    public func deleteMusic(musicId: String) async throws -> SunoMusicDeleteResponse? {
        let response = try await client.delete(ApiPaths.aiPath("/v1/music/\(musicId)"))
        return response as? SunoMusicDeleteResponse
    }

    /// List music
    public func listMusic(params: [String: Any]? = nil) async throws -> SunoMusicList? {
        let response = try await client.get(ApiPaths.aiPath("/v1/music"), params: params)
        return response as? SunoMusicList
    }
}
