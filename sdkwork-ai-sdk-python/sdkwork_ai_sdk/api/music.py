from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import MusicGenerationRequest, SunoMusic, SunoMusicDeleteResponse, SunoMusicList

class MusicApi:
    """music API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_generate(self, body: MusicGenerationRequest) -> SunoMusic:
        """Generate music"""
        return self._client.post(f"/ai/v3/v1/music/generations", json=body)

    def list_music(self, params: Optional[Dict[str, Any]] = None) -> SunoMusicList:
        """List music"""
        return self._client.get(f"/ai/v3/music", params=params)

    def create_generate_music(self, body: MusicGenerationRequest) -> SunoMusic:
        """Generate music"""
        return self._client.post(f"/ai/v3/music", json=body)

    def create_generate(self, body: MusicGenerationRequest) -> SunoMusic:
        """Generate music"""
        return self._client.post(f"/ai/v3/music/generations", json=body)

    def retrieve(self, music_id: str) -> SunoMusic:
        """Retrieve music"""
        return self._client.get(f"/ai/v3/music/{music_id}")

    def delete_music(self, music_id: str) -> SunoMusicDeleteResponse:
        """Delete music"""
        return self._client.delete(f"/ai/v3/music/{music_id}")
