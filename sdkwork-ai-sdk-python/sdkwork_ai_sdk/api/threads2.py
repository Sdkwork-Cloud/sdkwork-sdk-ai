from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CreateRunPostResponse, CreateThreadAndRunResponse, RunCreateRequest, RunListResponse, RunResponse, RunStepListResponse, RunStepResponse, SubmitToolOutputsPostRequest, SubmitToolOutputsPostResponse, ThreadCreateRequest, ThreadDeleteResponse, ThreadMessageCreateRequest, ThreadMessageListResponse, ThreadMessageModifyRequest, ThreadMessageResponse, ThreadResponse, ThreadRunCreateRequest, UpdateRunRequest

class Threads2Api:
    """threads API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def submit_tool_outputs(self, thread_id: str, run_id: str, body: SubmitToolOutputsPostRequest) -> SubmitToolOutputsPostResponse:
        """Submit tool outputs"""
        return self._client.post(f"/ai/v3/threads/{thread_id}/runs/{run_id}/submit_tool_outputs", json=body)

    def cancel_run(self, thread_id: str, run_id: str) -> RunResponse:
        """Cancel run"""
        return self._client.post(f"/ai/v3/threads/{thread_id}/runs/{run_id}/cancel")

    def get_run(self, thread_id: str, run_id: str) -> RunResponse:
        """Get run"""
        return self._client.get(f"/ai/v3/threads/{thread_id}/runs/{run_id}")

    def update_run(self, thread_id: str, run_id: str, body: UpdateRunRequest) -> RunResponse:
        """Modify run"""
        return self._client.post(f"/ai/v3/threads/{thread_id}/runs/{run_id}", json=body)

    def list_runs(self, thread_id: str, params: Optional[Dict[str, Any]] = None) -> RunListResponse:
        """List runs"""
        return self._client.get(f"/ai/v3/threads/{thread_id}/runs", params=params)

    def create_run(self, thread_id: str, body: RunCreateRequest) -> CreateRunPostResponse:
        """Create run"""
        return self._client.post(f"/ai/v3/threads/{thread_id}/runs", json=body)

    def get_thread_message(self, thread_id: str, message_id: str) -> ThreadMessageResponse:
        """Get thread message"""
        return self._client.get(f"/ai/v3/threads/{thread_id}/messages/{message_id}")

    def update_thread_message(self, thread_id: str, message_id: str, body: ThreadMessageModifyRequest) -> ThreadMessageResponse:
        """Modify thread message"""
        return self._client.post(f"/ai/v3/threads/{thread_id}/messages/{message_id}", json=body)

    def list_thread_messages(self, thread_id: str, params: Optional[Dict[str, Any]] = None) -> ThreadMessageListResponse:
        """List thread messages"""
        return self._client.get(f"/ai/v3/threads/{thread_id}/messages", params=params)

    def create_thread_message(self, thread_id: str, body: ThreadMessageCreateRequest) -> ThreadMessageResponse:
        """Create thread message"""
        return self._client.post(f"/ai/v3/threads/{thread_id}/messages", json=body)

    def get_thread(self, thread_id: str) -> ThreadResponse:
        """Get thread"""
        return self._client.get(f"/ai/v3/threads/{thread_id}")

    def update_thread(self, thread_id: str, body: ThreadCreateRequest) -> ThreadResponse:
        """Update thread"""
        return self._client.post(f"/ai/v3/threads/{thread_id}", json=body)

    def delete_thread(self, thread_id: str) -> ThreadDeleteResponse:
        """Delete thread"""
        return self._client.delete(f"/ai/v3/threads/{thread_id}")

    def create_thread_and_run(self, body: ThreadRunCreateRequest) -> CreateThreadAndRunResponse:
        """Create thread and run"""
        return self._client.post(f"/ai/v3/threads/runs", json=body)

    def create_thread(self, body: ThreadCreateRequest) -> ThreadResponse:
        """Create thread"""
        return self._client.post(f"/ai/v3/threads", json=body)

    def get_run_step(self, thread_id: str, run_id: str, step_id: str) -> RunStepResponse:
        """Get run step"""
        return self._client.get(f"/ai/v3/threads/{thread_id}/runs/{run_id}/steps/{step_id}")

    def list_run_steps(self, thread_id: str, run_id: str, params: Optional[Dict[str, Any]] = None) -> RunStepListResponse:
        """List run steps"""
        return self._client.get(f"/ai/v3/threads/{thread_id}/runs/{run_id}/steps", params=params)
