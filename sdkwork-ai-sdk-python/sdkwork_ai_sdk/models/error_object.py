from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ErrorObject:
    """错误对象"""
    code: str = None
    message: str = None
    line: int = None
    param: str = None
