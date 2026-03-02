from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Segment:
    id: int = None
    seek: int = None
    start: float = None
    end: float = None
    text: str = None
    tokens: List[int] = None
    temperature: float = None
    avg_logprob: float = None
    compression_ratio: float = None
    no_speech_prob: float = None
