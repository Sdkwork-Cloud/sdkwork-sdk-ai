from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UploadFilePostRequest:
    file: str
