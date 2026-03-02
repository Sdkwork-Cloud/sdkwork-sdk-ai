from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OpenAiFileDeleteResponse:
    id: str = None
    object: str = None
    deleted: bool = None
