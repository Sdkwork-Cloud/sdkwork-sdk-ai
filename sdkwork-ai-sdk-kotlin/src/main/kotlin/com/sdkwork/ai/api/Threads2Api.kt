package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class Threads2Api(private val client: HttpClient) {

    /** Submit tool outputs */
    suspend fun submitToolOutputs(thread_id: String, run_id: String, body: SubmitToolOutputsPostRequest): SubmitToolOutputsPostResponse? {
        return client.post(ApiPaths.aiPath("/threads/$thread_id/runs/$run_id/submit_tool_outputs"), body) as? SubmitToolOutputsPostResponse
    }

    /** Cancel run */
    suspend fun cancelRun(thread_id: String, run_id: String): RunResponse? {
        return client.post(ApiPaths.aiPath("/threads/$thread_id/runs/$run_id/cancel"), null) as? RunResponse
    }

    /** Get run */
    suspend fun getRun(thread_id: String, run_id: String): RunResponse? {
        return client.get(ApiPaths.aiPath("/threads/$thread_id/runs/$run_id")) as? RunResponse
    }

    /** Modify run */
    suspend fun updateRun(thread_id: String, run_id: String, body: UpdateRunRequest): RunResponse? {
        return client.post(ApiPaths.aiPath("/threads/$thread_id/runs/$run_id"), body) as? RunResponse
    }

    /** List runs */
    suspend fun listRuns(thread_id: String, params: Map<String, Any>? = null): RunListResponse? {
        return client.get(ApiPaths.aiPath("/threads/$thread_id/runs"), params) as? RunListResponse
    }

    /** Create run */
    suspend fun createRun(thread_id: String, body: RunCreateRequest): CreateRunPostResponse? {
        return client.post(ApiPaths.aiPath("/threads/$thread_id/runs"), body) as? CreateRunPostResponse
    }

    /** Get thread message */
    suspend fun getThreadMessage(thread_id: String, message_id: String): ThreadMessageResponse? {
        return client.get(ApiPaths.aiPath("/threads/$thread_id/messages/$message_id")) as? ThreadMessageResponse
    }

    /** Modify thread message */
    suspend fun updateThreadMessage(thread_id: String, message_id: String, body: ThreadMessageModifyRequest): ThreadMessageResponse? {
        return client.post(ApiPaths.aiPath("/threads/$thread_id/messages/$message_id"), body) as? ThreadMessageResponse
    }

    /** List thread messages */
    suspend fun listThreadMessages(thread_id: String, params: Map<String, Any>? = null): ThreadMessageListResponse? {
        return client.get(ApiPaths.aiPath("/threads/$thread_id/messages"), params) as? ThreadMessageListResponse
    }

    /** Create thread message */
    suspend fun createThreadMessage(thread_id: String, body: ThreadMessageCreateRequest): ThreadMessageResponse? {
        return client.post(ApiPaths.aiPath("/threads/$thread_id/messages"), body) as? ThreadMessageResponse
    }

    /** Get thread */
    suspend fun getThread(thread_id: String): ThreadResponse? {
        return client.get(ApiPaths.aiPath("/threads/$thread_id")) as? ThreadResponse
    }

    /** Update thread */
    suspend fun updateThread(thread_id: String, body: ThreadCreateRequest): ThreadResponse? {
        return client.post(ApiPaths.aiPath("/threads/$thread_id"), body) as? ThreadResponse
    }

    /** Delete thread */
    suspend fun deleteThread(thread_id: String): ThreadDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/threads/$thread_id")) as? ThreadDeleteResponse
    }

    /** Create thread and run */
    suspend fun createThreadAndRun(body: ThreadRunCreateRequest): CreateThreadAndRunResponse? {
        return client.post(ApiPaths.aiPath("/threads/runs"), body) as? CreateThreadAndRunResponse
    }

    /** Create thread */
    suspend fun createThread(body: ThreadCreateRequest): ThreadResponse? {
        return client.post(ApiPaths.aiPath("/threads"), body) as? ThreadResponse
    }

    /** Get run step */
    suspend fun getRunStep(thread_id: String, run_id: String, step_id: String): RunStepResponse? {
        return client.get(ApiPaths.aiPath("/threads/$thread_id/runs/$run_id/steps/$step_id")) as? RunStepResponse
    }

    /** List run steps */
    suspend fun listRunSteps(thread_id: String, run_id: String, params: Map<String, Any>? = null): RunStepListResponse? {
        return client.get(ApiPaths.aiPath("/threads/$thread_id/runs/$run_id/steps"), params) as? RunStepListResponse
    }
}
