from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatCompletionList:
    """OpenAI标准聊天完成列表"""
    object: str = None
    data: List[ChatCompletionResponse] = None
    has_more: bool = None
    first_id: str = None
    last_id: str = None
