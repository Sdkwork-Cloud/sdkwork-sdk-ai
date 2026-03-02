from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SpeechRequest:
    """Speech request"""
    model: str = None
    input: str = None
    voice: str = None
    speed: float = None
    extra: Dict[str, Any] = None
    response_format: str = None
