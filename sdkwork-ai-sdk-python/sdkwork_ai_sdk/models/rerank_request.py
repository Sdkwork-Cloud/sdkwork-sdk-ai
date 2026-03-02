from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RerankRequest:
    """Rerank request"""
    query: str
    documents: List[Document]
    model: str = None
    top_n: int = None
    return_documents: bool = None
