from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class KnowledgeBaseListResponse:
    """知识库列表响应"""
    data: List[KnowledgeBaseResponse] = None
    total: int = None
    has_more: bool = None
