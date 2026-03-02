from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LastError:
    """最后错误"""
    code: str = None
    message: str = None
