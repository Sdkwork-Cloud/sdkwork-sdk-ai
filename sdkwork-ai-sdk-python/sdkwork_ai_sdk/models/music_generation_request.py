from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MusicGenerationRequest:
    """Music generation request"""
    model: str
    prompt: str
    negative_prompt: str = None
    duration: int = None
    format: str = None
    n: int = None
    reference_audio: str = None
    style: str = None
    metadata: Dict[str, str] = None
    response_format: str = None
