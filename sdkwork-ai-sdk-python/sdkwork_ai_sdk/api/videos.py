from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import OpenAiVideo, OpenAiVideoDeleteResponse, OpenAiVideoList, VideoGenerationRequest

class VideosApi:
    """videos API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def list_videos(self, params: Optional[Dict[str, Any]] = None) -> OpenAiVideoList:
        """List videos"""
        return self._client.get(f"/ai/v3/videos", params=params)

    def create_video(self, body: VideoGenerationRequest) -> OpenAiVideo:
        """Create video"""
        return self._client.post(f"/ai/v3/videos", json=body)

    def retrieve_video(self, videoId: str) -> OpenAiVideo:
        """Retrieve video"""
        return self._client.get(f"/ai/v3/videos/{videoId}")

    def delete_video(self, videoId: str) -> OpenAiVideoDeleteResponse:
        """Delete video"""
        return self._client.delete(f"/ai/v3/videos/{videoId}")
