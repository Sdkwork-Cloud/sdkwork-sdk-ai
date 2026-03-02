from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ThreadMessageResponse:
    """OpenAI thread message object"""
    id: str = None
    object: str = None
    role: str = None
    status: str = None
    content: List[ContentBlock] = None
    metadata: Dict[str, str] = None
    created_at: int = None
    thread_id: str = None
    incomplete_details: Any = None
    completed_at: int = None
    incomplete_at: int = None
    assistant_id: str = None
    run_id: str = None
    file_ids: List[str] = None
