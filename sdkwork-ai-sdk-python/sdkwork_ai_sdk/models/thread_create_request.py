from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ThreadCreateRequest:
    """Thread creation request"""
    messages: List[Message] = None
    metadata: Dict[str, str] = None
    tool_resources: Dict[str, Any] = None
