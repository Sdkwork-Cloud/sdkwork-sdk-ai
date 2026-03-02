from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageGenerationRequest:
    """Image edit request"""
    model: str = None
    prompt: str = None
    n: int = None
    quality: str = None
    size: str = None
    style: str = None
    user: str = None
    image: List[str] = None
    extra: Dict[str, Any] = None
    response_format: str = None
