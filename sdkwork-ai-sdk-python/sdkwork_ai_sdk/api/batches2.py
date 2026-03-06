from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import BatchCreateRequest, BatchListResponse, BatchResponse

class Batches2Api:
    """Batches API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def cancel_batch(self, batch_id: str) -> BatchResponse:
        """Cancel batch"""
        return self._client.post(f"/ai/v3/v1/batches/{batch_id}/cancel")

    def list_batches(self, params: Optional[Dict[str, Any]] = None) -> BatchListResponse:
        """List batches"""
        return self._client.get(f"/ai/v3/v1/batches", params=params)

    def create_batch(self, body: BatchCreateRequest) -> BatchResponse:
        """Create batch"""
        return self._client.post(f"/ai/v3/v1/batches", json=body)

    def get_batch(self, batch_id: str) -> BatchResponse:
        """Get batch"""
        return self._client.get(f"/ai/v3/v1/batches/{batch_id}")
