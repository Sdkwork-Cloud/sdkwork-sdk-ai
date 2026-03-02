from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SunoMusicDeleteResponse:
    id: str = None
    object: str = None
    deleted: bool = None
