import Foundation

public class Models2Api {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Retrieve model
    public func retrieveModel(model: String) async throws -> OpenAiModel? {
        let response = try await client.get(ApiPaths.aiPath("/v1/models/\(model)"))
        return response as? OpenAiModel
    }

    /// Delete model
    public func deleteModel(model: String) async throws -> OpenAiModelDeleteResponse? {
        let response = try await client.delete(ApiPaths.aiPath("/v1/models/\(model)"))
        return response as? OpenAiModelDeleteResponse
    }

    /// List models
    public func listModels() async throws -> OpenAiModelList? {
        let response = try await client.get(ApiPaths.aiPath("/v1/models"))
        return response as? OpenAiModelList
    }
}
