from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import OpenAiFileDeleteResponse, OpenAiFileList, OpenAiFileObject, UploadFileRequest

class FileApi:
    """file API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def list_files(self, params: Optional[Dict[str, Any]] = None) -> OpenAiFileList:
        """List files"""
        return self._client.get(f"/ai/v3/files", params=params)

    def upload(self, body: Optional[UploadFileRequest] = None, params: Optional[Dict[str, Any]] = None) -> OpenAiFileObject:
        """Upload file"""
        return self._client.post(f"/ai/v3/files", data=body, params=params)

    def retrieve_file_content(self, file_id: str) -> str:
        """Retrieve file content"""
        return self._client.get(f"/ai/v3/files/{file_id}/content")

    def retrieve(self, file_id: str) -> OpenAiFileObject:
        """Retrieve file"""
        return self._client.get(f"/ai/v3/files/{file_id}")

    def delete_file(self, file_id: str) -> OpenAiFileDeleteResponse:
        """Delete file"""
        return self._client.delete(f"/ai/v3/files/{file_id}")
