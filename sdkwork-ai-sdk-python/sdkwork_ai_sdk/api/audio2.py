from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CreateTranscriptionRequest, CreateTranslationPostRequest, SpeechRequest, TranscriptionResponse

class Audio2Api:
    """Audio API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_translation(self, body: Optional[CreateTranslationPostRequest] = None, params: Optional[Dict[str, Any]] = None) -> TranscriptionResponse:
        """Create translation"""
        return self._client.post(f"/ai/v3/v1/audio/translations", data=body, params=params)

    def create_transcription(self, body: Optional[CreateTranscriptionRequest] = None, params: Optional[Dict[str, Any]] = None) -> TranscriptionResponse:
        """Create transcription"""
        return self._client.post(f"/ai/v3/v1/audio/transcriptions", data=body, params=params)

    def create_speech(self, body: SpeechRequest) -> str:
        """Create speech"""
        return self._client.post(f"/ai/v3/v1/audio/speech", json=body)
