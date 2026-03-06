from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import DocumentAddRequest, DocumentResponse, KnowledgeBaseCreateRequest, KnowledgeBaseListResponse, KnowledgeBaseResponse, KnowledgeSearchRequest, KnowledgeSearchResponse, ListDocumentsResponse

class KnowledgeBasesApi:
    """Knowledge Bases API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def list_documents(self, knowledgeBaseId: str, params: Optional[Dict[str, Any]] = None) -> ListDocumentsResponse:
        """List documents"""
        return self._client.get(f"/ai/v3/v1/knowledge-bases/{knowledgeBaseId}/documents", params=params)

    def add_document(self, knowledgeBaseId: str, body: DocumentAddRequest) -> DocumentResponse:
        """Add document"""
        return self._client.post(f"/ai/v3/v1/knowledge-bases/{knowledgeBaseId}/documents", json=body)

    def search_knowledge(self, body: KnowledgeSearchRequest) -> KnowledgeSearchResponse:
        """Search knowledge"""
        return self._client.post(f"/ai/v3/v1/knowledge-bases/search", json=body)

    def list_knowledge_bases(self, params: Optional[Dict[str, Any]] = None) -> KnowledgeBaseListResponse:
        """List knowledge bases"""
        return self._client.get(f"/ai/v3/v1/knowledge-bases", params=params)

    def create_knowledge_base(self, body: KnowledgeBaseCreateRequest) -> KnowledgeBaseResponse:
        """Create knowledge base"""
        return self._client.post(f"/ai/v3/v1/knowledge-bases", json=body)

    def get_document(self, knowledgeBaseId: str, documentId: str) -> DocumentResponse:
        """Get document"""
        return self._client.get(f"/ai/v3/v1/knowledge-bases/{knowledgeBaseId}/documents/{documentId}")

    def delete_document(self, knowledgeBaseId: str, documentId: str) -> None:
        """Delete document"""
        return self._client.delete(f"/ai/v3/v1/knowledge-bases/{knowledgeBaseId}/documents/{documentId}")

    def get_knowledge_base(self, knowledgeBaseId: str) -> KnowledgeBaseResponse:
        """Get knowledge base"""
        return self._client.get(f"/ai/v3/v1/knowledge-bases/{knowledgeBaseId}")

    def delete_knowledge_base(self, knowledgeBaseId: str) -> None:
        """Delete knowledge base"""
        return self._client.delete(f"/ai/v3/v1/knowledge-bases/{knowledgeBaseId}")
