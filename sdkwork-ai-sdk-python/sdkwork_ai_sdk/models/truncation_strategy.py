from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TruncationStrategy:
    """截断策略"""
    type: str = None
    last_messages: int = None
