from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MusicError:
    """音乐错误详情"""
    code: str = None
    message: str = None
