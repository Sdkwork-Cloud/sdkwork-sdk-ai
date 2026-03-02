from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OpenAiFileObject:
    """OpenAI标准文件对象"""
    id: str = None
    object: str = None
    bytes: int = None
    filename: str = None
    purpose: str = None
    status: str = None
    deleted: bool = None
    created_at: int = None
    expires_at: int = None
    status_details: str = None
