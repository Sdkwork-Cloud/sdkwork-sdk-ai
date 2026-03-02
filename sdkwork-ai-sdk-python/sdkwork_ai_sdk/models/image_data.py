from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageData:
    url: str = None
    b64_json: str = None
    revised_prompt: str = None
