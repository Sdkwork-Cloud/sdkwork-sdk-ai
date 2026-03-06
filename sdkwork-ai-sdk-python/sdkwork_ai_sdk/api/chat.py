from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatCompletionDeleteResponse, ChatCompletionList, ChatCompletionRequest, ChatCompletionResponse, ChatMessageList, CountClaudeTokensRequest, CountClaudeTokensResponse, CreateChatCompletionPostResponse, CreateClaudeMessagePostRequest, CreateClaudeMessagePostResponse, UpdateCompletionPatchRequest, UpdateCompletionRequest

class ChatApi:
    """Chat API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_completion(self, completion_id: str) -> ChatCompletionResponse:
        """Get chat completion"""
        return self._client.get(f"/ai/v3/v1/chat/completions/{completion_id}")

    def create_update_completion(self, completion_id: str, body: UpdateCompletionRequest) -> ChatCompletionResponse:
        """Update chat completion"""
        return self._client.post(f"/ai/v3/v1/chat/completions/{completion_id}", json=body)

    def delete_completion(self, completion_id: str) -> ChatCompletionDeleteResponse:
        """Delete chat completion"""
        return self._client.delete(f"/ai/v3/v1/chat/completions/{completion_id}")

    def patch_update_completion(self, completion_id: str, body: UpdateCompletionPatchRequest) -> ChatCompletionResponse:
        """Update chat completion"""
        return self._client.patch(f"/ai/v3/v1/chat/completions/{completion_id}", json=body)

    def count_claude_tokens(self, body: CountClaudeTokensRequest) -> CountClaudeTokensResponse:
        """Count Claude tokens"""
        return self._client.post(f"/ai/v3/v1/messages/count_tokens", json=body)

    def create_claude_message(self, body: CreateClaudeMessagePostRequest, headers: Optional[Dict[str, str]] = None) -> CreateClaudeMessagePostResponse:
        """Create Claude message"""
        return self._client.post(f"/ai/v3/v1/messages", json=body, headers=headers)

    def list_completions(self, params: Optional[Dict[str, Any]] = None) -> ChatCompletionList:
        """List chat completions"""
        return self._client.get(f"/ai/v3/v1/chat/completions", params=params)

    def create_chat_completion(self, body: ChatCompletionRequest) -> CreateChatCompletionPostResponse:
        """Create chat completion"""
        return self._client.post(f"/ai/v3/v1/chat/completions", json=body)

    def get_messages(self, completion_id: str, params: Optional[Dict[str, Any]] = None) -> ChatMessageList:
        """Get chat completion messages"""
        return self._client.get(f"/ai/v3/v1/chat/completions/{completion_id}/messages", params=params)
