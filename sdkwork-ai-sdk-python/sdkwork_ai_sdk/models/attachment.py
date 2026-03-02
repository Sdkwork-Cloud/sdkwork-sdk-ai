from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Attachment:
    """附件"""
    tools: List[Dict[str, Any]] = None
    file_id: str = None
