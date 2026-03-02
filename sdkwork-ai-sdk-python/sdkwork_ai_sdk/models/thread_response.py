from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ThreadResponse:
    """线程响应"""
    id: str = None
    object: str = None
    metadata: Dict[str, str] = None
    created_at: int = None
    tool_resources: Dict[str, Any] = None
