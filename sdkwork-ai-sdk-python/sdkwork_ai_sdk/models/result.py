from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Result:
    """重排结果"""
    index: int = None
    score: float = None
    document: str = None
