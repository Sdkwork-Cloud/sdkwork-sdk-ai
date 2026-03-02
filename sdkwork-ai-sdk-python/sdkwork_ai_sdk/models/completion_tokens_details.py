from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CompletionTokensDetails:
    """输出token详情"""
    reasoning_tokens: int = None
    audio_tokens: int = None
    accepted_prediction_tokens: int = None
    rejected_prediction_tokens: int = None
