from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContextResponse:
    """上下文缓存响应"""
    id: str = None
    object: str = None
    created: int = None
    model: str = None
    mode: str = None
    ttl: int = None
    truncation_strategy: TruncationStrategy = None
    usage: Usage = None
