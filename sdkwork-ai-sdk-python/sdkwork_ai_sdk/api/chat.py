from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatCompletionDeleteResponse, ChatCompletionList, ChatCompletionRequest, ChatCompletionResponse, ChatMessageList, CreateChatCompletionResponse, PatchUpdateCompletionRequest, UpdateChatCompletionRequest, UpdateCompletionPatchRequest, UpdateCompletionPostRequest

class ChatApi:
    """chat API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_completion(self, completion_id: str) -> ChatCompletionResponse:
        """Get chat completion"""
        return self._client.get(f"/ai/v3/chat/completions/{completion_id}")

    def create_update_completion(self, completion_id: str, body: UpdateCompletionPostRequest) -> ChatCompletionResponse:
        """Update chat completion"""
        return self._client.post(f"/ai/v3/chat/completions/{completion_id}", json=body)

    def delete_completion(self, completion_id: str) -> ChatCompletionDeleteResponse:
        """Delete chat completion"""
        return self._client.delete(f"/ai/v3/chat/completions/{completion_id}")

    def patch_update_completion(self, completion_id: str, body: UpdateCompletionPatchRequest) -> ChatCompletionResponse:
        """Update chat completion"""
        return self._client.patch(f"/ai/v3/v1/chat/completions/{completion_id}", json=body)

    def patch_update_completion_chat(self, completion_id: str, body: PatchUpdateCompletionRequest) -> ChatCompletionResponse:
        """Update chat completion"""
        return self._client.patch(f"/ai/v3/chat/completions/{completion_id}", json=body)

    def get_chat_completion(self, completion_id: str) -> ChatCompletionResponse:
        """Get chat completion"""
        return self._client.get(f"/ai/v3/management/chat/completions/{completion_id}")

    def update_chat_completion(self, completion_id: str, body: UpdateChatCompletionRequest) -> ChatCompletionResponse:
        """Update chat completion"""
        return self._client.post(f"/ai/v3/management/chat/completions/{completion_id}", json=body)

    def delete_chat_completion(self, completion_id: str) -> ChatCompletionDeleteResponse:
        """Delete chat completion"""
        return self._client.delete(f"/ai/v3/management/chat/completions/{completion_id}")

    def list_completions(self, params: Optional[Dict[str, Any]] = None) -> ChatCompletionList:
        """List chat completions"""
        return self._client.get(f"/ai/v3/chat/completions", params=params)

    def create_chat_completion(self, body: ChatCompletionRequest) -> CreateChatCompletionResponse:
        """Create chat completion"""
        return self._client.post(f"/ai/v3/chat/completions", json=body)

    def get_chat_messages(self, completion_id: str, params: Optional[Dict[str, Any]] = None) -> ChatMessageList:
        """Get chat messages"""
        return self._client.get(f"/ai/v3/management/chat/completions/{completion_id}/messages", params=params)

    def list_chat_completions(self, params: Optional[Dict[str, Any]] = None) -> ChatCompletionList:
        """List chat completions"""
        return self._client.get(f"/ai/v3/management/chat/completions", params=params)

    def get_messages(self, completion_id: str, params: Optional[Dict[str, Any]] = None) -> ChatMessageList:
        """Get chat completion messages"""
        return self._client.get(f"/ai/v3/chat/completions/{completion_id}/messages", params=params)
