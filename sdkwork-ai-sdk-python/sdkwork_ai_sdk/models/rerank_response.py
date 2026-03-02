from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RerankResponse:
    """重排响应"""
    id: str = None
    object: str = None
    model: str = None
    results: List[Result] = None
    usage: Usage = None
