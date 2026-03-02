from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Word:
    word: str = None
    start: float = None
    end: float = None
