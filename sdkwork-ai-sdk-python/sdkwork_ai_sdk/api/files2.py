from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import OpenAiFileDeleteResponse, OpenAiFileList, OpenAiFileObject, UploadFilePostRequest

class Files2Api:
    """Files API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def list_files(self, params: Optional[Dict[str, Any]] = None) -> OpenAiFileList:
        """List files"""
        return self._client.get(f"/ai/v3/v1/files", params=params)

    def upload_file(self, body: Optional[UploadFilePostRequest] = None, params: Optional[Dict[str, Any]] = None) -> OpenAiFileObject:
        """Upload file"""
        return self._client.post(f"/ai/v3/v1/files", data=body, params=params)

    def retrieve_file_content(self, fileId: str) -> str:
        """Retrieve file content"""
        return self._client.get(f"/ai/v3/v1/files/{fileId}/content")

    def retrieve_file(self, fileId: str) -> OpenAiFileObject:
        """Retrieve file"""
        return self._client.get(f"/ai/v3/v1/files/{fileId}")

    def delete_file(self, fileId: str) -> OpenAiFileDeleteResponse:
        """Delete file"""
        return self._client.delete(f"/ai/v3/v1/files/{fileId}")
