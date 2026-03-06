from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import AssistantCreateRequest, AssistantDeleteResponse, AssistantListResponse, AssistantResponse

class AssistantsApi:
    """Assistants API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_assistant(self, assistant_id: str) -> AssistantResponse:
        """Get assistant"""
        return self._client.get(f"/ai/v3/v1/assistants/{assistant_id}")

    def update_assistant(self, assistant_id: str, body: AssistantCreateRequest) -> AssistantResponse:
        """Update assistant"""
        return self._client.post(f"/ai/v3/v1/assistants/{assistant_id}", json=body)

    def delete_assistant(self, assistant_id: str) -> AssistantDeleteResponse:
        """Delete assistant"""
        return self._client.delete(f"/ai/v3/v1/assistants/{assistant_id}")

    def list_assistants(self, params: Optional[Dict[str, Any]] = None) -> AssistantListResponse:
        """List assistants"""
        return self._client.get(f"/ai/v3/v1/assistants", params=params)

    def create_assistant(self, body: AssistantCreateRequest) -> AssistantResponse:
        """Create assistant"""
        return self._client.post(f"/ai/v3/v1/assistants", json=body)
