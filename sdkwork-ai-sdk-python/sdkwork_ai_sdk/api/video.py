from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import OpenAiVideo, OpenAiVideoDeleteResponse, OpenAiVideoList, VideoGenerationRequest

class VideoApi:
    """video API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def list_videos(self, params: Optional[Dict[str, Any]] = None) -> OpenAiVideoList:
        """List videos"""
        return self._client.get(f"/ai/v3/videos", params=params)

    def create_video(self, body: VideoGenerationRequest) -> OpenAiVideo:
        """Create video"""
        return self._client.post(f"/ai/v3/videos", json=body)

    def create_video_generations(self, body: VideoGenerationRequest) -> OpenAiVideo:
        """Create video"""
        return self._client.post(f"/ai/v3/videos/generations", json=body)

    def create_video_generations2(self, body: VideoGenerationRequest) -> OpenAiVideo:
        """Create video"""
        return self._client.post(f"/ai/v3/v1/videos/generations", json=body)

    def retrieve(self, video_id: str) -> OpenAiVideo:
        """Retrieve video"""
        return self._client.get(f"/ai/v3/videos/{video_id}")

    def delete_video(self, video_id: str) -> OpenAiVideoDeleteResponse:
        """Delete video"""
        return self._client.delete(f"/ai/v3/videos/{video_id}")
