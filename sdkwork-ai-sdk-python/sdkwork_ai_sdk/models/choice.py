from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Choice:
    """选择项"""
    index: int = None
    message: Message = None
    logprobs: Logprobs = None
    finish_reason: str = None
    moderation_hit_type: str = None
