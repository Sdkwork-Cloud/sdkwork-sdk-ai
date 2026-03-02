from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatCompletionRequest:
    """Chat completion request"""
    model: str
    messages: List[ChatMessage]
    temperature: float = None
    n: int = None
    stream: bool = None
    stop: List[str] = None
    user: str = None
    tools: List[Tool] = None
    tool_choice: Any = None
    seed: float = None
    stream_options: StreamOptions = None
    modalities: List[str] = None
    audio: AudioParameters = None
    store: bool = None
    metadata: Dict[str, str] = None
    thinking: Thinking = None
    top_p: float = None
    max_tokens: int = None
    max_completion_tokens: int = None
    presence_penalty: float = None
    frequency_penalty: float = None
    logit_bias: Dict[str, int] = None
    response_format: ResponseFormat = None
    service_tier: str = None
    reasoning_effort: str = None
    parallel_tool_calls: bool = None
    logprobs: bool = None
    top_logprobs: int = None
