from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RunStepResponse:
    """OpenAI run step object"""
    id: str = None
    object: str = None
    type: str = None
    status: str = None
    metadata: Dict[str, str] = None
    created_at: int = None
    assistant_id: str = None
    thread_id: str = None
    run_id: str = None
    step_details: Any = None
    last_error: Any = None
    expired_at: int = None
    cancelled_at: int = None
    failed_at: int = None
    completed_at: int = None
