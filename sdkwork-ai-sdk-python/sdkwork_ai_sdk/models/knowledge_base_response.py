from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class KnowledgeBaseResponse:
    """知识库响应"""
    name: str = None
    description: str = None
    status: str = None
    knowledge_base_id: str = None
    embedding_model_id: str = None
    index_type: str = None
    created_at: int = None
    updated_at: int = None
    doc_count: int = None
