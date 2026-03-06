import Foundation

public class Files2Api {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// List files
    public func listFiles(params: [String: Any]? = nil) async throws -> OpenAiFileList? {
        let response = try await client.get(ApiPaths.aiPath("/v1/files"), params: params)
        return response as? OpenAiFileList
    }

    /// Upload file
    public func uploadFile(body: UploadFilePostRequest? = nil, params: [String: Any]? = nil) async throws -> OpenAiFileObject? {
        let response = try await client.post(ApiPaths.aiPath("/v1/files"), body: body, params: params, headers: nil, contentType: "multipart/form-data")
        return response as? OpenAiFileObject
    }

    /// Retrieve file content
    public func retrieveFileContent(fileId: String) async throws -> String? {
        let response = try await client.get(ApiPaths.aiPath("/v1/files/\(fileId)/content"))
        return response as? String
    }

    /// Retrieve file
    public func retrieveFile(fileId: String) async throws -> OpenAiFileObject? {
        let response = try await client.get(ApiPaths.aiPath("/v1/files/\(fileId)"))
        return response as? OpenAiFileObject
    }

    /// Delete file
    public func deleteFile(fileId: String) async throws -> OpenAiFileDeleteResponse? {
        let response = try await client.delete(ApiPaths.aiPath("/v1/files/\(fileId)"))
        return response as? OpenAiFileDeleteResponse
    }
}
