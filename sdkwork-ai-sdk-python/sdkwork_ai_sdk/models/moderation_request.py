from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ModerationRequest:
    """Moderation request"""
    model: str = None
    input: Any = None
    user: str = None
