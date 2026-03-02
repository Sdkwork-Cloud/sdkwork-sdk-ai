from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class KnowledgeBaseCreateRequest:
    """Knowledge base creation request"""
    name: str
    description: str = None
    extra: Dict[str, Any] = None
    embedding_model_id: str = None
    index_type: str = None
