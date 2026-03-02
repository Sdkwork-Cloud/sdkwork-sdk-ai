from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContentBlock:
    """Message content block"""
    type: str = None
    text: TextContent = None
    image_file: ImageFileContent = None
