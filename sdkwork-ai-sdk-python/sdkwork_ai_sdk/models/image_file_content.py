from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageFileContent:
    """Image file payload"""
    file_id: str = None
