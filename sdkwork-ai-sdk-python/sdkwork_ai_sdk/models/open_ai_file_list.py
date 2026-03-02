from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OpenAiFileList:
    """OpenAI标准文件列表对象"""
    data: List[OpenAiFileObject] = None
    object: str = None
    first_id: str = None
    last_id: str = None
    has_more: bool = None
