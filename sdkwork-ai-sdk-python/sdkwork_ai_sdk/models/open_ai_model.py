from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OpenAiModel:
    id: str = None
    object: str = None
    created: int = None
    owned_by: str = None
