from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Errors:
    """错误信息"""
    object: ErrorObject = None
    data: Any = None
