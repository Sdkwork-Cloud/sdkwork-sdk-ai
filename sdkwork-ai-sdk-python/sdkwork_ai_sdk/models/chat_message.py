from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatMessage:
    """OpenAI标准聊天消息"""
    role: str = None
    content: Any = None
    name: str = None
    refusal: str = None
    audio: Audio = None
    annotations: List[Annotation] = None
    tool_calls: List[ToolCall] = None
    tool_call_id: str = None
