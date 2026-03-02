from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Annotation:
    """Annotation"""
    type: str = None
    text: str = None
    file_citation: FileCitation = None
