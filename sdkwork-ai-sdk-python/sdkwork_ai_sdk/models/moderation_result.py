from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ModerationResult:
    """Moderation result for a single input"""
    flagged: bool = None
    categories: Categories = None
    category_scores: CategoryScores = None
