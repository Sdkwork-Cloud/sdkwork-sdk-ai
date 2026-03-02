from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Logprobs:
    """对数概率"""
    content: List[Content] = None
    refusal: List[Content] = None
