import Foundation

public class KnowledgeBaseApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// List documents
    public func listDocuments(knowledge_base_id: String, params: [String: Any]? = nil) async throws -> ListDocumentsGetResponse? {
        let response = try await client.get(ApiPaths.aiPath("/knowledge-bases/\(knowledge_base_id)/documents"), params: params)
        return response as? ListDocumentsGetResponse
    }

    /// Add document
    public func addDocument(knowledge_base_id: String, body: DocumentAddRequest) async throws -> DocumentResponse? {
        let response = try await client.post(ApiPaths.aiPath("/knowledge-bases/\(knowledge_base_id)/documents"), body: body)
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
    public func getDocument(knowledge_base_id: String, document_id: String) async throws -> DocumentResponse? {
        let response = try await client.get(ApiPaths.aiPath("/knowledge-bases/\(knowledge_base_id)/documents/\(document_id)"))
        return response as? DocumentResponse
    }

    /// Delete document
    public func deleteDocument(knowledge_base_id: String, document_id: String) async throws -> Void {
        _ = try await client.delete(ApiPaths.aiPath("/knowledge-bases/\(knowledge_base_id)/documents/\(document_id)"))
    }

    /// Get knowledge base
    public func getKnowledgeBase(knowledge_base_id: String) async throws -> KnowledgeBaseResponse? {
        let response = try await client.get(ApiPaths.aiPath("/knowledge-bases/\(knowledge_base_id)"))
        return response as? KnowledgeBaseResponse
    }

    /// Delete knowledge base
    public func deleteKnowledgeBase(knowledge_base_id: String) async throws -> Void {
        _ = try await client.delete(ApiPaths.aiPath("/knowledge-bases/\(knowledge_base_id)"))
    }
}
