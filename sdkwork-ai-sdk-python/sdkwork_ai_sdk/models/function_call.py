from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FunctionCall:
    """函数调用"""
    name: str = None
    arguments: str = None
