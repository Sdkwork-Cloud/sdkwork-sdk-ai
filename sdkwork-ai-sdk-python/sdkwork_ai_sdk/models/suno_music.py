from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SunoMusic:
    """Suno音乐对象"""
    id: str = None
    object: str = None
    title: str = None
    status: str = None
    duration: int = None
    tags: List[str] = None
    genre: str = None
    audio_url: str = None
    lyrics: str = None
    instrumental: bool = None
    error: MusicError = None
    created_at: int = None
    completed_at: int = None
