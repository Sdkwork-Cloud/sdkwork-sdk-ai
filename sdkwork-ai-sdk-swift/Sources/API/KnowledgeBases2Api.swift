import Foundation

public class KnowledgeBases2Api {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// List documents
    public func listDocuments(knowledgeBaseId: String, params: [String: Any]? = nil) async throws -> ListDocumentsGetResponse? {
        let response = try await client.get(ApiPaths.aiPath("/knowledge-bases/\(knowledgeBaseId)/documents"), params: params)
        return response as? ListDocumentsGetResponse
    }

    /// Add document
    public func addDocument(knowledgeBaseId: String, body: DocumentAddRequest) async throws -> DocumentResponse? {
        let response = try await client.post(ApiPaths.aiPath("/knowledge-bases/\(knowledgeBaseId)/documents"), body: body)
        return response as? DocumentResponse
    }

    /// Search knowledge
    public func searchKnowledge(body: KnowledgeSearchRequest) async throws -> KnowledgeSearchResponse? {
        let response = try await client.post(ApiPaths.aiPath("/knowledge-bases/search"), body: body)
        return response as? KnowledgeSearchResponse
    }

    /// List knowledge bases
    public func listKnowledgeBases(params: [String: Any]? = nil) async throws -> KnowledgeBaseListResponse? {
        let response = try await client.get(ApiPaths.aiPath("/knowledge-bases"), params: params)
        return response as? KnowledgeBaseListResponse
    }

    /// Create knowledge base
    public func createKnowledgeBase(body: KnowledgeBaseCreateRequest) async throws -> KnowledgeBaseResponse? {
        let response = try await client.post(ApiPaths.aiPath("/knowledge-bases"), body: body)
        return response as? KnowledgeBaseResponse
    }

    /// Get document
    public func getDocument(knowledgeBaseId: String, documentId: String) async throws -> DocumentResponse? {
        let response = try await client.get(ApiPaths.aiPath("/knowledge-bases/\(knowledgeBaseId)/documents/\(documentId)"))
        return response as? DocumentResponse
    }

    /// Delete document
    public func deleteDocument(knowledgeBaseId: String, documentId: String) async throws -> Void {
        _ = try await client.delete(ApiPaths.aiPath("/knowledge-bases/\(knowledgeBaseId)/documents/\(documentId)"))
    }

    /// Get knowledge base
    public func getKnowledgeBase(knowledgeBaseId: String) async throws -> KnowledgeBaseResponse? {
        let response = try await client.get(ApiPaths.aiPath("/knowledge-bases/\(knowledgeBaseId)"))
        return response as? KnowledgeBaseResponse
    }

    /// Delete knowledge base
    public func deleteKnowledgeBase(knowledgeBaseId: String) async throws -> Void {
        _ = try await client.delete(ApiPaths.aiPath("/knowledge-bases/\(knowledgeBaseId)"))
    }
}
