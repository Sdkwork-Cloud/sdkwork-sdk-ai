import Foundation

public class ThreadsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Submit tool outputs
    public func submitToolOutputs(thread_id: String, run_id: String, body: SubmitToolOutputsRequest) async throws -> SubmitToolOutputsResponse? {
        let response = try await client.post(ApiPaths.aiPath("/threads/\(thread_id)/runs/\(run_id)/submit_tool_outputs"), body: body)
        return response as? SubmitToolOutputsResponse
    }

    /// Cancel run
    public func cancelRun(thread_id: String, run_id: String) async throws -> RunResponse? {
        let response = try await client.post(ApiPaths.aiPath("/threads/\(thread_id)/runs/\(run_id)/cancel"), body: nil)
        return response as? RunResponse
    }

    /// Get run
    public func getRun(thread_id: String, run_id: String) async throws -> RunResponse? {
        let response = try await client.get(ApiPaths.aiPath("/threads/\(thread_id)/runs/\(run_id)"))
        return response as? RunResponse
    }

    /// Modify run
    public func updateRun(thread_id: String, run_id: String, body: UpdateRunRequest) async throws -> RunResponse? {
        let response = try await client.post(ApiPaths.aiPath("/threads/\(thread_id)/runs/\(run_id)"), body: body)
        return response as? RunResponse
    }

    /// List runs
    public func listRuns(thread_id: String, params: [String: Any]? = nil) async throws -> RunListResponse? {
        let response = try await client.get(ApiPaths.aiPath("/threads/\(thread_id)/runs"), params: params)
        return response as? RunListResponse
    }

    /// Create run
    public func createRun(thread_id: String, body: RunCreateRequest) async throws -> CreateRunResponse? {
        let response = try await client.post(ApiPaths.aiPath("/threads/\(thread_id)/runs"), body: body)
        return response as? CreateRunResponse
    }

    /// Get thread message
    public func getThreadMessage(thread_id: String, message_id: String) async throws -> ThreadMessageResponse? {
        let response = try await client.get(ApiPaths.aiPath("/threads/\(thread_id)/messages/\(message_id)"))
        return response as? ThreadMessageResponse
    }

    /// Modify thread message
    public func updateThreadMessage(thread_id: String, message_id: String, body: ThreadMessageModifyRequest) async throws -> ThreadMessageResponse? {
        let response = try await client.post(ApiPaths.aiPath("/threads/\(thread_id)/messages/\(message_id)"), body: body)
        return response as? ThreadMessageResponse
    }

    /// List thread messages
    public func listThreadMessages(thread_id: String, params: [String: Any]? = nil) async throws -> ThreadMessageListResponse? {
        let response = try await client.get(ApiPaths.aiPath("/threads/\(thread_id)/messages"), params: params)
        return response as? ThreadMessageListResponse
    }

    /// Create thread message
    public func createThreadMessage(thread_id: String, body: ThreadMessageCreateRequest) async throws -> ThreadMessageResponse? {
        let response = try await client.post(ApiPaths.aiPath("/threads/\(thread_id)/messages"), body: body)
        return response as? ThreadMessageResponse
    }

    /// Get thread
    public func getThread(thread_id: String) async throws -> ThreadResponse? {
        let response = try await client.get(ApiPaths.aiPath("/threads/\(thread_id)"))
        return response as? ThreadResponse
    }

    /// Update thread
    public func updateThread(thread_id: String, body: ThreadCreateRequest) async throws -> ThreadResponse? {
        let response = try await client.post(ApiPaths.aiPath("/threads/\(thread_id)"), body: body)
        return response as? ThreadResponse
    }

    /// Delete thread
    public func deleteThread(thread_id: String) async throws -> ThreadDeleteResponse? {
        let response = try await client.delete(ApiPaths.aiPath("/threads/\(thread_id)"))
        return response as? ThreadDeleteResponse
    }

    /// Create thread and run
    public func createThreadAndRun(body: ThreadRunCreateRequest) async throws -> CreateThreadAndRunResponse? {
        let response = try await client.post(ApiPaths.aiPath("/threads/runs"), body: body)
        return response as? CreateThreadAndRunResponse
    }

    /// Create thread
    public func createThread(body: ThreadCreateRequest) async throws -> ThreadResponse? {
        let response = try await client.post(ApiPaths.aiPath("/threads"), body: body)
        return response as? ThreadResponse
    }

    /// Get run step
    public func getRunStep(thread_id: String, run_id: String, step_id: String) async throws -> RunStepResponse? {
        let response = try await client.get(ApiPaths.aiPath("/threads/\(thread_id)/runs/\(run_id)/steps/\(step_id)"))
        return response as? RunStepResponse
    }

    /// List run steps
    public func listRunSteps(thread_id: String, run_id: String, params: [String: Any]? = nil) async throws -> RunStepListResponse? {
        let response = try await client.get(ApiPaths.aiPath("/threads/\(thread_id)/runs/\(run_id)/steps"), params: params)
        return response as? RunStepListResponse
    }
}
