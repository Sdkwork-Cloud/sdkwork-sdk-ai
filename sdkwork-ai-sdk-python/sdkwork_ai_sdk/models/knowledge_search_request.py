from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class KnowledgeSearchRequest:
    """Search request"""
    query: str
    filters: List[Filter] = None
    knowledge_base_id: str
    top_k: int = None
    score_threshold: float = None
