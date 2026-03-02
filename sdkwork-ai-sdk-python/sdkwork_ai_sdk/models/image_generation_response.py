from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageGenerationResponse:
    created: int = None
    data: List[ImageData] = None
