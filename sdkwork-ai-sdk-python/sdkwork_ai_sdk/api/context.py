from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatWithContextRequest, ContextCreateRequest, ContextResponse

class ContextApi:
    """context API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def chat_with(self, contextId: str, body: ChatWithContextRequest) -> ContextResponse:
        """Chat with context"""
        return self._client.post(f"/ai/v3/context/{contextId}/chat/completions", json=body)

    def create_context(self, body: ContextCreateRequest) -> ContextResponse:
        """Create context"""
        return self._client.post(f"/ai/v3/context/create", json=body)

    def get_context(self, contextId: str) -> ContextResponse:
        """Get context"""
        return self._client.get(f"/ai/v3/context/{contextId}")

    def delete_context(self, contextId: str) -> None:
        """Delete context"""
        return self._client.delete(f"/ai/v3/context/{contextId}")
