from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultListLabelOption

class I18nResourceApi:
    """i-18n-resource-controller API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_options(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListLabelOption:
        return self._client.get(f"/ai/v3/v1/open/i18n/options", params=params)

    def create_options(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListLabelOption:
        return self._client.post(f"/ai/v3/v1/open/i18n/options", params=params)
