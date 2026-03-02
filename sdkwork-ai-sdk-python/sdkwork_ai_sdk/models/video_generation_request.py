from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoGenerationRequest:
    """Video generation request"""
    prompt: str
    model: str = None
    seconds: str = None
    size: str = None
    quality: str = None
    user: str = None
    negative_prompt: str = None
    image_urls: List[str] = None
