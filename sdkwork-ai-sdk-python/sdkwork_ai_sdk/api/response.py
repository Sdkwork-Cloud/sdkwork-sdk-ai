from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CancelResponseResponse, CreateResponsePostRequest, CreateResponsePostResponse, DeleteResponseDeleteResponse, GetResponseGetResponse, ListResponseInputItemsGetResponse

class ResponseApi:
    """response API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def cancel(self, response_id: str) -> CancelResponseResponse:
        """Cancel response"""
        return self._client.post(f"/ai/v3/responses/{response_id}/cancel")

    def create_response(self, body: CreateResponsePostRequest) -> CreateResponsePostResponse:
        """Create response"""
        return self._client.post(f"/ai/v3/responses", json=body)

    def list_response_input_items(self, response_id: str) -> ListResponseInputItemsGetResponse:
        """List response input items"""
        return self._client.get(f"/ai/v3/responses/{response_id}/input_items")

    def get_response(self, response_id: str) -> GetResponseGetResponse:
        """Get response"""
        return self._client.get(f"/ai/v3/responses/{response_id}")

    def delete_response(self, response_id: str) -> DeleteResponseDeleteResponse:
        """Delete response"""
        return self._client.delete(f"/ai/v3/responses/{response_id}")
