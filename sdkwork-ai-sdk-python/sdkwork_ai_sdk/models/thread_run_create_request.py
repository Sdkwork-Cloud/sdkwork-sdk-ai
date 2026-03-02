from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ThreadRunCreateRequest:
    """Thread and run creation request"""
    model: str = None
    instructions: str = None
    tools: List[Any] = None
    metadata: Dict[str, str] = None
    temperature: float = None
    stream: bool = None
    thread: ThreadCreateRequest = None
    assistant_id: str
    additional_instructions: str = None
    additional_messages: List[Dict[str, Any]] = None
    tool_resources: Dict[str, Any] = None
    top_p: float = None
    max_prompt_tokens: int = None
    max_completion_tokens: int = None
    truncation_strategy: TruncationStrategy = None
