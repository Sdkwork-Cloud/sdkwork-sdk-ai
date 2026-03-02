from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Tool:
    """工具定义"""
    type: str = None
    function: Function = None
