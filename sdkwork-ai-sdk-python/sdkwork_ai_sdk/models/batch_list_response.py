from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BatchListResponse:
    """OpenAI batch list response"""
    object: str = None
    data: List[BatchResponse] = None
    has_more: bool = None
    first_id: str = None
    last_id: str = None
