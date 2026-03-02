from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AssistantResponse:
    """助手响应"""
    id: str = None
    object: str = None
    model: str = None
    name: str = None
    description: str = None
    instructions: str = None
    tools: List[Any] = None
    metadata: Dict[str, str] = None
    temperature: float = None
    created_at: int = None
    tool_resources: Dict[str, Any] = None
    response_format: Any = None
    top_p: float = None
