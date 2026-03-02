from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OpenAiVideo:
    """OpenAI标准视频对象"""
    id: str = None
    object: str = None
    model: str = None
    status: str = None
    progress: int = None
    prompt: str = None
    seconds: str = None
    size: str = None
    quality: str = None
    error: VideoError = None
    created_at: int = None
    completed_at: int = None
    expires_at: int = None
    output_url: str = None
    remixed_from_video_id: str = None
