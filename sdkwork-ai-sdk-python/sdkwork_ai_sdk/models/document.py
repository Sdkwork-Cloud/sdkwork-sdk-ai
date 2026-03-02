from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Document:
    """待重排文档"""
    content: str = None
    metadata: Any = None
