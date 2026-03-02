from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChunkConfig:
    """切片配置"""
    separator: str = None
    chunk_size: int = None
    chunk_overlap: int = None
