from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import MusicGenerationRequest, SunoMusic, SunoMusicDeleteResponse, SunoMusicList

class Music2Api:
    """music API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def generate(self, body: MusicGenerationRequest) -> SunoMusic:
        """Generate music"""
        return self._client.post(f"/ai/v3/music/generations", json=body)

    def retrieve(self, musicId: str) -> SunoMusic:
        """Retrieve music"""
        return self._client.get(f"/ai/v3/music/{musicId}")

    def delete_music(self, musicId: str) -> SunoMusicDeleteResponse:
        """Delete music"""
        return self._client.delete(f"/ai/v3/music/{musicId}")

    def list_music(self, params: Optional[Dict[str, Any]] = None) -> SunoMusicList:
        """List music"""
        return self._client.get(f"/ai/v3/music", params=params)
