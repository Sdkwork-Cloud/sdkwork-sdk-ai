from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class EmbeddingRequest:
    """Embedding request"""
    model: str = None
    input: Any = None
    dimensions: int = None
    user: str = None
    encoding_format: str = None
