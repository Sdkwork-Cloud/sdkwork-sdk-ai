from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ThreadDeleteResponse:
    """OpenAI thread delete response"""
    id: str = None
    object: str = None
    deleted: bool = None
