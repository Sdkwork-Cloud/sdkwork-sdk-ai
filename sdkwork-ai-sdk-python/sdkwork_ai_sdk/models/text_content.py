from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TextContent:
    """Text content payload"""
    value: str = None
    annotations: List[Any] = None
