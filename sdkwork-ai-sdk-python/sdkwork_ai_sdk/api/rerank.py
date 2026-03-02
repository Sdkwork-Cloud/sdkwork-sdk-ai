from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import RerankRequest, RerankResponse

class RerankApi:
    """rerank API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def rerank(self, body: RerankRequest) -> RerankResponse:
        """Rerank documents"""
        return self._client.post(f"/ai/v3/rerank", json=body)
