from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import OpenAiModel, OpenAiModelDeleteResponse, OpenAiModelList

class ModelApi:
    """model API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def retrieve(self, model: str) -> OpenAiModel:
        """Retrieve model"""
        return self._client.get(f"/ai/v3/models/{model}")

    def delete_model(self, model: str) -> OpenAiModelDeleteResponse:
        """Delete model"""
        return self._client.delete(f"/ai/v3/models/{model}")

    def list_models(self) -> OpenAiModelList:
        """List models"""
        return self._client.get(f"/ai/v3/models")
