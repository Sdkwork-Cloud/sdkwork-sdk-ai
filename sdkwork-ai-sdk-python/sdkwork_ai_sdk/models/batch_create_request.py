from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BatchCreateRequest:
    """Batch creation request"""
    endpoint: str
    metadata: Dict[str, str] = None
    input_file_id: str
    completion_window: str = None
