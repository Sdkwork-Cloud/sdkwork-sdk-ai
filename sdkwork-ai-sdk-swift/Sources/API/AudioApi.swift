import Foundation

public class AudioApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Create translation
    public func createTranslation(body: CreateTranslationRequest? = nil, params: [String: Any]? = nil) async throws -> TranscriptionResponse? {
        let response = try await client.post(ApiPaths.aiPath("/audio/translations"), body: body, params: params, headers: nil, contentType: "multipart/form-data")
        return response as? TranscriptionResponse
    }

    /// Create transcription
    public func createTranscription(body: CreateTranscriptionRequest? = nil, params: [String: Any]? = nil) async throws -> TranscriptionResponse? {
        let response = try await client.post(ApiPaths.aiPath("/audio/transcriptions"), body: body, params: params, headers: nil, contentType: "multipart/form-data")
        return response as? TranscriptionResponse
    }

    /// Create speech
    public func createSpeech(body: SpeechRequest) async throws -> String? {
        let response = try await client.post(ApiPaths.aiPath("/audio/speech"), body: body)
        return response as? String
    }
}
