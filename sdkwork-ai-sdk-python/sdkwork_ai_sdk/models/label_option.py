from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LabelOption:
    label: str = None
    value: str = None
    description: str = None
