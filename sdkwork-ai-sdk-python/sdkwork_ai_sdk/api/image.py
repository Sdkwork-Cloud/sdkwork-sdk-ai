from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CreateImageEditPostRequest, CreateImageVariationRequest, ImageGenerationRequest, ImageGenerationResponse

class ImageApi:
    """image API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_image_variation(self, body: Optional[CreateImageVariationRequest] = None, params: Optional[Dict[str, Any]] = None) -> ImageGenerationResponse:
        """Create image variation"""
        return self._client.post(f"/ai/v3/images/variations", data=body, params=params)

    def create_image(self, body: ImageGenerationRequest) -> ImageGenerationResponse:
        """Create image"""
        return self._client.post(f"/ai/v3/images", json=body)

    def create_image_generations(self, body: ImageGenerationRequest) -> ImageGenerationResponse:
        """Create image"""
        return self._client.post(f"/ai/v3/images/generations", json=body)

    def create_image_edit(self, body: Optional[CreateImageEditPostRequest] = None, params: Optional[Dict[str, Any]] = None) -> ImageGenerationResponse:
        """Create image edit"""
        return self._client.post(f"/ai/v3/images/edits", data=body, params=params)
