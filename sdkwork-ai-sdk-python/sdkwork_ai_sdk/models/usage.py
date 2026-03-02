from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Usage:
    """token用量"""
    prompt_tokens: int = None
    completion_tokens: int = None
    total_tokens: int = None
    prompt_tokens_details: PromptTokensDetails = None
    completion_tokens_details: CompletionTokensDetails = None
