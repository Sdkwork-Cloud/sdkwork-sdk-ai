from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DocumentAddRequest:
    """Document add request"""
    content: str
    title: str = None
    type: str = None
    metadata: Dict[str, Any] = None
    chunk_config: ChunkConfig = None
    knowledge_base_id: str
