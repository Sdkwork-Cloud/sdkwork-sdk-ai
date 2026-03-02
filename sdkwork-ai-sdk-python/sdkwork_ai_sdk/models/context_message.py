from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContextMessage:
    """上下文消息"""
    role: str = None
    content: str = None
    name: str = None
    tool_calls: List[ToolCall] = None
