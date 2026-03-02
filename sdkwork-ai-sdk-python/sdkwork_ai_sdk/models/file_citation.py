from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FileCitation:
    """File citation"""
    file_id: str = None
    quote: str = None
