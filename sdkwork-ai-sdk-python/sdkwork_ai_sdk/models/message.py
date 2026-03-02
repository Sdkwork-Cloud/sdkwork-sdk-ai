from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Message:
    """消息"""
    role: str = None
    content: Any = None
    refusal: str = None
    annotations: List[Any] = None
    reasoning_content: str = None
    tool_calls: List[ToolCall] = None
