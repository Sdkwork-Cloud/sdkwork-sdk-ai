from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Content:
    """内容对数概率"""
    token: str = None
    logprob: float = None
    bytes: List[int] = None
    top_logprobs: List[TopLogprob] = None
