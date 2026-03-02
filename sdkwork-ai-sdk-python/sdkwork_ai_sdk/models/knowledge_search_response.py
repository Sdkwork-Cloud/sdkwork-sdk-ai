from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class KnowledgeSearchResponse:
    """知识检索响应"""
    results: List[SearchResult] = None
    total: int = None
