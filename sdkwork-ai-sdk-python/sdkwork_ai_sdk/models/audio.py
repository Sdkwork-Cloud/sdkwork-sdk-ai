from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Audio:
    """Audio response data"""
    id: str = None
    data: str = None
    transcript: str = None
    expires_at: int = None
