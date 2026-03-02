from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SubmitToolOutputs:
    """提交工具输出"""
    tool_calls: List[ToolCall] = None
