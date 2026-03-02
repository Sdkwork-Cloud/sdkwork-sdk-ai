from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RunListResponse:
    """OpenAI run list response"""
    object: str = None
    data: List[RunResponse] = None
    has_more: bool = None
    first_id: str = None
    last_id: str = None
