from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RunStepListResponse:
    """OpenAI run step list response"""
    object: str = None
    data: List[RunStepResponse] = None
    has_more: bool = None
    first_id: str = None
    last_id: str = None
