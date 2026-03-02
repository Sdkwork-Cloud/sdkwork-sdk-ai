from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BatchResponse:
    """批量任务响应"""
    id: str = None
    object: str = None
    endpoint: str = None
    errors: Errors = None
    status: str = None
    metadata: Dict[str, str] = None
    input_file_id: str = None
    output_file_id: str = None
    error_file_id: str = None
    created_at: int = None
    completion_window: str = None
    expires_at: int = None
    started_at: int = None
    completed_at: int = None
    failed_at: int = None
    expired_at: int = None
    cancelled_at: int = None
    request_counts: RequestCounts = None
