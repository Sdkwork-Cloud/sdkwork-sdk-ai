from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PromptTokensDetails:
    """输入token详情"""
    cached_tokens: int = None
    audio_tokens: int = None
