from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AudioParameters:
    """音频参数"""
    voice: str = None
    format: str = None
