from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ToolCall:
    """工具调用"""
    id: str = None
    type: str = None
    function: FunctionCall = None
