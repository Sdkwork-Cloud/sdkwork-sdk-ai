from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ModerationRequest, ModerationResponse

class Moderations2Api:
    """moderations API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_moderation(self, body: ModerationRequest) -> ModerationResponse:
        """Create moderation"""
        return self._client.post(f"/ai/v3/moderations", json=body)
