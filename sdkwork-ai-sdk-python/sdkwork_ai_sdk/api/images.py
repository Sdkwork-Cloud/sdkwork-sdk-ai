from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ImageGenerationRequest, ImageGenerationResponse

class ImagesApi:
    """images API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_image_variation(self, body: ImageGenerationRequest) -> ImageGenerationResponse:
        """Create image variation"""
        return self._client.post(f"/ai/v3/images/variations", json=body)

    def create_image(self, body: ImageGenerationRequest) -> ImageGenerationResponse:
        """Create image"""
        return self._client.post(f"/ai/v3/images/generations", json=body)

    def create_image_edit(self, body: ImageGenerationRequest) -> ImageGenerationResponse:
        """Create image edit"""
        return self._client.post(f"/ai/v3/images/edits", json=body)
