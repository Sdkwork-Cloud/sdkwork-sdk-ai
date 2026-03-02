from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatCompletionDeleteResponse:
    """OpenAI标准聊天完成删除响应"""
    id: str = None
    object: str = None
    deleted: bool = None
