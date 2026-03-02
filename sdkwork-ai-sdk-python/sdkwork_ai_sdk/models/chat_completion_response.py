from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatCompletionResponse:
    """聊天完成响应"""
    id: str = None
    object: str = None
    created: int = None
    model: str = None
    choices: List[Choice] = None
    usage: Usage = None
    system_fingerprint: str = None
    service_tier: str = None
