from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import EmbeddingRequest, EmbeddingResponse

class Embeddings2Api:
    """embeddings API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_embedding(self, body: EmbeddingRequest) -> EmbeddingResponse:
        """Create embeddings"""
        return self._client.post(f"/ai/v3/embeddings", json=body)
