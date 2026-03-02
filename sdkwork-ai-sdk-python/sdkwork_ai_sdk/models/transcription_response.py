from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TranscriptionResponse:
    text: str = None
    task: str = None
    language: str = None
    duration: float = None
    words: List[Word] = None
    segments: List[Segment] = None
