from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OpenAiVideoList:
    object: str = None
    data: List[OpenAiVideo] = None
