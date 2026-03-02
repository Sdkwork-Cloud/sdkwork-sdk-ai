from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class JsonSchema:
    """JSON Schema配置"""
    name: str = None
    description: str = None
    schema: Any = None
    strict: bool = None
