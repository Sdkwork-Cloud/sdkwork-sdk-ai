from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class StreamOptions:
    """流式响应选项"""
    include_usage: bool = None
    chunk_include_usage: bool = None
