from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Categories:
    """Categories"""
    hate: bool = None
    sexual: bool = None
    violence: bool = None
    hate/threatening: bool = None
    self_harm: bool = None
    sexual/minors: bool = None
    violence/graphic: bool = None
    illegal_act: bool = None
    illegal_act/instruction: bool = None
