import Foundation

public class FileApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// List files
    public func listFiles(params: [String: Any]? = nil) async throws -> OpenAiFileList? {
        let response = try await client.get(ApiPaths.aiPath("/files"), params: params)
        return response as? OpenAiFileList
    }

    /// Upload file
    public func upload(body: UploadFileRequest? = nil, params: [String: Any]? = nil) async throws -> OpenAiFileObject? {
        let response = try await client.post(ApiPaths.aiPath("/files"), body: body, params: params, headers: nil, contentType: "multipart/form-data")
        return response as? OpenAiFileObject
    }

    /// Retrieve file content
    public func retrieveFileContent(file_id: String) async throws -> String? {
        let response = try await client.get(ApiPaths.aiPath("/files/\(file_id)/content"))
        return response as? String
    }

    /// Retrieve file
    public func retrieve(file_id: String) async throws -> OpenAiFileObject? {
        let response = try await client.get(ApiPaths.aiPath("/files/\(file_id)"))
        return response as? OpenAiFileObject
    }

    /// Delete file
    public func deleteFile(file_id: String) async throws -> OpenAiFileDeleteResponse? {
        let response = try await client.delete(ApiPaths.aiPath("/files/\(file_id)"))
        return response as? OpenAiFileDeleteResponse
    }
}
