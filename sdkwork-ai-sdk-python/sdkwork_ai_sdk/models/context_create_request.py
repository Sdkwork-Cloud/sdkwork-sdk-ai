from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContextCreateRequest:
    """Context creation request"""
    model: str
    messages: List[ContextMessage]
    mode: str = None
    ttl: int = None
    truncation_strategy: TruncationStrategy = None
