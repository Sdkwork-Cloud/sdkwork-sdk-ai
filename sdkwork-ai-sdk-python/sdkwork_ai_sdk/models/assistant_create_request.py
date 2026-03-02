from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AssistantCreateRequest:
    """Assistant creation request"""
    model: str
    name: str = None
    description: str = None
    instructions: str = None
    tools: List[Tool] = None
    metadata: Dict[str, str] = None
    temperature: float = None
    tool_resources: Dict[str, Any] = None
    response_format: ResponseFormat = None
    top_p: float = None
