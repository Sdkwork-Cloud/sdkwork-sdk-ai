import '../http/client.dart';
import '../models.dart';

class ThreadsApi {
  final HttpClient _client;
  
  ThreadsApi(this._client);

  /// Submit tool outputs
  Future<SubmitToolOutputsResponse?> submitToolOutputs(String thread_id, String run_id, SubmitToolOutputsRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/threads/${thread_id}/runs/${run_id}/submit_tool_outputs'), body: body, contentType: 'application/json');
    return response is SubmitToolOutputsResponse ? response : null;
  }

  /// Cancel run
  Future<RunResponse?> cancelRun(String thread_id, String run_id) async {
    final response = await _client.post(ApiPaths.aiPath('/threads/${thread_id}/runs/${run_id}/cancel'));
    return response is RunResponse ? response : null;
  }

  /// Get run
  Future<RunResponse?> getRun(String thread_id, String run_id) async {
    final response = await _client.get(ApiPaths.aiPath('/threads/${thread_id}/runs/${run_id}'));
    return response is RunResponse ? response : null;
  }

  /// Modify run
  Future<RunResponse?> updateRun(String thread_id, String run_id, UpdateRunRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/threads/${thread_id}/runs/${run_id}'), body: body, contentType: 'application/json');
    return response is RunResponse ? response : null;
  }

  /// List runs
  Future<RunListResponse?> listRuns(String thread_id, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/threads/${thread_id}/runs'), params: params);
    return response is RunListResponse ? response : null;
  }

  /// Create run
  Future<CreateRunResponse?> createRun(String thread_id, RunCreateRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/threads/${thread_id}/runs'), body: body, contentType: 'application/json');
    return response is CreateRunResponse ? response : null;
  }

  /// Get thread message
  Future<ThreadMessageResponse?> getThreadMessage(String thread_id, String message_id) async {
    final response = await _client.get(ApiPaths.aiPath('/threads/${thread_id}/messages/${message_id}'));
    return response is ThreadMessageResponse ? response : null;
  }

  /// Modify thread message
  Future<ThreadMessageResponse?> updateThreadMessage(String thread_id, String message_id, ThreadMessageModifyRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/threads/${thread_id}/messages/${message_id}'), body: body, contentType: 'application/json');
    return response is ThreadMessageResponse ? response : null;
  }

  /// List thread messages
  Future<ThreadMessageListResponse?> listThreadMessages(String thread_id, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/threads/${thread_id}/messages'), params: params);
    return response is ThreadMessageListResponse ? response : null;
  }

  /// Create thread message
  Future<ThreadMessageResponse?> createThreadMessage(String thread_id, ThreadMessageCreateRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/threads/${thread_id}/messages'), body: body, contentType: 'application/json');
    return response is ThreadMessageResponse ? response : null;
  }

  /// Get thread
  Future<ThreadResponse?> getThread(String thread_id) async {
    final response = await _client.get(ApiPaths.aiPath('/threads/${thread_id}'));
    return response is ThreadResponse ? response : null;
  }

  /// Update thread
  Future<ThreadResponse?> updateThread(String thread_id, ThreadCreateRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/threads/${thread_id}'), body: body, contentType: 'application/json');
    return response is ThreadResponse ? response : null;
  }

  /// Delete thread
  Future<ThreadDeleteResponse?> deleteThread(String thread_id) async {
    final response = await _client.delete(ApiPaths.aiPath('/threads/${thread_id}'));
    return response is ThreadDeleteResponse ? response : null;
  }

  /// Create thread and run
  Future<CreateThreadAndRunResponse?> createThreadAndRun(ThreadRunCreateRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/threads/runs'), body: body, contentType: 'application/json');
    return response is CreateThreadAndRunResponse ? response : null;
  }

  /// Create thread
  Future<ThreadResponse?> createThread(ThreadCreateRequest body) async {
    final response = await _client.post(ApiPaths.aiPath('/threads'), body: body, contentType: 'application/json');
    return response is ThreadResponse ? response : null;
  }

  /// Get run step
  Future<RunStepResponse?> getRunStep(String thread_id, String run_id, String step_id) async {
    final response = await _client.get(ApiPaths.aiPath('/threads/${thread_id}/runs/${run_id}/steps/${step_id}'));
    return response is RunStepResponse ? response : null;
  }

  /// List run steps
  Future<RunStepListResponse?> listRunSteps(String thread_id, String run_id, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.aiPath('/threads/${thread_id}/runs/${run_id}/steps'), params: params);
    return response is RunStepListResponse ? response : null;
  }
}
