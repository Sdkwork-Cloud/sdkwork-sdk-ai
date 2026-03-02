from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DocumentResponse:
    """文档响应"""
    title: str = None
    type: str = None
    status: str = None
    metadata: Dict[str, Any] = None
    document_id: str = None
    knowledge_base_id: str = None
    chunk_count: int = None
    created_at: int = None
    updated_at: int = None
