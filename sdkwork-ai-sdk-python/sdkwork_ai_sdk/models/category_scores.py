from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CategoryScores:
    """Category scores"""
    hate: float = None
    sexual: float = None
    violence: float = None
    hate/threatening: float = None
    self_harm: float = None
    sexual/minors: float = None
    violence/graphic: float = None
    illegal_act: float = None
    illegal_act/instruction: float = None
