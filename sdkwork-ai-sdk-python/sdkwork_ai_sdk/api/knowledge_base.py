from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import DocumentAddRequest, DocumentResponse, KnowledgeBaseCreateRequest, KnowledgeBaseListResponse, KnowledgeBaseResponse, KnowledgeSearchRequest, KnowledgeSearchResponse, ListDocumentsGetResponse

class KnowledgeBaseApi:
    """knowledge_base API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def list_documents(self, knowledge_base_id: str, params: Optional[Dict[str, Any]] = None) -> ListDocumentsGetResponse:
        """List documents"""
        return self._client.get(f"/ai/v3/knowledge-bases/{knowledge_base_id}/documents", params=params)

    def add_document(self, knowledge_base_id: str, body: DocumentAddRequest) -> DocumentResponse:
        """Add document"""
        return self._client.post(f"/ai/v3/knowledge-bases/{knowledge_base_id}/documents", json=body)

    def search_knowledge(self, body: KnowledgeSearchRequest) -> KnowledgeSearchResponse:
        """Search knowledge"""
        return self._client.post(f"/ai/v3/knowledge-bases/search", json=body)

    def list_knowledge_bases(self, params: Optional[Dict[str, Any]] = None) -> KnowledgeBaseListResponse:
        """List knowledge bases"""
        return self._client.get(f"/ai/v3/knowledge-bases", params=params)

    def create_knowledge_base(self, body: KnowledgeBaseCreateRequest) -> KnowledgeBaseResponse:
        """Create knowledge base"""
        return self._client.post(f"/ai/v3/knowledge-bases", json=body)

    def get_document(self, knowledge_base_id: str, document_id: str) -> DocumentResponse:
        """Get document"""
        return self._client.get(f"/ai/v3/knowledge-bases/{knowledge_base_id}/documents/{document_id}")

    def delete_document(self, knowledge_base_id: str, document_id: str) -> None:
        """Delete document"""
        return self._client.delete(f"/ai/v3/knowledge-bases/{knowledge_base_id}/documents/{document_id}")

    def get_knowledge_base(self, knowledge_base_id: str) -> KnowledgeBaseResponse:
        """Get knowledge base"""
        return self._client.get(f"/ai/v3/knowledge-bases/{knowledge_base_id}")

    def delete_knowledge_base(self, knowledge_base_id: str) -> None:
        """Delete knowledge base"""
        return self._client.delete(f"/ai/v3/knowledge-bases/{knowledge_base_id}")
