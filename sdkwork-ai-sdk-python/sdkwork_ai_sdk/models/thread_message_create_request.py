from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ThreadMessageCreateRequest:
    """Thread message request"""
    role: str = None
    content: Any = None
    attachments: List[Attachment] = None
    metadata: Dict[str, str] = None
