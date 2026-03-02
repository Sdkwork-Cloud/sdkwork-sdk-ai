from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ResponseFormat:
    """响应格式配置"""
    type: str = None
    json_schema: JsonSchema = None
