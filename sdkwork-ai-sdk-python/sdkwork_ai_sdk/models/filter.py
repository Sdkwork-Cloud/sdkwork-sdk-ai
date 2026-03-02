from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Filter:
    """过滤条件"""
    field: str = None
    op: str = None
    value: Any = None
