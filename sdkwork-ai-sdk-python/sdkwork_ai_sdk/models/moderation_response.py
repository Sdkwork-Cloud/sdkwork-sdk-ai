from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ModerationResponse:
    """OpenAI标准审核响应"""
    id: str = None
    model: str = None
    results: List[ModerationResult] = None
