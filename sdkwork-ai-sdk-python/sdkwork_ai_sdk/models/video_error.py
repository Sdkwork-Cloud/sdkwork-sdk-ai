from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoError:
    """Video error details"""
    code: str = None
    message: str = None
    type: str = None
    param: str = None
