from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CreateImageEditRequest, CreateImageVariationPostRequest, ImageGenerationRequest, ImageGenerationResponse

class Images2Api:
    """Images API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_image_variation(self, body: Optional[CreateImageVariationPostRequest] = None, params: Optional[Dict[str, Any]] = None) -> ImageGenerationResponse:
        """Create image variation"""
        return self._client.post(f"/ai/v3/v1/images/variations", data=body, params=params)

    def create_image(self, body: ImageGenerationRequest) -> ImageGenerationResponse:
        """Create image"""
        return self._client.post(f"/ai/v3/v1/images/generations", json=body)

    def create_image_edit(self, body: Optional[CreateImageEditRequest] = None, params: Optional[Dict[str, Any]] = None) -> ImageGenerationResponse:
        """Create image edit"""
        return self._client.post(f"/ai/v3/v1/images/edits", data=body, params=params)
