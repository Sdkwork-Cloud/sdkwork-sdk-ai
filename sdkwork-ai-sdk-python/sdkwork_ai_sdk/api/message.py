from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CountClaudeTokensPostRequest, CountClaudeTokensPostResponse, CreateClaudeMessageRequest, CreateClaudeMessageResponse

class MessageApi:
    """message API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def count_claude_tokens(self, body: CountClaudeTokensPostRequest) -> CountClaudeTokensPostResponse:
        """Count Claude tokens"""
        return self._client.post(f"/ai/v3/messages/count_tokens", json=body)

    def create_claude(self, body: CreateClaudeMessageRequest, headers: Optional[Dict[str, str]] = None) -> CreateClaudeMessageResponse:
        """Create Claude message"""
        return self._client.post(f"/ai/v3/messages", json=body, headers=headers)
