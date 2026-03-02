from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RequiredAction:
    """所需操作"""
    type: str = None
    submit_tool_outputs: SubmitToolOutputs = None
