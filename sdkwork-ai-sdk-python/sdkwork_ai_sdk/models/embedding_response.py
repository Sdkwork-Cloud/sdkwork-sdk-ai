from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class EmbeddingResponse:
    """OpenAI标准嵌入响应"""
    object: str = None
    data: List[Embedding] = None
    model: str = None
    usage: Usage = None
