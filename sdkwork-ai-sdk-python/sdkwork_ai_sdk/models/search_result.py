from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SearchResult:
    """检索结果"""
    content: str = None
    score: float = None
    metadata: Dict[str, Any] = None
    document_id: str = None
    chunk_id: str = None
