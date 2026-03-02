from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ThreadMessageListResponse:
    """OpenAI thread message list response"""
    object: str = None
    data: List[ThreadMessageResponse] = None
    has_more: bool = None
    first_id: str = None
    last_id: str = None
