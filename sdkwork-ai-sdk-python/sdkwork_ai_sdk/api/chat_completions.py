from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatCompletionDeleteResponse, ChatCompletionList, ChatCompletionResponse, ChatMessageList, UpdateChatCompletionRequest

class ChatCompletionsApi:
    """chat_completions API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_chat_completion(self, completionId: str) -> ChatCompletionResponse:
        """Get chat completion"""
        return self._client.get(f"/ai/v3/management/chat/completions/{completionId}")

    def update_chat_completion(self, completionId: str, body: UpdateChatCompletionRequest) -> ChatCompletionResponse:
        """Update chat completion"""
        return self._client.post(f"/ai/v3/management/chat/completions/{completionId}", json=body)

    def delete_chat_completion(self, completionId: str) -> ChatCompletionDeleteResponse:
        """Delete chat completion"""
        return self._client.delete(f"/ai/v3/management/chat/completions/{completionId}")

    def get_chat_messages(self, completionId: str, params: Optional[Dict[str, Any]] = None) -> ChatMessageList:
        """Get chat messages"""
        return self._client.get(f"/ai/v3/management/chat/completions/{completionId}/messages", params=params)

    def list_chat_completions(self, params: Optional[Dict[str, Any]] = None) -> ChatCompletionList:
        """List chat completions"""
        return self._client.get(f"/ai/v3/management/chat/completions", params=params)
