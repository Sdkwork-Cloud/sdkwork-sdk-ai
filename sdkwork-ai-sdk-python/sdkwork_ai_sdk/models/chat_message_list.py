from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatMessageList:
    """OpenAI标准聊天消息列表"""
    object: str = None
    data: List[ChatMessage] = None
    has_more: bool = None
    first_id: str = None
    last_id: str = None
