from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SunoMusicList:
    """Suno音乐列表对象"""
    object: str = None
    data: List[SunoMusic] = None
