import Foundation

public class MusicApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Generate music
    public func createGenerate(body: MusicGenerationRequest) async throws -> SunoMusic? {
        let response = try await client.post(ApiPaths.aiPath("/v1/music/generations"), body: body)
        return response as? SunoMusic
    }

    /// List music
    public func listMusic(params: [String: Any]? = nil) async throws -> SunoMusicList? {
        let response = try await client.get(ApiPaths.aiPath("/music"), params: params)
        return response as? SunoMusicList
    }

    /// Generate music
    public func createGenerateMusic(body: MusicGenerationRequest) async throws -> SunoMusic? {
        let response = try await client.post(ApiPaths.aiPath("/music"), body: body)
        return response as? SunoMusic
    }

    /// Generate music
    public func createGenerateGenerations(body: MusicGenerationRequest) async throws -> SunoMusic? {
        let response = try await client.post(ApiPaths.aiPath("/music/generations"), body: body)
        return response as? SunoMusic
    }

    /// Retrieve music
    public func retrieve(music_id: String) async throws -> SunoMusic? {
        let response = try await client.get(ApiPaths.aiPath("/music/\(music_id)"))
        return response as? SunoMusic
    }

    /// Delete music
    public func deleteMusic(music_id: String) async throws -> SunoMusicDeleteResponse? {
        let response = try await client.delete(ApiPaths.aiPath("/music/\(music_id)"))
        return response as? SunoMusicDeleteResponse
    }
}
