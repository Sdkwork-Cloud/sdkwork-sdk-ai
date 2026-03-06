from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CancelResponsePostResponse, CreateResponseRequest, CreateResponseResponse, DeleteResponseResponse, GetResponseResponse, ListResponseInputItemsResponse

class Responses2Api:
    """Responses API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def cancel_response(self, response_id: str) -> CancelResponsePostResponse:
        """Cancel response"""
        return self._client.post(f"/ai/v3/v1/responses/{response_id}/cancel")

    def create_response(self, body: CreateResponseRequest) -> CreateResponseResponse:
        """Create response"""
        return self._client.post(f"/ai/v3/v1/responses", json=body)

    def list_response_input_items(self, response_id: str) -> ListResponseInputItemsResponse:
        """List response input items"""
        return self._client.get(f"/ai/v3/v1/responses/{response_id}/input_items")

    def get_response(self, response_id: str) -> GetResponseResponse:
        """Get response"""
        return self._client.get(f"/ai/v3/v1/responses/{response_id}")

    def delete_response(self, response_id: str) -> DeleteResponseResponse:
        """Delete response"""
        return self._client.delete(f"/ai/v3/v1/responses/{response_id}")
