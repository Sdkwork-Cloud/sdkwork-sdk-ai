from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RunResponse:
    """运行响应"""
    id: str = None
    object: str = None
    status: str = None
    model: str = None
    instructions: str = None
    tools: List[Any] = None
    metadata: Dict[str, str] = None
    usage: Usage = None
    temperature: float = None
    created_at: int = None
    thread_id: str = None
    assistant_id: str = None
    required_action: RequiredAction = None
    last_error: LastError = None
    expires_at: int = None
    started_at: int = None
    cancelled_at: int = None
    failed_at: int = None
    completed_at: int = None
    tool_resources: Dict[str, Any] = None
    top_p: float = None
    max_prompt_tokens: int = None
    max_completion_tokens: int = None
    truncation_strategy: Any = None
