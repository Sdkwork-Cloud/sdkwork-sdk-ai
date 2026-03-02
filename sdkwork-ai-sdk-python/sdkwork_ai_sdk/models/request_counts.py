from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RequestCounts:
    """请求统计"""
    total: int = None
    completed: int = None
    failed: int = None
