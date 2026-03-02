from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TopLogprob:
    """最可能的token"""
    token: str = None
    logprob: float = None
    bytes: List[int] = None
